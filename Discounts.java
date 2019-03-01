package com.company;

public class Discounts {


    public static double TenDiscount(int _year, double _price ){
        double discount = 0;

        double dis = _price * 0.1;

        if(_year > 2000){
           discount =  _price - dis;
            return discount;
        }
        else
            return _price;


    }

    public static double BooksOver30(double _price){
        double total= 0;
        double dis = _price *0.05;
        if(_price > 30){
            return total = _price - dis;
        }
//        returns original price
        else return _price;
    }
}
