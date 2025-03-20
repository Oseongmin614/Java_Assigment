package kr.ac.kopo.day12.abs01;

public class SamsungPrinter extends Printer{
    private String name;
    private  int price;

    public SamsungPrinter(){
        name = "삼성프린터";
        price=800_000;
    }
    public void samPrint(){
        System.out.println("삼성프린터입니다");
    }
}
