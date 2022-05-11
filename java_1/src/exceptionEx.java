import java.util.Scanner;


public class exceptionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("환율을 입력 해 주세요");
        try {
            Double rate = Double.parseDouble(sc.nextLine());
            System.out.println("환전 할 금액을 입력 해 주세요");
            Double exchange = Double.parseDouble(sc.nextLine());
            System.out.println("환전 금액은 " + exchange / rate + " 달러 입니다.");
        } catch (Exception e) {
            System.out.println("숫자만 입력해 주세욤 !");
        }
    }
}
