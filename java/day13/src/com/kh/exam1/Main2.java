package com.kh.exam1;

public class Main2 {
  public static void main(String[] args) {


    method2();


  }

  private static void method2() {
    int[] arr = new int[3];
    try {
      arr[3] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println(e.getCause());
      e.printStackTrace();
    }
  }
}
