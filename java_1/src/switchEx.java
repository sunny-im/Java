public class switchEx {
    public static void main(String[] args) {
        int month = 8;
        switch(month) {
            case 1:
                System.out.println("1월");
                break;      // break를 넣지 않으면 만족 후 그 다음 case로 break를 만날때까지 계속 진행됨!
            case 2:
                System.out.println("2월");
                break;
            case 3:
                System.out.println("3월");
                break;
            case 4:
                System.out.println("4월");
                break;
            default:
                System.out.println("일치하는 값 없음!");
        }
    }
}
