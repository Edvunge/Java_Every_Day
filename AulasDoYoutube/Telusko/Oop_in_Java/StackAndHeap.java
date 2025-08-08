package AulasDoYoutube.Telusko.Oop_in_Java;

class Calcut{
    int num;

    public int add(int n1, int n2){
        return n1 + n2;
    }
}

public class StackAndHeap {
    public static void main(String[] args) {
        int data = 10;
        Calcut obj = new Calcut();
        Calcut obj1 = new Calcut();

        int r1 = obj.add(3, 4);
        //System.out.println(r1);
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
