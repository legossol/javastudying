package simpleQuiz;

public class Second {
    public static void main(String[] args) {
        //임의의 숫자로 로또 번호 6개를 출력하는 프로그램을 뽑아라
        //중복제거 필
        int ZERO = 0;
        int MAXIMUM = 45;
        int CNT = 6;
        int[] arr = new int[CNT];
        int[] checkDup = new int[CNT];
        int Dup = 0;
        for (int i = ZERO; i < CNT; i++) {
            int randNum = (int) (Math.random() * MAXIMUM) + 1;
            for(int j = 0 ; j < i; j++){
                if(arr[j] == randNum) {
                    i--;
                    System.out.println("중복발생");
                    break;
                }

            }//if(i == CNT-1){
            arr[i] = randNum;
            System.out.printf("[%d]번 로또 번호는 = {%3d}\n",i+1,arr[i]);
        }
    }
}
