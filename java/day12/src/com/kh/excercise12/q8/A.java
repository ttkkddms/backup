package com.kh.excercise12.q8;

 interface A {
   default void abc() {
     System.out.println("A의 인터페이스 abc()");
   }

   static void def() {
     System.out.println("A인터페이스의 정적메소드");
   }
}
