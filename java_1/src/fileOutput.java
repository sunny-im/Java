import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/output01.txt", true); // true 옵션을 주게되면 덮어쓰지않고 계속 누적으로 쌓인다.
        } catch (IOException e) {
            System.out.println("파일생성에 실패했습니다.");
            System.exit(1);  // 프로그램이 정상적으로 끝나면 0이 나온다.
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("종료하려면 입력없이 엔터");

        while(true) {
            String input = sc.nextLine();

            if (input.equals("")) {
                System.out.println("파일 입력을 종료합니다");
                break;
            }

            try {
                //writer.write("하코가 괴롭힌다.....\n");
                //writer.write("공부를 방해한다...\n");
                writer.write(input + "\n");
            } catch (IOException e) {
                System.out.println("파일에 데이터 입력이 실패했습니다.");
                System.exit(2);
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일입력이 실패하였습니다.");
        }
    }
}
