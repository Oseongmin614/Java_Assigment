package kr.ac.kopo.day10.homework.day11;

public class Icecream {
    String name;
    int price;

    Icecream(){

    }

    Icecream(String name,int price){
        this.name=name;
        this.price=price;
    }

    String getName(){
        return name;
    }
    int getPrice(){
        return price;
    } // price 만 얻어내는 메서드
}
