package kr.ac.kopo.day12.abs02;

import java.util.Scanner;
// 이름은 Menu지만 입력을 받아 처리하는 컨트롤러 역확을 하는 class 이다.

public class Menu {
    private Scanner sc;

    public Menu(){
        sc=new Scanner(System.in);
    }

    int scanInt(String msg){
        System.out.print(msg);
        int no=sc.nextInt();
        sc.nextLine();
        return no;
    }
    public void go(){
        int choice = scanInt("메뉴를 선택하세요(1.Lg 2.삼성 3.Hp)=>>");
        switch (choice){
            case 1:
                LGPrinter lg =new LGPrinter();
                lg.print();
                break;
            case 2:
                SamsungPrinter sam=new SamsungPrinter();
                sam.print();
                break;
            case 3:
                HpPrinter hp=new HpPrinter();
                hp.print();
                break;
        }

    }
}
