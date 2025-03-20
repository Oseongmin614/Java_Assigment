package kr.ac.kopo.day12.abs02;

public class LGPrinter extends Printer {

    private String name;
    private  int price;

    public LGPrinter(){
        name = "엘지 프린터";
        price=950_000;
    }
    public void lgPrint(){
        System.out.println(this.name+"입니다");
    }

    @Override  //코드주석 @ // 부모에 없는 메서드를 쓰면 오류남
    public void print(){
        System.out.println(this.name+"에서 출력중입니다.치치지직!");
    };

}
