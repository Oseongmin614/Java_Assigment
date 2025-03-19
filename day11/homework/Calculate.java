package kr.ac.kopo.day10.homework.day11.homework;

import java.util.Scanner;

public class Calculate {
    Diagram[] Diagrams;
    int width;
    int height;

    int scanInt(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }
    void ChooseDiagram(){
        int choose = 0;
        while (choose!=5) {
            choose = scanInt("원하는 도형을 선택하세요(1. 삼각형, 2.직사각형, 3.정사각형, 4.원, 5.종료 )");
            switch (choose){
                case 1:
                    width=scanInt("가로 ");
                    height=scanInt("세로 ");
                    Triangle T1=new Triangle(width,height);
                    break;
                case 2:
                    width=scanInt("가로 ");
                    height=scanInt("세로 ");
                    Rectangular R1=new Rectangular(width,height);
                    break;
                case 3:
                    Square s1=new Square(scanInt("길이 "));
                    break;
                case 4:
                    Circle c1=new Circle(scanInt("반지름 "));
                    break;
                case 5:
                    break;
            }
        }
    }
    public  void start(){ChooseDiagram();}
}
