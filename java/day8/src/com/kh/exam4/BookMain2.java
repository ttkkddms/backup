package com.kh.exam4;

import java.util.Scanner;

public class BookMain2 {
  public static void main(String[] args) {
    Book[] books = new Book[5];

    books[0] = new Book("책제목1");
    books[1] = new Book("책제목2");
    books[2] = new Book("책제목3");
    books[3] = new Book("책제목4");
    books[4] = new Book("책제목5");

    books[0] = null;


    //1) 책 제목으로 책 검색하기
    Scanner scanner = new Scanner(System.in);

    Book findBook = searchBook(books, "책제목3");
    System.out.println(findBook.getTitle());


    //2)책 제목으로 책장에서 제거하기
    findBook = deleteBook(books, "책제목2");
    System.out.println(findBook.getTitle());


  }

  //책 제목을 입력받아 책을 반환하는 메소드 정의
  //반환타입 searchBook(매개변수) 제목정보 책장배열
  public static Book searchBook(Book[] books, String title) {
    Book findBook = null;
    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        continue;
      }
      String subject = books[i].getTitle();
      if (subject.equals(title)) {
        findBook = books[i];
        break;
      }
    }
    return findBook;
  }


  public static Book deleteBook(Book[] books, String title) {
    Book findBook = null;
    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        continue;
      }
      String subject = books[i].getTitle();
      if (subject.equals(title)) {
        findBook = null;
        break;
      }
    }return findBook;
  }



}


