package kr.ac.kopo.day10.homework.day11;

class One {
One(){
    System.out.println("One() 생성자 호출...");
}
}

class Two extends One{
    Two(){
        super();
        System.out.println("Two()생성자 호출");

    }
}
