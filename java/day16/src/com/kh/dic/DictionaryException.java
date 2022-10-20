package com.kh.dic;

public class DictionaryException  {

  class existCheckException extends Exception {   //없는단어
    public existCheckException(String message) {
      super(message);
    }
  }

  class overlapCheckException extends Exception {  //이미 있는 단어
    public overlapCheckException(String message) {
      super(message);
    }
  }



}
