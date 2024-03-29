package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Tiger();
        animals[2] = new Cat();
        animals[3] = new Tiger();
        animals[4] = new Cat();

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
        // 각 클래스별 고유한 메소드를 동작시키게 하기 위해서는
        // down-casting 을 명시적으로 해줘야 하는데
        // ClassCastException 을 방지하기 위해서는 instanceof 연산자를 이용해야 한다
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {  // 니가 고양이 타입이라면
                ((Cat) animals[i]).jump();  // 고양이는 점프를 출력
            } else if(animals[i] instanceof Tiger) {  // 니가 호랑이 타입이라면
                ((Tiger) animals[i]).bite();  //  호랑이는 물어를 출력
            } else {  // 그것도 아니라면
                System.out.println("호랑이나 고양이가 아닙니다.");  // 이 문구를 출력해라
            }
        }
    }
}
