class Stack {
    private int tos;
    private char stck[];

    Stack(int size) {
        stck = new char[size];
        tos = 0;
    }


    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    Stack(char a[]){
        stck = new char[a.length];

        for (int i = i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    void push (char ch) {
        if (tos == stck.length) {
            System.out.println(" -- стек заполнен");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    char pop() {
        if(tos == 0) {
            System.out.println(" -- стек пуст");
            return (char) 0;
        }

        tos--;
        return stck[tos];
    }
}

class ForStack {
    public static void main(String[] args) {
        Stack stk1 = new Stack(10);

        char name[] = {'T', 'o', 'm'};

        Stack stk2 = new Stack(name);

        char ch;
        int i;

        for (i = 0; i < 10; i++)
            stk1.push((char) ('A' + i));

        Stack stk3 = new Stack(stk1);

        System.out.print("Содержание stk1: ");
        for (i = 9; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }

        System.out.println();

        System.out.print("Содержимое stk2: ");
        for (i = 9; i < 10; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println();

        System.out.print("Содержимое stk3: ");
        for (i = 9; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}