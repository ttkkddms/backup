package com.kh.demo.dao;

public class Product {
  //  PRODUCT_ID	NUMBER(10,0)
//  PNAME	VARCHAR2(30 BYTE)
//  QUANTITY	NUMBER(10,0)
//  PRICE	NUMBER(10,0)
  private Long productId;
  private String pname;
  private Long quantity;
  private Long price;

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

}

