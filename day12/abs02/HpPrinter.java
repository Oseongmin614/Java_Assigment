package kr.ac.kopo.day12.abs02;

public class HpPrinter extends Printer{
    private String name;
    private  int price;

    public HpPrinter(){
        name = "HP프린터";
        price=650_000;
    }
    @Override  //코드주석 @ // 부모에 없는 메서드를 쓰면 오류남
    public void print(){
        System.out.println(this.name+"에서 출력중입니다.치--직!");
    };
}
