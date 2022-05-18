import java.util.ArrayList;
import java.util.List;

public class listEx {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>(); // 리스트는 모양새만 만드는 일종의 껍데기같은것 이므로 직접 생성해서 사용할 수 없기 때문에 리스트의 모양을 그대로 따르는 ArrayList를 사용
        // List<Integer> li2 = new ArrayList<Integer>();
        // ArrayList<Integer> li3 = new ArrayList<>();

        // 리스트에 요소 추가
        li.add("sunny");
        li.add("hako");
        System.out.println(li);  // [sunny, hako]
        System.out.println("----------");

        // 리스트 요소 제거
        //li.remove("sunny");
        li.remove(0); // 인덱스로도 삭제 가능
        System.out.println(li);  // [hako]
        System.out.println("----------");

        // 리스트 요소 값 변경
        li.set(0, "momo");  // 첫번째 인자에 바꿀 인덱스, 두번쨰 인자에는 바꿀 값
        System.out.println(li); // [momo]
        System.out.println("----------");

        String name = li.get(0);
        System.out.println(name); // momo
        System.out.println("----------");

        // 리스트는 중복값 허용
        li.add("momo");
        System.out.println(li); // [momo, momo]
        System.out.println("----------");

        // 중복값이 있는 지 확인
        boolean containsMomo = li.contains("momo");
        System.out.println(containsMomo);  // 중복값이 있기 때문에 ture
        System.out.println("----------");

    }
}
