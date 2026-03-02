class A{
    public void playMusic()
    {
        System.out.println("play a song..");
    }
}
class QAnil{
public String getMeApen() {
    return "pen";
}
}
class method {
    public static void main(String[] args) {
        A obj = new A();
        obj.playMusic();
        QAnil obj1=new QAnil();
        System.out.println(obj1.getMeApen());
    }
}

