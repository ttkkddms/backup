package dic;


import java.util.*;

/**
 * 단어장
 */
public class Dictionary {
  TreeMap<String, String> dic = new TreeMap<>();
  private final int WORD_CAPACITY = 5;

  public void init() {
    dic.put("student", "학생");
    dic.put("teacher", "교사");
    dic.put("classroom", "교실");
    dic.put("smart", "똑똑한");
    dic.put("lunch", "점심");
  }

  public void clearAll() {
    dic.clear();
  }


  /**
   * 저장
   *
   * @param word    단어
   * @param meaning 의미
   */
  public void save(String word, String meaning) {
    //1. 단어수 초과체크
    if (dic.size() == WORD_CAPACITY) {
      throw new DictionaryException("최대 저장 단어수 초과!");
    }
    //단어 중복체크
    if (dic.containsKey(word)) {
      throw new DictionaryException("이미 저장 된 단어입니다.");
    }
    dic.put(word.toLowerCase(), meaning);
    System.out.println("저장되었습니다.");
  }


  /**
   * 검색
   *
   * @param word 단어
   * @return 검색결과
   */
  public Map<String, String> findByWord(String word) {
    checkEmpty();
    word = word.toLowerCase();
    Map<String, String> map = new HashMap<>();
    String meaning = dic.get(word);
    //1)일치하는 단어를 검색
    if (meaning != null) {
      map.put(word, meaning);
    } else {
      //2)단어가 검색되지 않을경우, 범위검색
      char firstLetter = word.charAt(0);  //'s'
      char nextLetter = (char) (firstLetter + 1);  //'t'
      map = dic.subMap(word, true, String.valueOf(nextLetter), false);
      //기본타입을 문자열로 int = x;
      //System.out.println( x + "");
      //System.out.println(String.valueOf(x));

      //문자열을 기본타입으로
      //wrapper클래스.parseXXX(문자열)
    }
    return map;
  }


  /**
   * 수정
   *
   * @param word    단어
   * @param meaning 의미
   */
  public void update(String word, String meaning) {
    checkEmpty();
    word = word.toLowerCase();
    if (dic.replace(word, meaning) == null) {
      throw new DictionaryException("단어를 검색할 수 없습니다.");
    }
    System.out.println("단어의 뜻을 수정하였습니다.");
  }

  /**
   * 삭제
   *
   * @param word 단어
   */
  public void delete(String word) {
    checkEmpty();
    if (dic.remove(word) == null) {
      throw new DictionaryException("단어를 검색할 수 없습니다.");
    }
    System.out.println("단어를 삭제하였습니다.");
  }

  /**
   * 목록
   *
   * @param subMenu 서브메뉴 1.올림차 2.내림차
   * @return 전체머뉴목록
   */
  public Map<String, String> listAll(String subMenu) {
    checkEmpty();
    Map<String, String> map = new HashMap<>();
    switch (subMenu) {
      case "1": //오름차순
        map = dic;
        break;
      case "2": //내림차순
        map = dic.descendingMap();
        break;
    }
    return map;
  }

  /**
   * 색인
   *
   * @param letter 한 문자 초성
   * @return 초성으로 시작하는 단어반환
   */
  public List<String> index(String letter) {
    checkEmpty();
    letter = letter.toLowerCase();
    //다음 문자 계산하기
    char nextLetter = (char) (letter.charAt(0) + 1);
    NavigableMap<String, String> subMap = dic.subMap(letter, true, String.valueOf(nextLetter), false);

    //단어만 추출
    Set<String> words = subMap.keySet();

    //set => list에 옮겨달기
    List<String> list = new ArrayList<>();
    for (String word : words) {
      list.add(word);
    }
    return list;
//    return new ArrayList<>(subMap.keySet());
  }

  /**
   * 통계
   *
   * @return 1.저장된 단어의 갯수 2.단어의 문자수가 가장 많은 단어 3.단어 글자수 내림차순 출력(단어만)
   */
  public String showWordStatics() {
    checkEmpty();
    String info = "";
    info += "1.저장된 단어의 갯수 : " + dic.size() + "\n";
    info += "2.단어의 문자수가 가장 많은 단어 : " + getMostCharactorCount() + "\n";
    info += "3.단어 글자수 내림차순 출력(단어만) : " + descendingByLengthOfWord();

    return info;
  }

  //단어의 글자수 내림차순(단어만)

  /**
   * 단어의 글자수 내림차순(단어만)
   *
   * @return 단어글자수 내림차순(단어만)
   */
  private String descendingByLengthOfWord() {
    String str = "";
    TreeMap<String, String> map = new TreeMap<>(new getMostCharactorCount());
    map.putAll(dic);
    Set<String> words = map.keySet();

    int size = words.size();
    int cnt = 0;
    for (String word : words) { //마지막 단어는 (,)없이 출력
      ++cnt;
      if (cnt == size) {
        str += word;
      } else {
        str += word + ", ";
      }
    }
    return str;
  }


  //글자수 가장많은 단어 이름있는.
  private String getMostCharactorCount() {
    checkEmpty();
    TreeMap<String, String> map = new TreeMap<>(new getMostCharactorCount());
    map.putAll(dic);
    return map.firstKey();
  }

  private void checkEmpty() {
    if (dic.size() == 0) {
      throw new DictionaryException("저장된 단어가 없습니다.");
    }
  }

  //글자수 가장많은 단어  익명비교연산자

//  private String getMostCharactorCount2() {
//    String str = "";
//    TreeMap<String, String> map = new TreeMap<>(new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        int result = 1;
//        if (o1.length() > o2.length()) { //뒤에게 크면 오름차순, 작으면 내림차순
//          result = -1;
//        } else if (o1.length() < o2.length()) {
//          result = 1;
//        }
//        return result;
//      }
//    });
//    map.putAll(dic);
//    return map.firstKey();
//  }


  static class getMostCharactorCount implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
      int result = 1;
      if (o1.length() > o2.length()) { //뒤에게 크면 오름차순, 작으면 내림차순
        result = -1;
      } else if (o1.length() < o2.length()) {
        result = 1;
      }
      return result;
    }
  }

  public static void Main(String[] args) {
    System.out.println("Hello World");
  }

}

