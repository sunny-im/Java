import java.util.*;

public class mapEx {
    public static void main(String[] args) {
        // 키와 값으로 이루어져 있기 때문에, 키로 쓰일 타입과 값으로 쓰일 타입을 명시
        Map<String, String> dictionary = new HashMap<>();

        // 값 추가하기 add가 아닌 put
        dictionary.put("chicken", "닭");
        dictionary.put("cat", "고양이");
        dictionary.put("lion", "사자");

        System.out.println(dictionary);  // {chicken=닭, cat=고양이}
        System.out.println(dictionary.size() + "개의 단어가 있습니다");
        System.out.println("-------------");

        // 데이터 가져오기
        System.out.println(dictionary.get("cat"));  // 고양이
        System.out.println(dictionary.get("dog"));  // null
        System.out.println("-------------");

        // 데이터 삭제
        dictionary.remove("chicken"); // 키 값을 입력하면 key-value 전부 삭제된다.
        System.out.println(dictionary);
        System.out.println("-------------");


        System.out.println(dictionary.size() + "개의 단어가 있습니다");
        Scanner sc = new Scanner(System.in);

        String english = sc.nextLine();
        String korean = dictionary.get(english);  // 사용자가 입력한 값을 키로 사용한다.

        if (korean == null) {
            System.out.println("사전에 존재하지 않는 단어입니다.");
        } else {
            System.out.println(english + "은(는)" + korean + "입니다");
        }
        System.out.println("-------------");

        // 키의 목록 가져오기 keySet
        Collection<String> keys = dictionary.keySet();

        for (String eng : keys) {
            String kor = dictionary.get(eng);
            System.out.println("eng는 " + eng);
            System.out.println("kor은 " + kor);
        }

        System.out.println("-------------");

        // value 가져오기 values
        Collection<String> keys2 = dictionary.values();
        for (String kor2 : keys2) {
            System.out.println(kor2);
        }

        System.out.println("-------------");

        //entry는 set을 반환하는데 set이 가지고 있는 타입이 entry => map에서 가지고 있는 키-값 쌍
                    // 키와 값의 타입 명시
        Set<Map.Entry<String, String>> entries = dictionary.entrySet();

        for(Map.Entry<String, String> entry : entries) {
            String eng3 = entry.getKey();
            String kor3 = entry.getValue();

            System.out.println(eng3 + " : " + kor3);
        }
    }
}
