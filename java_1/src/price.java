import java.util.Scanner;

public class price {
    public static void main(String[] args) {
        System.out.println("메뉴 번호를 입력하세요");
        System.out.println("1. 치킨");
        System.out.println("2. 돈까스");
        System.out.println("3. 떡볶이");

        Scanner sc = new Scanner(System.in);
        int menu;

        try {
            menu = sc.nextInt();
        } catch (Exception e){
            menu = -1;
        }
        switch(menu) {
            case 1 :
                System.out.println("치킨은 20,000원 입니다.");
                break;
            case 2 :
                System.out.println("돈까스는 15,000원 입니다.");
                break;
            case 3 :
                System.out.println("떡볶이는 12,000원 입니다.");
                break;
            default:
                System.out.println("메뉴 번호를 다시 입력해 주세요");
        }
    }
}
