package AulasDoYoutube.Telusko.Oop_in_Java.sect02_methods;

class Computer{
    public void playMusic(){
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class Methods2 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);
    }
}
