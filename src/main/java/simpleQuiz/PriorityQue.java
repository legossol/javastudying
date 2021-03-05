package simpleQuiz;

import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(30);
        pq.add(80);
        pq.add(20);

        for (Integer o : pq)
            System.out.println(o);
        System.out.println("원소삭제");

        while (!pq.isEmpty())
            System.out.println(pq.remove());
        //정렬이 되서 나옴
    }
}

