package com.app;

public class CarTest {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.carNumber = "AP0001CT";
        firstCar.wheelDiameter=13;
        firstCar.transportCategory = "A";
        firstCar.weight = 1;

        Car secondCar = new Car();
        secondCar.carNumber = "AP0002CT";
        secondCar.wheelDiameter=15;
        secondCar.transportCategory = "B";
        secondCar.weight = 2;

        Car thirdCar = new Car();
        thirdCar.carNumber = "AP0003CT";
        thirdCar.wheelDiameter=17;
        thirdCar.transportCategory = "C";
        thirdCar.weight = 10;


        System.out.printf("firstCar: carNumber=%s, wheelDiameter=%d, transportCategory=%s, weight=%d t \n",firstCar.carNumber, firstCar.wheelDiameter, firstCar.transportCategory, firstCar.weight);
        System.out.printf("secondCar: carNumber=%s, wheelDiameter=%d, transportCategory=%s, weight=%d t \n",secondCar.carNumber, secondCar.wheelDiameter, secondCar.transportCategory, secondCar.weight);
        System.out.printf("thirdCar: carNumber=%s, wheelDiameter=%d, transportCategory=%s, weight=%d t \n",thirdCar.carNumber, thirdCar.wheelDiameter, thirdCar.transportCategory, thirdCar.weight);

    }
}
