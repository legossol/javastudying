package simpleQuiz;
class Counter{
    private int value =0;
    public synchronized void increment(){   value++;    }
    public synchronized void decrement(){   value++;    }
    public synchronized void printCounter(){
        System.out.println(value);
    }
}
//실제결과는 컴퓨터와 상황에 따라서 상당히 달라진다.
//스레드 간섭이 없다면 모두 0이 출력되어야 한다.

class MyThread extends Thread{

    //공유된 Counter 객체의 참조값을 저장한다.
    Counter sharedCounter;

    public MyThread(Counter C){
        this.sharedCounter = C;
    }

    //증가했다가 감소시키기 ㄷ때문에 카운터의 값은 변화가 없어야 한다.

    public void run(){
        int i =0;
        while(i<2000)
    }
}
public class synchronize {
    public static void main(String[] args) {

    }
}
