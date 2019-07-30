package com.method;

import carArchiveService.CarArchive;
import carArchiveService.CarArchiveService;
import carArchiveService.CarArchiveServiceImplService;
import com.alibaba.fastjson.JSON;
import com.dao.CarDao;
import com.entity.Car;
import net.sf.json.JSONArray;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car_Method {
    public static void get(){
        String resource = "mybatis-config.xml"; //定义配置文件路径
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);//读取配置文件
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//注册mybatis 工厂

        SqlSession sqlSession = sqlSessionFactory.openSession();//得到连接对象

        CarDao carDao=sqlSession.getMapper(CarDao.class);

        CarArchiveService carArchiveService = new CarArchiveServiceImplService().getCarArchiveServiceImplPort();
        List<CarArchive> item = carArchiveService.listAll();
        JSONArray jsonArray = JSONArray.fromObject(item);
        String []data_buy=new String[jsonArray.size()];
        String []data_register=new String[jsonArray.size()];
        String []data_newcar=new String[jsonArray.size()];
        String []data_insurance=new String[jsonArray.size()];
        String []descs=new String[jsonArray.size()];
        for (int i = 0; i <jsonArray.size() ; i++) {
            descs[i]="无";
            String year = jsonArray.getJSONObject(i).getJSONObject("buytime").get("year").toString();
            String month = jsonArray.getJSONObject(i).getJSONObject("buytime").get("month").toString();
            String day = jsonArray.getJSONObject(i).getJSONObject("buytime").get("day").toString();
            data_buy[i] = year + "-" + month + "-" + day;
            String year_r = jsonArray.getJSONObject(i).getJSONObject("registertime").get("year").toString();
            String month_r = jsonArray.getJSONObject(i).getJSONObject("registertime").get("month").toString();
            String day_r = jsonArray.getJSONObject(i).getJSONObject("registertime").get("day").toString();
            data_register[i] = year_r + "-" + month_r + "-" + day_r;
            String year_n = jsonArray.getJSONObject(i).getJSONObject("newCAi").get("year").toString();
            String month_n = jsonArray.getJSONObject(i).getJSONObject("newCAi").get("month").toString();
            String day_n = jsonArray.getJSONObject(i).getJSONObject("newCAi").get("day").toString();
            data_newcar[i] = year_n + "-" + month_n + "-" + day_n;
            String year_i = jsonArray.getJSONObject(i).getJSONObject("newInsurance").get("year").toString();
            String month_i = jsonArray.getJSONObject(i).getJSONObject("newInsurance").get("month").toString();
            String day_i = jsonArray.getJSONObject(i).getJSONObject("newInsurance").get("day").toString();
            data_insurance[i] = year_i + "-" + month_i + "-" + day_i;
            String descs1 = jsonArray.getJSONObject(i).get("descs").toString();
            Pattern pattern = Pattern.compile("[^\u4E00-\u9FA5]");
            Matcher matcher = pattern.matcher(descs1);
            descs[i]=matcher.replaceAll("");
        }
        List<Car> cars = JSON.parseArray(jsonArray.toString(), Car.class);
        int i=0;
        for (Car car : cars) {
            car.setBuytime(data_buy[i]);
            car.setRegistertime(data_register[i]);
            car.setNewCAi(data_newcar[i]);
            car.setNewInsurance(data_insurance[i]);
            car.setDescs(descs[i]);
            i++;
            carDao.get(car);
            sqlSession.commit();
        }
        sqlSession.close();
    }
}
