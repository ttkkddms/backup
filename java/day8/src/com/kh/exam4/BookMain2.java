package com.kh.exam4;

import java.util.Scanner;

public class BookMain2 {
  public static void main(String[] args) {
    Book[] books = new Book[5];

    books[0] = new Book("å����1");
    books[1] = new Book("å����2");
    books[2] = new Book("å����3");
    books[3] = new Book("å����4");
    books[4] = new Book("å����5");

    books[0] = null;


    //1) å �������� å �˻��ϱ�
    Scanner scanner = new Scanner(System.in);

    Book findBook = searchBook(books, "å����3");
    System.out.println(findBook.getTitle());


    //2)å �������� å�忡�� �����ϱ�
    findBook = deleteBook(books, "å����2");
    System.out.println(findBook.getTitle());


  }

  //å ������ �Է¹޾� å�� ��ȯ�ϴ� �޼ҵ� ����
  //��ȯŸ�� searchBook(�Ű�����) �������� å��迭
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


