package kr.ac.kopo.day12.abs01;

public class LGPrinter extends Printer{

    private String name;
    private  int price;

    public LGPrinter(){
        name = "엘지 프린터";
        price=950_000;
    }
    public void lgPrint(){
        System.out.println(this.name+"입니다");
    }

}
