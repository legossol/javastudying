package simpleQuiz;

public class First {
    public static void main(String[] args) {
        //0부터 짝수를 더해서 100을 넘지 않는 마지막 짝수와 그 갑ㅃㅅ까지 더한 값을 한줄씩 출력
        int ZERO =0;
        int MAXIMUM = 100;
        int LASTNUM;
        int sum =ZERO;
        int LastTotal;

        for(int i =ZERO;;i++){
            if(i%2 == 0){
                sum += i;
                if(sum > MAXIMUM){
                    LASTNUM = i-2;
                    LastTotal = sum-LASTNUM;
                    System.out.println("LastNum = " + LASTNUM);
                    System.out.println("TotalSum = " + LastTotal);
                    break;
                }
            }
        }
    }
}
