package books.programacaoOrientadAaObjetos.chapter02_classesEmJavaManipulacaoDeDados;

public class Triangulo {
    float lado1;

    boolean eEquilatero(){
        boolean igualdade12, resultado;
        igualdade12 = (lado1 == lado2);
        boolean igualdade23;
        igualdade23 = (lado2 == lado3);

        if (igualdade12 && igualdade23)
            resultado = true;
        else
            resultado = false;
        return  resultado;
    }

    float calculaPerimetro() {
        float resultado = lado1+lado2+lado3;
        return resultado;
    }

    float lado2, lado3;
}
