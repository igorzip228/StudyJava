import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter phone");
        String phone = in.nextLine();
        isPhone(phone);
    }


    public static boolean isPhone(String phone) throws IOException {

        Pattern p = Pattern.compile("^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$");
        Matcher editPhone = p.matcher(phone);

        String contents = getTextFromFile("/home/qa-1/HW");
        String[] severalWords = breakIntoWords(contents);
        for (int i = 0; i < severalWords.length; i++) {
            if (editPhone.equals(severalWords[i])) {
                System.out.println("the number is exist");
                return true;
            }
        }
        System.out.println("the number is NOT exist");
        return false;
    }

    public static String getTextFromFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static String[] breakIntoWords(String text) {
        text = text.replaceAll("[,;:.!?\\s-]+", " ");
        return text.split("\\s+");
    }
}

