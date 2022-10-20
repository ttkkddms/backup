package com.kh.exam4;

import java.util.Arrays;

public class BookMain {
  public static void main(String[] args) {
    Book[] books = new Book[5];

    books[0] = new Book();
    books[1] = new Book();
    books[2] = new Book();
    books[3] = new Book();
    books[4] = new Book();

    //books[3] = null; //비우기. ex 계좌제거

    System.out.println(Arrays.toString(books));


    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        books[i] = new Book();
      }
    }
    System.out.println(Arrays.toString(books));


    boolean isFull = true;
    //책장에 책 꽂을 공간이 있는지 체크
    for (int i = 0; i < books.length; i++) {
      if (books[i] != null) {
        isFull = false;
        break;
      }
    }
    //books[4] = null;
    //책을 꽂을 장소가 없으면 "자리가 없습니다."
    // 여유공간 있으면 여유공간 출력
    if (isFull) {
      System.out.println("자리가 없습니다.");
    } else {
      //여유공간 출력
      int bookCount = 0;
      for (int i = 0; i < books.length; i++) {
        if (books[i] == null) {
          bookCount++;
        }
      }
      System.out.println("여유공간 : " + bookCount);
    }
  }
}
