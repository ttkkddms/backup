package com.kh.excercise.q6;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Set<Data> set = new HashSet<>();

    set.add(new Data(2, 3));
    set.add(new Data(2, 3));
    set.add(new Data(3, 4));
    System.out.println(set.size()); //2

    //set.remove(new Data(2));
    System.out.println(set);
    System.out.println();

//해시코드
//    System.out.println(Objects.hash(new Data(2)));
//    System.out.println(Objects.hash(new Data(2)));
//    System.out.println(Objects.hash(new Data(3)));
    for (Data data : set) {
      System.out.println(data.hashCode());
    }


    System.out.println(new Data(2) == new Data(2)); //위치
    System.out.println(new Data(2).equals(new Data(2))); //실제




    //배열 보여주기 1
    Iterator<Data> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();
    //2
    for (Data s : set) {
      System.out.print(s + " ");
    }

  }
}
