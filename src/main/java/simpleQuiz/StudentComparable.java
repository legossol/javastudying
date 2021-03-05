package simpleQuiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*student클래스의 생성자를 추가한 후, Comparable인터페이스를 구현하도록 변경해서
이름이 기본 정렬 기준이 되도록 하시오

 */
class Student {
    String name;
    int ban;
    int no;
    int kor, eng, math;
    int getTotal() {
        return kor + eng + math;
    }
    float getAverage(){
        return (int)((getTotal()/3f)*10+0.5/10f;
    }
    public String toString(){
        return name +","+ban+","+no+","+kor + "," + eng + "," +math+","+getTotal()+","+getAverage();
    }
}
public class StudentComparable {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("남궁성",1,3,90,65,34));
        list.add(new Student("김자바",1,5,89,87,64));
        list.add(new Student("이자바",1,6,78,35,52));
        list.add(new Student("안자바",1,8,68,99,78));

        Collections.sort(list);
        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }
}
