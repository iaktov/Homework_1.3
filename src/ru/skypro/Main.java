package ru.skypro;

public class Main {

    public static void main(String[] args) {


        //Задание 1
        int clientOS = 0;

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }



        //Задание 2
        int clientOSAgain = 0;
        int years = 2014;

        if (clientOSAgain == 0){
            if (years >= 2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (years >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        //Задание 3
        int year = 2000;
        boolean leapYear = year % 4 == 0 && year % 100 != 0;
        if (leapYear || year % 400 == 0) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }

        //Задание 4
        int deliveryDistance = 91;
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays += 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        //Задание 5
        int monthNumber = 1;

        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц приндлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит сезону осень");
                break;
            default:
                System.out.println("такого месяца не существует");

        }


    }
}
