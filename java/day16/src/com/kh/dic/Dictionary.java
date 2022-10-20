package com.kh.dic;


import java.util.*;



public class Dictionary extends DictionaryException implements Comparator<Dictionary> {
  String str;
  Scanner scanner = new Scanner(System.in);
//  private Map<String, String> Comparator;
  TreeMap<String, String> dic = new TreeMap<>();

//  public Dictionary(Map<String, String> dic) {
//  }


  @Override
  public int compare(Dictionary o1, Dictionary o2) {
    int result = 0;
    if (this.str.length() < o2.str.length()) {
      result = 1;
    } else if (this.str.length() > o2.str.length()) {
      result = -1;
    }
      return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dictionary that = (Dictionary) o;
    return Objects.equals(str, that.str) && Objects.equals(scanner, that.scanner) && Objects.equals(dic, that.dic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(str, scanner, dic);
  }

  public Dictionary() {
  }

//  public Dictionary(String str) {
//    this.str = str;
//  }

  public void enroll(String eng, String kor) throws overlapCheckException {
    if (dic.size() == 5) {
      System.out.println("더 이상 등록할 수 없습니다. 최대 5개.");
      return;
    }
    overLapCheck(eng);
    dic.put(eng, kor);
    System.out.println("등록되었습니다.");
  }

  public void search(String eng) throws existCheckException {
    existCheck(eng);
    System.out.println(eng + " : " + dic.get(eng));
  }

  public void modify(String eng, String kor) throws existCheckException {
    existCheck(eng);
    dic.put(eng, kor);
    System.out.println("단어의 뜻을 수정 하였습니다.");
  }

  public void delete(String eng) throws existCheckException {
    existCheck(eng);
    dic.remove(eng);
    System.out.println("단어를 삭제 하였습니다.");
  }

  public void list() {
    System.out.println("5. 단어를 조회합니다");
    if (dic.isEmpty()) {
      System.out.println("단어장이 비어있습니다.");
      return;
    }
    System.out.println(" == 1.오름차순 2.내림차순 ==");
    String num = scanner.nextLine();
    switch (num) {
      case "1"://오름차순
        System.out.println(dic);
        break;
      case "2"://내림차순:
        System.out.println(dic.descendingMap());
        break;
      default:
        System.out.println("1과 2중에 선택해주세요.");
        break;
    }
    //System.out.println(dic.entrySet());
  }

  public void index() { //6. 색인
    System.out.println("알파벳 입력시 해당 알파벳으로 시작하는 단어를 오름차순으로 보여줍니다.");
    System.out.println("준비중");
  }


  public void statistics() { //7. 통계
    if (dic.isEmpty()) {
      System.out.println("단어장이 비어있습니다.");
      return;
    }
    System.out.println("1.저장된 단어 갯수 2. 문자수가 가장 많은 단어 3.단어글자수 내림차순");
    System.out.print(">>> ");
    String num = scanner.nextLine();

    switch (num) {
      case "1": //저장된 단어 갯수
        System.out.println(dic.size()+"개의 단어 저장중");
        break;
      case "2": //단어의 문자수가 가장 많은 단어

        break;
      case "3"://단어 글자수 내림차순(단어만)

        TreeMap<String, String> dic2 = new TreeMap<>(new Comparator<String>() {

          @Override
          public int compare(String o1, String o2) {
            if (o1.length() > o2.length()) {
              return 1;
            } else if (o1.length() < o2.length()) {
              return -1;
            }else
              return 0;
          }
        });
        System.out.println(dic2.keySet());
        break;
      default:
    }
  }



    @Override
    public String toString () {
      str = "";
      if (dic.size() > 0) {
        for (Map.Entry<String, String> entry : dic.entrySet()) {
          str += entry.getKey() + " : " + entry.getValue() + "\n";
        }
      } else {
        str += "단어를 추가해주세요.";
      }
      return str;
    }

    void overLapCheck (String eng) throws overlapCheckException { //이미 있는 단어
      if (dic.containsKey(eng)) {
        throw new overlapCheckException("이미 등록되었습니다.");
      }
    }

    void existCheck (String eng) throws existCheckException { //없는단어
      if (!(dic.containsKey(eng))) {
        throw new existCheckException("단어를 검색할수 없습니다.");
      }
    }
  }




