package com.kh.excercise.q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(1);
    list1.add(1);
    list1.add(1);
    System.out.println(list1);

    List<Integer> list2 = Arrays.asList(1, 2); //크기고정
    //list2.add(2);
    list2.set(1, list2.get(1) + 99);
    System.out.println(list2);
  }
}
