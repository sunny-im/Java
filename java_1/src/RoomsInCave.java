import java.util.Arrays;
import java.util.Scanner;

public class RoomsInCave {
    public static void main(String[] args) {
        int[] rooms = {0,1,2,3};    // 들어갈 수 있는 방을 배열로
        int[][] links = {{1,2,3},{2,3,0},{3,0,1},{0,1,2}};  // 각 방에서 이동할 수 있는 통로를 이차원배열로
        int currentRoom = 0;  // 현재 방 번호, 초기화

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("지금 " + currentRoom + "번 방에 있습니다.");
            System.out.println("다음 번호 중 이동할 방 번호를 입력해 주세요");

            // 현재 방에서 이동해 갈 수 있는 방의 목록을 출력
            System.out.println(Arrays.toString(links[currentRoom]));

            int roomNumber = sc.nextInt();

            currentRoom = roomNumber;  // 현재 방 번호를 입력받은 정수로 변경
        }

    }
}
