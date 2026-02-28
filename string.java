import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter a string");
        System.out.println("length:" +s.length());
        System.out.println("char:" + s.charAt(2));
        System.out.println("uppercase:"  + s.toUpperCase());
        System.out.println("Lowercase:" + s.toLowerCase());
        System.out.println("equals:" + s.equals("nani"));
        System.out.println("contains:" + s.contains("programming"));
        System.out.println("ends:" + s.endsWith("programming"));
    }
}








