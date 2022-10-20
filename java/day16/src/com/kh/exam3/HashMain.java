package com.kh.exam3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMain {
  public static void main(String[] args) {
    Map<String ,String > map = new HashMap<>();
    map.put("student", "학생");
    map.put("teacher", "교사");
    map.put("classroom", "교실");

    String word = map.get("student");
    System.out.println(word);

    String word2 = map.get("sTudent");
    System.out.println(word2);

    System.out.println("sTudent".toLowerCase()); //소문자로 변환
    System.out.println("sTudent".toUpperCase()); //대문자로 변환

    String word3 = map.get("STUdent".toLowerCase());
    System.out.println(word3);



    System.out.print("검색할 단어를 입력하세요 : ");
    Scanner scanner = new Scanner(System.in);
    String eng = scanner.nextLine();
    String lowEng = eng.toLowerCase(); //소문자 변환
    String meaning = map.get(lowEng);

    System.out.println(lowEng +"의 뜻 : "+ meaning);

  }
}
