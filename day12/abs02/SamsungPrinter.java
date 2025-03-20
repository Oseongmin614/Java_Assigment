package kr.ac.kopo.day12.abs02;

public class SamsungPrinter extends Printer {
    private String name;
    private  int price;

    public SamsungPrinter(){
        name = "삼성프린터";
        price=800_000;
    }
    public void samPrint(){
        System.out.println("삼성프린터입니다");
    }

    @Override  //코드주석 @ // 부모에 없는 메서드를 쓰면 오류남
    public void print(){
        System.out.println(this.name+"에서 출력중입니다 지이잉");
    };
}
