package com.ohgiraffers.section01.user_type;

public class Application1 {
    public static void main(String[] args) {

        // 변수를 이용한 회원 데이터 관리

        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"당구", "볼링", "배드민턴"};

        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.println("hobby : ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(hobby[i] + " ");
        }
        System.out.println();

        // 맴버 객체생성
        Member member = new Member();  // 객체(인스턴스)라고 부름

        // 필드에 접근하기 위해서는 레퍼런스변수명.필드명 으로 접근
        // '.' 은 참조연산자 라고 하는데, 레퍼런스 변수가 참조하고 있는 주소로 접근한다는 의미이다
        // 각 공간은 필드명으로 접근한다 ( 배열은 인덱스로 접근, 객체는 필드명으로 접근한다 )
        System.out.println("member.id : " + member.id);  // member : 레퍼런스변수명이라고 부름
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobby : " + member.hobby);

        member.id = "user01";
        member.pwd =  "pass01";
        member.name =  "홍길동";
        member.age =  20;
        member.gender = '남';
        member.hobby = new String[] {"당구", "볼링", "배드민턴"};

        System.out.println("변경 후 member.id : " + member.id);
        System.out.println("변경 후 member.pwd : " + member.pwd);
        System.out.println("변경 후 member.name : " + member.name);
        System.out.println("변경 후 member.age : " + member.age);
        System.out.println("변경 후 member.gender : " + member.gender);
        System.out.println("변경 후 member.hobby : ");
        for (int i = 0; i < member.hobby.length; i++) {
            System.out.println(member.hobby[i] + " ");
        }
    }
}
