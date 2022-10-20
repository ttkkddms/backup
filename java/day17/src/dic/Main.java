package dic;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    TreeMap<String, String> map = new TreeMap<>();

    map.put("student", "학생");
    map.put("teacher", "교사");
    map.put("classroom", "교실");
    map.put("smart", "현명한");
    map.put("lunch ", "점심");
    String inputWord = "st";

//tokey값은 inputWord보다 뒤에있는걸로


    char firstLetter = inputWord.charAt(0);
    System.out.println(firstLetter);
    char firstLetter2 = (char)(inputWord.charAt(0) + 1);
    System.out.println(firstLetter2);
    System.out.println(inputWord.charAt(0) + 1);


    NavigableMap<String, String> subMap = map.subMap(inputWord, true, "t", false);
    System.out.println(subMap);
  }
}
