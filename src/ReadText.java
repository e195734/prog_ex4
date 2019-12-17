import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class ReadText {
    private Path path = Paths.get("map.txt");
    private List<String> text = Files.readAllLines(path);

    public ReadText() throws IOException {
        try{

        }
        catch(IOException){
            System.out.println("迷路のデータでエラーが発生しました。プログラムを終了します。");
            System.exit(0);
        }
    }

}
