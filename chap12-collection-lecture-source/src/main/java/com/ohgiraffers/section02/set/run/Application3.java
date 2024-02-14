package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        // [ TreeSet 클래스 ]
        // TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다
        // 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다
        // JDK 1.2 부터 제공되고 있다
        // Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다

        TreeSet<String> tset = new TreeSet<>();
        Set<String> tset2 = new HashSet<>();  // 다형성 적용하여 Set 으로도 가능

        tset.add("java");
        tset.add("oracle");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        System.out.println("tset : " + tset);  // TreeSet 은 자동으로 오름차순 정렬되어 있음

        Iterator<String> iter = tset.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next().toUpperCase());  // toUpperCase : 대문자로 반환
        }

        Object[] arr = tset.toArray();

        for (Object obj : arr) {
            System.out.println(((String)obj).toUpperCase());  // 형변환
        }

        // 로또 번호 발생(TreeSet 특징 이용)
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add(((int)(Math.random() * 45)) + 1);  // Math.random 이 실수라서 (int)로 형변환 해야함
        }
        System.out.println("lotto : " + lotto);
    }
}
