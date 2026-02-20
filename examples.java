public class examples {
    public static void main(String[] args) {
        int x = 2;
        int y = 11;
        System.out.println("Sum:"+(x+y));

        int a=-3;
        if (a>3) System.out.println("Positive");
        else System.out.println("Negative");

        if (x>0 && x%2==0) System.out.println("Positive and even");
        else System.out.println("Negative and not even");

        System.out.println("Before:"+a);
        a+=5;
        System.out.println("After assign operator:"+a);

        int d=5;
        System.out.println("Before:"+d);
        d++;
        System.out.println("After assign value:"+d);
    }
}


