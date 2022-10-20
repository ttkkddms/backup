package com.kh.exam1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {
  public static void main(String[] args) {

    Map<String, String> dictionary = new HashMap<>();
    //요소 추가(키, 값 저장)
    dictionary.put("student", "학생");
    dictionary.put("teacher", "교사");
    dictionary.put("lecture", "강좌");
    dictionary.put("classroom", "교실");
    dictionary.put("classroom1", "교실");
    System.out.println(dictionary);

    //요소 검색(키 존재여부)
    System.out.println(dictionary.containsKey("student"));
    System.out.println(dictionary.containsKey("student1"));

    //요소검색(값 존재여부)
    System.out.println(dictionary.containsValue("학생"));
    System.out.println(dictionary.containsValue("학생2"));
    System.out.println(dictionary.containsValue("교실"));

    //요소검색(주어진 키로 값 반환)
    System.out.println(dictionary.get("student")); //학생

    System.out.println("================");

    //요소검색(모든키 반환)
    Set<String> setA = dictionary.keySet();
    for (String ele :
        setA) {
      System.out.println(ele);
    }

    System.out.println("================");
    //요소검색(모든값 반환)
    Collection<String> values = dictionary.values();//밸류 반환타입은 중복을 제거해서 나와야해서 컬렉션
    for (String ele :
        values) {
      System.out.println(ele);
    }

    System.out.println("================");
    //요소검색(키와 값의 쌍으로 구성된 Map.Entry반환)
    Set<Map.Entry<String, String>> entries = dictionary.entrySet();
    for (Map.Entry<String, String> ele :
        entries) {
      System.out.println(ele.getKey() + " : " + ele.getValue());
    }

    //요소검색 (요소가 비어있는지 여부)
    System.out.println(dictionary.isEmpty());

    //요소검색(요소수)
    System.out.println(dictionary.size()); //4

    //요소 삭제 (키로 검색된 요소삭제)
    System.out.println(dictionary);
    dictionary.remove("student");
    System.out.println(dictionary);

    //요소 삭제 (키, 값 쌍으로 검색된 기준)
    dictionary.remove("teacher", "교사");
    System.out.println(dictionary);

    //요소삭제(전체)
    dictionary.clear();
    System.out.println(dictionary.size());
    System.out.println(dictionary);
  }
}
