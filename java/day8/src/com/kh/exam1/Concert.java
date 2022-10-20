// 실습과제 8.3: Concert.java
// 콘서트 티켓을 모델한다

package com.kh.exam1;


import java.util.Scanner;

public class Concert {

    private String singerName;  // 가수의 이름
    private int capacity;    // 공연 장소의 수용 인원
    private int ticketsSold = 0;  // 팔린 티켓 수


    // 변수들
    // 인터넷 티켓 가격, 현장 티켓 가격, 총 판매 금액과 인터넷 판매 가능 여부
    private int costOverWeb;
    private int costAtVenue;
    private int totalSalesPrice;
    private boolean webSalesable = true; //디폴트값


    // 여기에 코드를 삽입하세요


    // 생성자 메소드
    // 가수의 이름, 공연 장소의 수용 인원, 인터넷 티켓 가격과 현장 티켓 가격을
    // 각각 주어진 값으로 초기화하면서 객체를 생성한다
    public Concert(String name, int max, int costOverWeb, int costAtVenue) {
        this.singerName = name;
        this.capacity = max;
        this.costOverWeb = costOverWeb;
        this.costAtVenue = costAtVenue;
    }


    // 티켓을 판다
    public void doTicketSale() {
        // 남은 티켓들의 수를 알려 준다
        System.out.print("남은 티켓들 수는? (최대 " + getTicketsLeft() + ") ");

        // 구매 요청한 티켓 수를 입력 받는다
        Scanner reader = new Scanner(System.in);
        int toSell = reader.nextInt();

        // 티켓을 판다
        boolean saleCompleted = sellTickets(toSell); //false true

        // 판매가 완료되면 티켓들의 총 가격을 출력하고
        // 티켓을 판매할 수 없으면 오류 메시지를 출력한다
        if (saleCompleted) { //true
            System.out.println("티켓 총 가격 : " + getTotalSales());
        } else { //false
            System.out.println("잔여수량 부족.");
            System.out.println("잔여수량 : " + getTicketsLeft());
        }
    }

    // 구매 요청한 수만큼 티켓을 판다
    // 티켓을 판매할 수 있으면 판매 기록을 갱신하고 true를 반환한다
    // 티켓을 판매할 수 없으면 false를 반환한다
    public boolean sellTickets(int number) {
        boolean flag = false;
        if (getTicketsLeft() >= number) { //판매가능
            ticketsSold += number;
            totalSalesPrice += getSaleCost(number);
            flag = true;
        } else {

            flag = false;
        }
        return flag;
    }


    // 구매 요청한 티켓들의 가격을 계산한 후 반환한다
    public int getSaleCost(int number) {
        int price = 0;
        //인터넷단가 or 현장
        if (webSalesOnly()) {
            price = this.costOverWeb * number;
        } else {
            price = this.costAtVenue * number;
        }
        return price;
    }


    public void webSalesOver() {  // 인터넷 판매를 종료한다
        this.webSalesable = false;
    }


    public int getTicketsSold() { // 팔린 티켓들의 수를 알려 준다
        return ticketsSold;
    }
    public int getTicketsLeft() { // 남은 티켓들의 수를 알려 준다
        return this.capacity - this.ticketsSold;
    }

    public int getTotalSales() { // 총 판매 금액을 알려 준다
        return this.totalSalesPrice;
    }
    public boolean webSalesOnly() {  // 인터넷 판매 가능 여부를 알려 준다
        return this.webSalesable; //true
    }

    // 팔린 티켓 수와 총 판매 금액을 반환한다
    public String getSalesReport() {
        String str = "";
        str += "팔린 티켓 수 : " + this.getTicketsSold() + "\n";
        str += "총 판매 금액 : " + this.getTotalSales() + "\n";
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