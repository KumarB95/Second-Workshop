package com.bridgelabz.autoShop;
//Parent class Car
class Car{
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
}
//Sub-class of Truck  to calculate sale price
class Truck extends Car{
    int weight;
    public Truck(int speed, double regularPrice, String color,int weight) {
        super(speed, regularPrice, color);
        this.weight=weight;
    }

    void getSalePrice() {
        double salePrice, discount;
        //If weight>2000,10%discount. Otherwise, 20% discount.
        if (weight>2000){
            System.out.println("Truck Weight is  greater than 2000 hence 10% discount:");
            discount=regularPrice * 10/100 ;
        } else {
            System.out.println("Truck Weight is  less than 2000 hence 20% discount:");
            discount=regularPrice * 20/100 ;
        }

        System.out.println("amount after discount = "+discount);
        salePrice=regularPrice-discount;
        System.out.println("Sale price is : "+salePrice);
    }
}
//Sub-class of Ford to calculate sale price
class Ford extends Car{
    int year;
    int manufacturerDiscount;
    public Ford(int speed, double regularPrice, String color,int year) {
        super(speed, regularPrice, color);
        this.year=year;
    }
    void getSalePrice() {
        double manufacturerDiscount;
        if (year > 2000) {
            System.out.println("As year of manufacturing is greater than 2000: 10% discount");
            manufacturerDiscount=regularPrice * 10 /100;
        } else {
            System.out.println("As year of manufacturing is less than 2000: 20% discount:");
            manufacturerDiscount=regularPrice * 20 /100;
        }
        System.out.println("amount after discount=" + manufacturerDiscount);
        double salePrice=regularPrice-manufacturerDiscount;
        System.out.println("Sale price of Ford is : "+salePrice);
    }
}
//Sub-class of Sedan to calculate sale price
class Sedan extends Car{
    int length;
    double amount;
    double salePrice;

    public Sedan(int speed, double regularPrice, String color,int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
    void getSalePrice() {
        double discount;
        //If length>20 feet, 5% discount, Otherwise, 10% discount.
        if (length > 20) {
            System.out.println("Sedan length is  greater than 2000: 5% discount:");
            discount=regularPrice * 5/100 ;
        } else {
            System.out.println("Sedan length is  less than 2000: 10% discount:");
            discount=regularPrice * 10/100 ;
        }

        System.out.println("amount after discount=" + amount);
        salePrice=regularPrice-discount;
        System.out.println("Sale price is for Sedan : "+salePrice);
    }
}
public class MyOwnAutoShop {
    public static void main(String[] args) {

        Truck truck=new Truck(60,4500000,"Black",2500);
        truck.getSalePrice();
        System.out.println("--------------------------------------------------------");
        Ford ford=new Ford(100, 500000, "Red", 2005);
        ford.getSalePrice();
        System.out.println("--------------------------------------------------------");
        Sedan sedan=new Sedan(120, 600000, "Blue", 15);
        sedan.getSalePrice();
        System.out.println("--------------------------------------------------------");
    }
}
