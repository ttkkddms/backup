package com.kh.exam1;

public class Book {
  //멤버

  //멤버필드
  //인스턴스 멤버필드 : 인스턴스별로 가져갈 속성정의
  String title;
  //정적멤버필드 : 인스턴스간에 공유할 속성정의
  static int bookId;

  public Book(String title) {
    super();
    this.title = title;
  }


  //멤버 메소드

  //인스턴스 멤버 메소드 바디에- 인스턴스멤버, 정적멤버 모두 사용 가능
  public String getTitle() {
    return title;
  }


  //정적은 메인이 만들어지기도전에 가장먼저 생성되기때문에 안에 인스턴스 담을 수 없음.
  //정적메소드는 인스턴스 없이도 실행되어야하기때문에
  //정적 멤버 메소드 - 정적멤버만 사용가능
  public int getBookId() { //인스턴스 메소드  안에는 정적필드 가능
    return bookId; //정적필드
  }
//  public static String  getBookId2() { //정적 메소드  안에는 인스턴스 불가능
//    return title; //인스턴스 필드
//  }
//  인-인,정
//  정-정
}
