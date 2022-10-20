package com.kh.exam5;

import java.util.Locale;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExam1 {
  public static void main(String[] args) {
    TreeSet<Integer> scores = new TreeSet<>(); //정렬되어서 저장됨
    scores.add(87);
    //scores.add(new Integer(87));
    scores.add(98);
    scores.add(75);
    scores.add(95);
    scores.add(80);
    System.out.println(scores);

    Integer score = null;
    score = scores.last();
    System.out.println("가장 높은 점수 : " + score);

    score = scores.first();
    System.out.println("가장 낮은 점수 : " + score);

    score = scores.floor(87); //lower 보다 낮은점수
    System.out.println("87이거나 보다 낮은 점수 : " + score);

    score = scores.higher(87); //ceiling 같거나 높은 점수
    System.out.println("87보다 높은 점수 : " + score);

//    while (!scores.isEmpty()) {
//      score = scores.pollFirst();
//      System.out.println(score + "님의 객체 수 : " + scores.size());
//    }
    NavigableSet<Integer> integers = scores.descendingSet();
    System.out.println(integers);

    //범위검색
    SortedSet<Integer> integers1 = scores.subSet(80, 90);
    System.out.println(integers1);

    NavigableSet<Integer> integers2 = scores.subSet(80, false, 95, true);
    System.out.println(integers2);

    //오름차순하여 상위 하위 가져오기
    System.out.println(scores.headSet(80)); //자신보다 낮은, 앞에있는 75
    System.out.println(scores.headSet(80, true)); //자신포함 보다 낮은, 앞에있는 75
    System.out.println(scores.tailSet(80, true)); //자신포함 뒤에있는. [80, 87, 95, 98]
    System.out.println(scores.tailSet(80, false)); //[87, 95, 98]


    //내림차순하여 상위그룹, 하위그룹 가져오기
    NavigableSet<Integer> scoresByDescendingSet = scores.descendingSet();
    System.out.println(scoresByDescendingSet.headSet(80, true)); //[98, 95, 87, 80]
    System.out.println(scoresByDescendingSet.tailSet(80, false)); //[75]





  }
}
