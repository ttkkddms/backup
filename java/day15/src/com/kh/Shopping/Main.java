package com.kh.Shopping;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Product p1 = new Product("딸기", 3_000);
    Product p2 = new Product("메론", 1_000);
    Product p3 = new Product("체리", 2_000);
    Product p4 = new Product("딸기", 4_000);
    Product p5 = new Product("수박", 5_000);

    ShoppingBasket shoppingBasket = new ShoppingBasket();
    shoppingBasket.put(p1);
    shoppingBasket.put(p2);
    shoppingBasket.put(p3);
    shoppingBasket.put(p4);
    shoppingBasket.put(p5);
    System.out.println(shoppingBasket); //가격 올림차순

    //가격 내림차순 compareTo



    Comparator comp1 = new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        int result = 0;
        if (o1.getPrice() > o2.getPrice()) { //오름차순
          result = 1;
        } else if (o1.getPrice() < o2.getPrice()) {
          result = -1;
        }
        return result;
      }
    };
    //가격 오름차순  Comparator compare
    ShoppingBasket shoppingBasket2 = new ShoppingBasket(comp1);
    shoppingBasket2.put(p1);
    shoppingBasket2.put(p2);
    shoppingBasket2.put(p3);
    shoppingBasket2.put(p4);
    shoppingBasket2.put(p5);
    System.out.println(shoppingBasket2);

//
//    Integer x = 1; //auto boxing
//    int z = x; //auto unboxing
//
////    Integer y = new Integer(1);
////    int z = y.intValue();


//    Comparator<Product> com3 = new Comparator<>() { //내림차순
//      @Override
//      public int compare(Product p1, Product p2) {
//        //case1)
////        int result = 0;
////        if (p1.getPrice() > p2.getPrice()) {
////          result = 1;
////        } else if (p1.getPrice()<p2.getPrice()) {
////          result = -1;
////        }
////        return result * -1;
//
//        //case2)
//        Integer priceOfp1 = p1.getPrice();
//        Integer priceOfp2 = p2.getPrice();
//        return priceOfp1.compareTo(priceOfp2)*-1;
//      }
//    };
//    ShoppingBasket shoppingBasket3 = new ShoppingBasket(com3);
//    shoppingBasket3.put(p1);
//    shoppingBasket3.put(p2);
//    shoppingBasket3.put(p3);
//    shoppingBasket3.put(p4);
//    shoppingBasket3.put(p5);
//    System.out.println(shoppingBasket3);
//
//
//
//
//
//    //상품명
//    Comparator<Product> com4 = new Comparator<Product>() { //익명클래스 상품명 오름차순
//      @Override
//      public int compare(Product o1, Product o2) {
//        return o1.getName().compareTo(o2.getName());
//      }
//    };
//    ShoppingBasket shoppingBasket4 = new ShoppingBasket(com4);
//    shoppingBasket4.put(p1);
//    shoppingBasket4.put(p2);
//    shoppingBasket4.put(p3);
//    shoppingBasket4.put(p4);
//    shoppingBasket4.put(p5);
//    System.out.println(shoppingBasket4);
//
//
//    Comparator<Product> com5 = new Comparator<Product>() { //익명클래스 상품명 내림차순
//      @Override
//      public int compare(Product o1, Product o2) {
//        return o1.getName().compareTo(o2.getName()) * -1;
//      }
//    };
//    ShoppingBasket shoppingBasket5 = new ShoppingBasket(com5);
//    shoppingBasket5.put(p1);
//    shoppingBasket5.put(p2);
//    shoppingBasket5.put(p3);
//    shoppingBasket5.put(p4);
//    shoppingBasket5.put(p5);
//    System.out.println(shoppingBasket5);
//




 }
}
