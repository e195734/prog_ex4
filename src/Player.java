import javax.lang.model.element.NestingKind;
import javax.swing.text.Position;

public class Player {
    private int[] defaultPosition = new int[2];
    private int[] currentPosition = new int[2];


    public Player(String position) {
        int i = 0;
        for(String pos:position.split(" ")){]
            this.defaultPosition[i] = Integer.parseInt(pos);
            i++;
        }
    }
}
