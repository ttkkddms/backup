package com.kh.exam5;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExam1 {
  public static void main(String[] args) {
    TreeMap<Integer, String> scores = new TreeMap<>();
    scores.put(87, "홍길동1");
    scores.put(98, "홍길동2");
    scores.put(75, "홍길동3");
    scores.put(95, "홍길동4");
    scores.put(80, "홍길동5");
    System.out.println(scores); //올림차
    System.out.println(scores.descendingMap()); //내림차


    Map.Entry<Integer, String> entry = scores.firstEntry(); //가장낮은점수
    System.out.println(entry.getKey() + " : " + entry.getValue());

    entry = scores.lastEntry(); //가장 높은 점수
    System.out.println(entry.getKey() + " : " + entry.getValue());

    entry = scores.higherEntry(95); //보다 높은 점수
    System.out.println(entry.getKey() + " : " + entry.getValue());

    entry = scores.lowerEntry(95); //보다 낮은 점수
    System.out.println(entry.getKey() + " : " + entry.getValue());


    entry = scores.ceilingEntry(95); //95포함해서 높은점수
    System.out.println(entry.getKey() + " : " + entry.getValue());

    entry = scores.floorEntry(95); //95포함해서 낮은 점수
    System.out.println(entry.getKey() + " : " + entry.getValue());

//    while (!scores.isEmpty()) {
//      entry = scores.pollFirstEntry();
//      System.out.println(entry.getKey() + " : " + entry.getValue() + " : " + scores.size());
//    }


    //검색
    SortedMap<Integer, String> subMap = scores.subMap(80, 90);
    System.out.println(subMap);


    NavigableMap<Integer, String> subMap2 = scores.subMap(80, false, 90, false);
    System.out.println(subMap2);


    System.out.println(scores.headMap(80)); //오름차순 자신보다 작은거
    System.out.println(scores.headMap(80, true)); //오름차순 자신포함 작은거
    System.out.println(scores.headMap(80, false)); //본인제외
    System.out.println("=========");
    System.out.println(scores.tailMap(80, false)); //



    //보여만주고
    //맵을 내림차순하여 정렬된 객체 반환
    System.out.println(scores.descendingMap()); //내림차순
    //맵의 키를 내림차순하여 정렬된 객체 반환
    System.out.println(scores.descendingKeySet()); //키만 반환 [98, 95, 87, 80, 75]
  }
}
