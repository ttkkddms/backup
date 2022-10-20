package com.kh.Shopping;

import java.util.Objects;

public class Product implements Comparable<Product> {
  private String name;
  private int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Product o) {
    int result = 0;
    Product p = (Product) o;

    //case2)
    return Integer.valueOf(this.getPrice()).compareTo(Integer.valueOf(p.getPrice())); //오름차순



    //case1)
//    if (this.getPrice() > ((Product) p).getPrice()) {
//      result = 1;
//    } else if (this.getPrice() < p.getPrice()) {
//      result = -1;
//    }
//    return result;
//
//


  }

//  public int compareTo(Product o) {
//    int result = 0;
//    if (this.price < o.price) { //내림차순
//      return result = 1;
//    } else if (this.price > o.price) {
//      return result = -1;
//    }
//    return result;
//  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return price == product.price && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }
}
