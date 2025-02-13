package books.Introd_oop_rafaelSantos.part_I_introdOOP.chapter02_criandoClassesJava;

public class DemoData {
    public static void main(String[] argumentos) {
        Data nascimento = new Data();
        Data descobrimentoDoBrasil = new Data();

        byte umDia,umMes;
        short umAno;

        umDia = 22; umMes = 13; umAno = 2000;
        nascimento.inicializaData(umDia,umMes,umAno);

        umDia = 22; umMes = 4; umAno = 1500;
        descobrimentoDoBrasil.inicializaData(umDia,umMes,umAno);

        descobrimentoDoBrasil.mostraData();

        if (nascimento.eIgual(descobrimentoDoBrasil))
            System.out.println("As datas são iguais !");
        else
            System.out.println("As datas são diferentes !");

        //nascimento.mes = 10;
        //descobrimentoDoBrasil.mes = -1;
    }
}
