import java.io.*;
import java.util.Scanner;

public class makeImgFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("원본 파일 이름을 입력하세요: ");

        //try 블록 안에서 스트림을 선언하고 초기화하면 이것들을 닫을 필요가 없다. 따른 클래스에서 대해서도 사용할수 있으니
        String inputFileName = scan.next();

        System.out.println("복사 파일 이름을 입력하세요 : ");
        String outputFileName = scan.next();

        try (InputStream inputStream = new FileInputStream(inputFileName);
                OutputStream outputStream = new FileOutputStream(outputFileName)){

            //파일의 끝까지 읽기를 계속한다.
            int c;
            while ((c = inputStream.read()) != -1){
                outputStream.write(c);
            }
        }
        System.out.println(inputFileName + "을" + outputFileName + "로 복사하였습니다.");

    }
}
