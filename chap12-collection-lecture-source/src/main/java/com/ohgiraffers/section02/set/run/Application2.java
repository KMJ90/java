package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {

        // [ LinkedHashSet 클래스 ]
        // HashSet 이 가지는 기능을 모두 가지고 있고
        // 추가적으로 저장 순서를 유지하는 특징을 가지고 있다
        // JDK 1.4 부터 제공되고 있다

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset : " + lhset);

        TreeSet<String> tset = new TreeSet<>(lhset);  // 오름차순 만드는
        System.out.println("tset : " + tset);
    }
}
