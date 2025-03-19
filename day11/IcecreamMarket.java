package kr.ac.kopo.day10.homework.day11;

import java.util.Scanner;

public class IcecreamMarket {
    Icecream[] iceArr;



    int scanInt(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    String scanstr(String msg){
        Scanner sc= new Scanner(System.in);
        System.out.print(msg);
        String str= sc.nextLine();

        return str;
    }

    void buySomting() {
        int cnt = scanInt("아이스크림을 몇개 구매 하시겠습니까? :");
        iceArr =new Icecream[cnt];
        for (int i = 0; i < iceArr.length ; i++) {
            System.out.println(" ***"+(i+1)+"번째 아이스크림 입력***");
            String  name    = scanstr("아이스크림 명  :");
            int     price   = scanInt("아이스크림 가격:");

            iceArr[i]= new Icecream(name, price);
        }
    }
    void printReceipt(){
        System.out.println("***"+iceArr.length+"개 아이스크림 구매정보 출력***");
        System.out.println("번호\t아이스크림\t아이스크림 가격");

        for (int i = 0; i < iceArr.length; i++) {
            Icecream ice = iceArr[i];
            System.out.printf("%d\t%s\t\t%d\n",i+1,ice.getName(),ice.getPrice());
        }
        System.out.println("===============================================");
    }
    public void open() {
        buySomting();
        printReceipt();
    }
}
