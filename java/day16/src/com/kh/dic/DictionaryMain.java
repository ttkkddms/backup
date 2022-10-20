package com.kh.dic;


import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;


public class DictionaryMain extends DictionaryException {
  public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();

    Scanner scanner = new Scanner(System.in);
    String eng;
    String kor;
    Boolean stop = false;
    while (!stop) {
      System.out.println("=====메뉴=====\n" + "1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료");
      String menu = scanner.nextLine();
      switch (menu) {
        case "1": //저장
          try {
            System.out.println("1.저장할 단어를 입력하세요.");
            System.out.print("단어 입력 : ");
            eng = scanner.nextLine();
            String engValue = eng.toLowerCase();
            System.out.print("뜻 입력 : ");
            kor = scanner.nextLine();
            dictionary.enroll(engValue, kor);
          } catch (overlapCheckException e) {
            System.out.println(e.getMessage());
          }
          break;
        case "2": //검색
          System.out.println("2.검색");
          System.out.print("검색할 단어 : ");
          eng = scanner.nextLine();
          String engValue = eng.toLowerCase();
          try {
            dictionary.search(engValue);
          } catch (existCheckException e) {
            System.out.println(e.getMessage());
          }


          break;
        case "3": //수정
          System.out.println("3. 수정하고자하는 단어를 입력하세요.");
          System.out.print("단어 : ");
          eng = scanner.nextLine();
          engValue = eng.toLowerCase();
          try {
            dictionary.search(engValue);
            System.out.print("뜻을 새로 입력하세요 : ");
            kor = scanner.nextLine();
            dictionary.modify(engValue, kor);
          } catch (existCheckException e) {
            System.out.println(e.getMessage());
          }
          break;
        case "4": //삭제
          System.out.print("4. 삭제할 단어를 입력하세요 : ");
          eng = scanner.nextLine();
          engValue = eng.toLowerCase();
          try {
            dictionary.delete(engValue);
          } catch (existCheckException e) {
            System.out.println(e.getMessage());
          }
          break;
        case "5": //목록
          dictionary.list();
          // System.out.println(dictionary.toString());
          break;
        case "6": //색인
          dictionary.index();
          break;
        case "7": //통계
          dictionary.statistics();
          break;
        case "8": // 종료
          System.out.println("종료합니다.");
          stop = true;
          continue;
        default:
          System.out.println("1부터 8까지의 번호를 선택해주세요.");
          break;
      }
    }
  }
}
