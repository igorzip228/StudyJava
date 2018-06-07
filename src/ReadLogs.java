import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class ReadLogs {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите путь к директории, где лежат логи: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //System.out.println(input); //     /home/qa-1/Загрузки/Logs


        File directory = new File(input);
        pathFiles(directory);

//        try(BufferedReader br = new BufferedReader(new FileReader("notes4.txt")))
//        {
//            //чтение построчно
//            String s;
//            while((s=br.readLine())!=null){
//
//                System.out.println(s);
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }

    }

    // прочитать все файлы в папке и подкаталогах и вывести содержимое всех файлов в консоль
    public static void pathFiles(File folder) throws IOException {
        File[] folderEntries = folder.listFiles();
        for (File entry : folderEntries) {
            if (entry.isDirectory()) {
                pathFiles(entry);
                continue;
            }

            Files.lines(Paths.get(entry.getPath())).forEach(System.out::println);

        }
    }
}


class Log {
    String day;
    String date;
    String time;
    String logs;

    Log(String den, String d, String t, String l) {
        day = den;
        date = d;
        time = t;
        logs = l;
    }
}
