package simpleQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int key = 50;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i +=2)
            list.add(i);
        int index = Collections.binarySearch(list,key);
        if(index<0)
            list.add(-index-1);
        System.out.println("탐색의 반환값 = " + index);
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i)+"  ");
        //배열에서 몇번째에 50이 있는지 찾는 것
        //단 바이너리서치는 정렬이 되어있는 경우에만 사용이 가능하
    }
}
