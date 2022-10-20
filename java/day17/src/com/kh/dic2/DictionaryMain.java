package com.kh.dic2;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMain {
  public static void main(String[] args) {
    Dictionary dic =  Dictionary.getInstance();
    Scanner scanner = new Scanner(System.in);

    boolean stop = false;
    while (!stop) {
      try {
        String word = "";
        String meaning = "";
        System.out.println("메뉴 1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료 9.초기값 10.비우기");
        System.out.print(" >>> ");
        String menu = scanner.nextLine();
        Map<String, String> list = null;

        switch (menu) {
          case "1":
            System.out.print("단어 입력 : ");
            word = scanner.nextLine();
            System.out.print("의미 입력 : ");
            meaning = scanner.nextLine();
              dic.save(word, meaning);
            break;

          case "2":
            System.out.print("검색할 단어 : ");
            word = scanner.nextLine();
            list = dic.findByWord(word);
            if (list.size() == 0) {
              System.out.println("단어를 검색할 수 없습니다.");
              continue;
            }
            if (!list.containsKey(word)) {
              System.out.println("일치하는 단어가 없습니다.");
            }
            printList(list);
            break;

          case "3"://수정
            System.out.print("단어 입력 : ");
            word = scanner.nextLine();
            System.out.print("의미 입력 : ");
            meaning = scanner.nextLine();
            try {
              dic.update(word, meaning);
            } catch (Exception e) {
              System.out.println(e.getMessage());
              continue;
            }
            System.out.println("단어의 뜻을 수정하였습니다.");
            break;

          case "4"://
            System.out.println("삭제할 단어 입력 : ");
            word = scanner.nextLine();
            dic.delete(word);
            break;

          case "5":
            System.out.println("1.오름차순 2.내림차순");
            System.out.println("선택 >> ");
            String submenu = scanner.nextLine();
            switch (submenu) {
              case "1":
              case "2":
                list = dic.listAll(submenu); ///Map<String, String>
                if (list.size() == 0) {
                  System.out.println("저장된 단어가 없습니다.");
                }
                //entrySet(), keySet(),values()
                //case 1)
  //              for (Map.Entry<String, String> entry : list.entrySet()) {
  //                String key = entry.getKey();
  //                String value = entry.getValue();
  //                System.out.println(key + " : " + value);
  //              }
                //case 2)
                printList(list);
                break;
            }
            break;

          case "6":
            System.out.print("색인 입력 : ");
            String letter = scanner.nextLine();
            List<String> words = dic.index(letter);
            for (String str : words) {
              System.out.println(str + "\t");
            }
            System.out.println();
            break;

          case "7": //통계
            System.out.println(dic.showWordStatics());
            break;

          case "8":
            System.out.println("프로그램 종료!");
            stop = true;
            continue;

          case "9": //초기값
            dic.init();
            break;
          case "10"://비우기
            dic.clearAll();
              break;
          default:
            System.out.println("1~8사이의 번호를 입력하세요.");
            break;
        } //switch
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }


    }//while
  }//main

  private static void printList(Map<String, String> list) {
    for (String key : list.keySet()) {
      String value = list.get(key);
      System.out.println(key + " : " + value);
    }
  }


}//end of class
