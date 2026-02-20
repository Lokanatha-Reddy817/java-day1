public class operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.print("Arthemetic operators");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("Relational operators");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        System.out.println("Unary operators");
        int c = 3;
        System.out.println(+c);
        System.out.println(-c);
        System.out.println(c++);
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(--c);

        System.out.println("Logical operators");
        int marks=99;
        if (marks>30 && marks<40) System.out.println("Pass");
        else System.out.println("Fail");
        if (marks>30 || marks<40) System.out.println("Pass");
        else System.out.println("Fail");
        if (!(marks>90)) System.out.println("True");
        else System.out.println("False");
    }
}