import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class makeFile {
    public static void main(String[] args) throws IOException {
        //imput.txt 파일에 연결된 파일 입력 스트림을 생성

        FileInputStream in = null;
        FileOutputStream out = null;

        //output txt 파일에 연결된 파일 출력 트림을 생성

        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");


            //하나의 바이트를 읽을때는 read()를 사용하고 하나의 바이트를 쓸때는 write()를사용

            int c;

            while ((c = in.read()) != -1){
                out.write(c);
            }
        }finally{
            if(in !=null)
                in.close();
            if(out !=null )
                out.close();
        }


    }
}
