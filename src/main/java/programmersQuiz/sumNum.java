package programmersQuiz;
/*자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
제한사항
N의 범위 : 100,000,000 이하의 자연수
입출력 예
N	answer
123	6
987	24
    */
public class sumNum {
    /* 정답:
        public int solution(int n) {
            int sum=0;
            for(int i = 0; i < 9 ; i++){
                sum += n%10;
                n /= 10;
            }

            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("Hello Java");

            return sum;
        }
    }
    예시 정답:
    using namespace std;
        int solution(int n){
        int sum = 0;
            while(n>0)
            {
            sum += n % 10;
            n /= 10;
        }
    return sum;
}

     */

}
