package wumpsGame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HazardInRooms {
    public static void main(String[] args) {
        // 들어갈 수 있는 방
        int[] rooms ={0,1,2,3};

        // 각 방에 배치할 위험요소
        String BAT = "Bat";
        String PIT ="Pit";
        String WUMPUS = "Wumpus";
        String NOTHING = "Nothing";

        // 각 방에 배치할 거기 때문에 방과 동일한 크기의 배열로 만들고 적당히 배치함
        String[] hazards = {NOTHING, BAT, PIT, WUMPUS};

        // 위험요소의 이름을 key, 메세지를 value로 Map에 저장
        HashMap<String, String> hazardMessages = new HashMap<>();

        hazardMessages.put(WUMPUS, "\"어디선가 끔찍한 냄새가 난다.\"");
        hazardMessages.put(BAT, "\"어디선가 부스럭거리는 소리가 들린다.\"");
        hazardMessages.put(PIT, "\"바람이 부는 소리가 들리는 것 같다.\"");
        hazardMessages.put(NOTHING, "\"저 방에는 아무것도 없는 것 같다.\"");

        // 각 방에서 이동할 수 있는 다음 방의 목록
        int[][] links = {{1,2,3},{2,3,0},{3,0,1},{0,1,2}};

        // 현재 위치한 방, 초기화 0
        int currentRoom = 0;

        Scanner sc = new Scanner(System.in);

        // 무한반복으로 방 위치 표시
        while(true){
            System.out.println("지금 " + currentRoom + "번 방에 있습니다.");

            // 현재 방에서 갈 수 있는 방들의 목록
            int[] nextRooms = links[currentRoom];

            // 방 번호들 반복문
            for(int nextRoom : nextRooms) {
                // 방 번호에 해당하는 위험요소 가져오고
                String hazard = hazards[nextRoom];
                // 위험요소에 해당하는 대사 가져오고
                String message = hazardMessages.get(hazard);
                // 대사 출력
                System.out.println(message);
            }

            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요");
            System.out.println(Arrays.toString(nextRooms));

            int roomNumber = sc.nextInt();

            currentRoom = roomNumber;
        }
    }
}
