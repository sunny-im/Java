public class ifEx {
    public static void main(String[] args) {
        int money = 5000;

        if (money > 8000) {
            System.out.println("돈까스 먹쟈 !");
        } else if (money >= 5000) {
            System.out.println("카레를 먹어야겠다...");
        } else {
            System.out.println("오늘은 굶어야지ㅠㅠ");
        }

        int age = 28;
        if (age >= 10) {
            if (age < 20) {
                System.out.println("10대 입니다.");
            } else
            System.out.println("최소 20대겠네욤 !");
        } else {
            System.out.println("최대 초등학생 이겠네요 !");
        }

        int age2 = 28;
        if (age2 >= 10 && age2 <20) {       // 동시 만족
            System.out.println("10대 이군요!");
        } else {
            System.out.println("10대가 아니네욤!");
        }

        int age3 = 18;
        if (age3 < 10 || age3 >= 20) {       // 둘 중 하나만 만족
            System.out.println("10대가 아니네욤!");
        } else {
            System.out.println("10대군요!");
        }
    }
}
