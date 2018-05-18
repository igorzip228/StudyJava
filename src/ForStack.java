class Stack {
    private int putlock, getlock;
    private char s[];

    Stack(int size) {
        s = new char[size + 1];
        putlock = getlock = 0;
    }


    void push(char ch) {
        if (putlock == s.length - 1) {
            System.out.println(" - стек заполнен");
            return;
        }
        putlock++;
        s[putlock] = ch;
    }

    char pop(char num) {
        if (getlock == putlock) {
            System.out.println(" - стек пуст");
            return (char) 0;
        }
        putlock--;
        return s[putlock];
    }
}


public class ForStack {
    public static void main(String[] args) {
        Stack bigQ = new Stack (100);
        Stack smallQ = new Stack(4);
        char ch;
        int i;

        System.out.println("Использование очереди  bigQ для сохранения алфавита");
        for (i = 0; i < 26; i++)
            bigQ.push((char) ('A' + i));

        System.out.print("Содержимое очереди bigQ : ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.pop(ch);
            if (ch != (char) 0) System.out.print(ch);
        }
    }


}