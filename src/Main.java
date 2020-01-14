import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ReadText readText = new ReadText();

        ArrayList<String> MapData = readText.readMap();
        Player player = new Player(MapData.get(0));

    }
}
