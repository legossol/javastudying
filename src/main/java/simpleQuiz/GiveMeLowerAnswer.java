//package simpleQuiz;
//
//import java.util.InputMismatchException;
//import java.util.Random;
//import java.util.Scanner;
//
//public class GiveMeLowerAnswer {
//    public static void main(String[] args) {
//        int randNum = 0;
//        int nRandNum = 0;
//        int answer = 0;
//        Scanner scan = new Scanner(System.in);
//
//       try{
//           scan = new Scanner(System.in).nextInt();
//
//       }catch(Exception e){
//           System.out.println("유효하지 않은 값입니다 다시 입력해주세요");
//           continue:
//       }
//        if(scan.hasNextInt()||answer < randNum ||answer > nRandNum) {
//            answer = scan.nextInt();
//        }else if(nRandNum == 0){
//            System.out.println("게임이 끝났습니다.");
//        }else if(nRandNum > 0 ){
//            return;
//        }
//        else{
//            System.out.println("유효하지 않는 값을 입력했습니다 다시 입력해주세요");
//            return;
//        }
//        nRandNum = randNum;
//
//    }
//}
//
