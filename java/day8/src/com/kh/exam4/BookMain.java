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

    //books[3] = null; //����. ex ��������

    System.out.println(Arrays.toString(books));


    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        books[i] = new Book();
      }
    }
    System.out.println(Arrays.toString(books));


    boolean isFull = true;
    //å�忡 å ���� ������ �ִ��� üũ
    for (int i = 0; i < books.length; i++) {
      if (books[i] != null) {
        isFull = false;
        break;
      }
    }
    //books[4] = null;
    //å�� ���� ��Ұ� ������ "�ڸ��� �����ϴ�."
    // �������� ������ �������� ���
    if (isFull) {
      System.out.println("�ڸ��� �����ϴ�.");
    } else {
      //�������� ���
      int bookCount = 0;
      for (int i = 0; i < books.length; i++) {
        if (books[i] == null) {
          bookCount++;
        }
      }
      System.out.println("�������� : " + bookCount);
    }
  }
}
