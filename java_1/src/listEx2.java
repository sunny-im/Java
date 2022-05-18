import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listEx2 {
    public static void main(String[] args) {
        System.out.println("저장할 음식 이름 입력.(종료: 0)");
        List<String> foods = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            String addFood = sc.nextLine();

            if(addFood.equals("0")) {
                break;
            }
            if(foods.contains(addFood)) {
                System.out.println("이미 목록에 있습니다.");
            }else {
                foods.add(addFood);
            }
        }
        // Collections.sort(foods); // 오름차순 정렬
        // Collections.reverse(foods); // 내림차순 정렬
        Collections.shuffle(foods); // 랜덤으로 섞어서 정렬


        System.out.println("점심 추천 메뉴 : " + foods.get(1));
    }
}