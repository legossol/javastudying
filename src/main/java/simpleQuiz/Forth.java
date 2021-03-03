package simpleQuiz;

import java.util.Scanner;

public class Forth {
    public static void main(String[] args) {
        /*배달 도시락을 주문하는데 10개까지는 개당 5000원
        10개를 초과하는 양에 대해서는 개당 4800
        배달 도시락의 주문 갯수를입력받아 전체 금액을 계산하는 프로그램 프로그래밍
         */
        int bentoCnt;
        int cntMin = 10;
        int basicPrice = 5000;
        int discountPrice = 4800;
        int totalPrice;
        Scanner scan = new Scanner(System.in);
        System.out.println("주문하고자 하는 도시락의 갯수는 ?");
        bentoCnt = scan.nextInt();

        if(bentoCnt <= cntMin){
            totalPrice = bentoCnt*basicPrice;
            System.out.printf("주문받은 도시락의 갯수는 [%d]개이며 총 가격은 = %d원 입니다.",bentoCnt,totalPrice);
        }else{
            totalPrice = bentoCnt*discountPrice;
            System.out.printf("주문받은 도시락의 갯수는 [%d]개이며 할인가 적용 총 가격은 = %d원 입니다.",bentoCnt,totalPrice);
        }

    }
}
