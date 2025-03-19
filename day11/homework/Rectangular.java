package kr.ac.kopo.day10.homework.day11.homework;

public class Rectangular extends Diagram{
    private final int height;
    Rectangular(int width, int height){
        this.width= width;
        this.height=height;
        info();
    }
    void info(){
        System.out.println("----------------------------------------\n" +
                "가로 "+width+"세로 "+height+"->\t삼각형의 넓이 :"+ width*height+"\n"+
                "----------------------------------------");
    }
}
