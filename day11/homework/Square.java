package kr.ac.kopo.day10.homework.day11.homework;

public class Square extends Diagram{
    Square(int width) {
        super.width= width;
        info();
    }
    void info(){
        System.out.println("----------------------------------------\n" +
                "길이 " +width+"->\t\t정사각형의 넓이 :"+width*2 +"\n"+
                "----------------------------------------");
    }
}
