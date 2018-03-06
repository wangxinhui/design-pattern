package com.chapter0.demo;

/**
 * @Author: by Administrator on 2018/3/6.
 */
public class CarFactory {
    public static Car productCar(String type) throws Exception {
        Car car = null;
        if (type.equalsIgnoreCase("bmw")){
            car = new BMWCar();
            return car;
        }else if (type.equalsIgnoreCase("audi")){
            car = new AudiCar();
            return car;
        }else {
            throw new Exception("sorry, the car can't built");
        }


    }
}
