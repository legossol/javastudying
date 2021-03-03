/*정수 배열 numbers가 주어집니다.
     numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
     배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
     numbers의 길이는 2 이상 100 이하입니다.
     numbers의 모든 수는 0 이상 100 이하입니다.
      */
package programmersQuiz;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        return answer;

        int MIN;
        int arrmax = 100;
        int randLength = (int)(Math.random()*100)+2;
        numbers = new int[randLength];

        for(int i = MIN; i <=numbers.length; i++){
            int randNum = (int)(Math.random()*100)+1;
            numbers[i] = randNum;
            System.out.println(numbers[i]);
        }
    }
}


public class pickTwoAndPlus {
    public static void main(String[] args) {
        System.out.println("Hello World");

    }
}
