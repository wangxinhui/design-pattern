package com.chapter0.demo;

/**
 * @Author: by Administrator on 2018/3/6.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Car car ;
        car = CarFactory.productCar("123");
        car.driverCar();

    }
}
