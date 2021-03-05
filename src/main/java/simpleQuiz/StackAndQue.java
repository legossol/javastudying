package simpleQuiz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQue {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("0");
        q.offer("0");

        while(!st.empty()){
            System.out.println(st.pop());
        }

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
