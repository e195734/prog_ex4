import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadText{
    ArrayList<String> readMap() {
        ArrayList<String> list = new ArrayList<>();
        try {
            File file = new File("map.txt");

            if (!file.exists()) {
                System.out.print("ファイルが存在しません");
                return list;
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                list.add(data);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("迷路のデータでエラーが発生しました。プログラムを終了します。");
        }
        return list;
    }
}
