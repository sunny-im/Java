package wumpsGame;

public class MoveAndSituation {
    public static void main(String[] args) {
        public static int[] rooms = {0,1,2,3};

        public static int[][] links ={{1,2,3},{2,3,0},{3,0,1},{0,1,2}};

        public static String BAT = "Bat";
        public static String PIT = "Pit";
        public static String WUMPUS = "Wumpus";
        public static String NOTHIONG = "Nothing";

        public static String[] hazards = {NOTHIONG, BAT, PIT, WUMPUS};

        public static int currentRoom = 0;



    }
}
