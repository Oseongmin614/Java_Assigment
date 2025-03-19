package kr.ac.kopo.day10.homework.day11.homework;

public class Circle extends Diagram{

  Circle(int width){
      super.width= width;
      info();
  }
    void info(){
        System.out.println("----------------------------------------\n" +
                "반지름 " +width+"->\t원 넓이 :"+ String.format("%.6f",3.141592*width*width)+"\n"+
                "----------------------------------------");
    }
}
