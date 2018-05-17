import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordsInText {
    public static void main(String[] args) throws IOException {
        File f = new File("/home/qa-1/HW");
        BufferedReader reader = new BufferedReader(new FileReader(f));
        System.out.println("Print File " + f.getName());

        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            if (stringBuilder.length() > 0)
                stringBuilder.append("\n");
            stringBuilder.append(line);
        }


        String[] parts = stringBuilder.toString().split("\\W{1,}|\\n");
        //System.out.println("Array size: " + parts.length);
        //System.out.println(Arrays.toString(parts));


        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < parts.length; i++) {
            String key = parts[i].toLowerCase();
            Integer value = hashMap.get(key);

            if (value == null)
                value = 1;
            else
                value++;
            hashMap.put(key, value);
        }

        System.out.println("\nResult:");
        for (Map.Entry<String, Integer> keyVluee : hashMap.entrySet())
            System.out.println(keyVluee.getKey() + ": " + keyVluee.getValue());
    }
}
