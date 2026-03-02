class computer{
    public int add(int a, int b) {
        return a + b;
    }

    public int add1(int a, int b, int c) {
        return a + b + c;
    }
}
    public class Overload {
        public static void main(String[] args){
        computer obj=new computer();
        int r=obj.add1(2,4,6);
        System.out.println(r);

        }
}
