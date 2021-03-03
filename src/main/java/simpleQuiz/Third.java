package simpleQuiz;

import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        //처음 기본 30분 요금 3000원
        //이후 10분당 500원
        //탄시간을 입력받아
        //전체요금을 계산
        //1분이라도 초과시 10분 요금 추가
        int usingTime;
        int basicPrice = 3000;
        int overPriceEss = 1000;
        int overPrice;
        int basicTime =30;

        //float overTimeEss = (overTime/10);
        Scanner Scan = new Scanner(System.in);
        System.out.println("사용하고자 하는 시간을 입력하세요");
        usingTime = Scan.nextInt();

        int overTime = usingTime - basicTime;
        int overTimeEss = overTime/10;

        if(usingTime <= 30) {
            System.out.printf("기본요금인 %d 원만 부과됩니다.", basicPrice);
        }else if(overTime == overTimeEss*10){
            overPrice = overPriceEss*overTimeEss;
            System.out.printf("기본요금 %d원과 추가요금 %d원을 부과하십시오", basicPrice, overPrice);
        }else{
            overPrice = overPriceEss*(overTimeEss+1);
            System.out.printf("기본요금 %d원과 추가요금 %d원을 부과하십시오", basicPrice, overPrice);
        }
    }
}
