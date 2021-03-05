package simpleQuiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
    public static void main(String[] args) {
        Map<String, String> st = new HashMap<String, String>();

        st.put("map", "지도");
        st.put("java", "자바");
        st.put("school","학교");

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("영어단어 입력");
            String key = sc.next();
            if(key.equals("quit"))break;
            System.out.println("단어의 의미는" + st.get(key));
        }while (true);
    }
}
