package AulasDoYoutube.eXcript.javaOOP;

class Rectangulo{
    public int width, height;

    public int areaTotal(){
        return width * height;
    }

    public boolean isQuadrado() {
        if (width==height)
            return  true;
        return  false;
    }
}

public class MainRect {
    public static void main(String[] args) {
        Rectangulo quadrado = new Rectangulo();
        quadrado.width = 100;
        quadrado.height = 120;

        System.out.println(quadrado.areaTotal());
        System.out.println(quadrado.isQuadrado());

        Rectangulo quadrado2 = new Rectangulo();
        quadrado.width = 100;
        quadrado.height = 100;

        System.out.println(quadrado2.areaTotal());
        System.out.println(quadrado2.isQuadrado());
    }
}
