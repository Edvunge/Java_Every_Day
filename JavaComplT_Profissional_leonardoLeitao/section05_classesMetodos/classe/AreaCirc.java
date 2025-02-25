package JavaComplT_Profissional_leonardoLeitao.section05_classesMetodos.classe;

public class AreaCirc {
    double raio;
    double pi;

    AreaCirc (double raioInicial) {
        pi = 3.14;
        raio = raioInicial;
    }

    double area() {
        //return raio * raio * pi;

        // outra forma de se representar
        return pi * Math.pow(raio, 2);
    }
}
