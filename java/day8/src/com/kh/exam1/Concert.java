// �ǽ����� 8.3: Concert.java
// �ܼ�Ʈ Ƽ���� ���Ѵ�

package com.kh.exam1;


import java.util.Scanner;

public class Concert {

    private String singerName;  // ������ �̸�
    private int capacity;    // ���� ����� ���� �ο�
    private int ticketsSold = 0;  // �ȸ� Ƽ�� ��


    // ������
    // ���ͳ� Ƽ�� ����, ���� Ƽ�� ����, �� �Ǹ� �ݾװ� ���ͳ� �Ǹ� ���� ����
    private int costOverWeb;
    private int costAtVenue;
    private int totalSalesPrice;
    private boolean webSalesable = true; //����Ʈ��


    // ���⿡ �ڵ带 �����ϼ���


    // ������ �޼ҵ�
    // ������ �̸�, ���� ����� ���� �ο�, ���ͳ� Ƽ�� ���ݰ� ���� Ƽ�� ������
    // ���� �־��� ������ �ʱ�ȭ�ϸ鼭 ��ü�� �����Ѵ�
    public Concert(String name, int max, int costOverWeb, int costAtVenue) {
        this.singerName = name;
        this.capacity = max;
        this.costOverWeb = costOverWeb;
        this.costAtVenue = costAtVenue;
    }


    // Ƽ���� �Ǵ�
    public void doTicketSale() {
        // ���� Ƽ�ϵ��� ���� �˷� �ش�
        System.out.print("���� Ƽ�ϵ� ����? (�ִ� " + getTicketsLeft() + ") ");

        // ���� ��û�� Ƽ�� ���� �Է� �޴´�
        Scanner reader = new Scanner(System.in);
        int toSell = reader.nextInt();

        // Ƽ���� �Ǵ�
        boolean saleCompleted = sellTickets(toSell); //false true

        // �ǸŰ� �Ϸ�Ǹ� Ƽ�ϵ��� �� ������ ����ϰ�
        // Ƽ���� �Ǹ��� �� ������ ���� �޽����� ����Ѵ�
        if (saleCompleted) { //true
            System.out.println("Ƽ�� �� ���� : " + getTotalSales());
        } else { //false
            System.out.println("�ܿ����� ����.");
            System.out.println("�ܿ����� : " + getTicketsLeft());
        }
    }

    // ���� ��û�� ����ŭ Ƽ���� �Ǵ�
    // Ƽ���� �Ǹ��� �� ������ �Ǹ� ����� �����ϰ� true�� ��ȯ�Ѵ�
    // Ƽ���� �Ǹ��� �� ������ false�� ��ȯ�Ѵ�
    public boolean sellTickets(int number) {
        boolean flag = false;
        if (getTicketsLeft() >= number) { //�ǸŰ���
            ticketsSold += number;
            totalSalesPrice += getSaleCost(number);
            flag = true;
        } else {

            flag = false;
        }
        return flag;
    }


    // ���� ��û�� Ƽ�ϵ��� ������ ����� �� ��ȯ�Ѵ�
    public int getSaleCost(int number) {
        int price = 0;
        //���ͳݴܰ� or ����
        if (webSalesOnly()) {
            price = this.costOverWeb * number;
        } else {
            price = this.costAtVenue * number;
        }
        return price;
    }


    public void webSalesOver() {  // ���ͳ� �ǸŸ� �����Ѵ�
        this.webSalesable = false;
    }


    public int getTicketsSold() { // �ȸ� Ƽ�ϵ��� ���� �˷� �ش�
        return ticketsSold;
    }
    public int getTicketsLeft() { // ���� Ƽ�ϵ��� ���� �˷� �ش�
        return this.capacity - this.ticketsSold;
    }

    public int getTotalSales() { // �� �Ǹ� �ݾ��� �˷� �ش�
        return this.totalSalesPrice;
    }
    public boolean webSalesOnly() {  // ���ͳ� �Ǹ� ���� ���θ� �˷� �ش�
        return this.webSalesable; //true
    }

    // �ȸ� Ƽ�� ���� �� �Ǹ� �ݾ��� ��ȯ�Ѵ�
    public String getSalesReport() {
        String str = "";
        str += "�ȸ� Ƽ�� �� : " + this.getTicketsSold() + "\n";
        str += "�� �Ǹ� �ݾ� : " + this.getTotalSales() + "\n";
        return str;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "singerName='" + singerName + '\'' +
                ", capacity=" + capacity +
                ", ticketsSold=" + ticketsSold +
                ", costOverWeb=" + costOverWeb +
                ", costAtVenue=" + costAtVenue +
                ", totalSalesPrice=" + totalSalesPrice +
                ", webSalesable=" + webSalesable +
                '}';
    }
}