package com.kh.excercise.q10;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
  Queue<String> queue = new LinkedList<>();

    queue.offer("감사");
    queue.poll();
    queue.offer("ㅇㅇ");
    queue.offer("ㅂㅂ");
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.peek());
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.peek());
  }
}
