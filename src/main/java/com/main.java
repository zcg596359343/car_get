package com;

import com.method.Car_Method;

class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("begin");
            Car_Method.get();
            try {
                Thread.sleep(5000);
            }catch (Exception e){

            }

        }
    }
}
