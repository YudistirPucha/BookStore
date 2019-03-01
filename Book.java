package com.company;

public class Book {

//    private variables
    private String _title;
    private int _year;
    private double _price;

//    constructor
    public Book(String title, int year, double price){
        _title = title;
        _year = year;
        _price = price;

    }

//    getters(they get the values )
    public String getTitle(){return _title;}
    public int getYear(){return _year; }
    public double getPrice(){return _price;}

//    setters (they set the values)
    public void setTitle(String title){_title = title;}
    public void setYear(int year){ _year = year;}
    public void setPrice(double price){_price = price;}

    public String toString(){
        return "Title:" + _title + "\n" + "Year " + _year + "\n"+ "Price £" + _price + "\n"+"\n";
    }

}
