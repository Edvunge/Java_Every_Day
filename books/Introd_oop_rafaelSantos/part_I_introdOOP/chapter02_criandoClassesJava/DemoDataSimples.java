package books.Introd_oop_rafaelSantos.part_I_introdOOP.chapter02_criandoClassesJava;

public class DemoDataSimples {
    public static void main(String[] argumentos) {
        DataSimples hoje = new DataSimples();
        DataSimples independenciaDoBrasil = new DataSimples();

        byte umDia, umMes;
        short umAno;

        umDia = 40;
        umMes = 1;
        umAno = 2001;

        hoje.inicializaDataSimples(umDia,umMes,umAno);
        hoje.mostraDataSimples();

        umDia = 7;
        umMes = 9;
        umAno = 1822;
        independenciaDoBrasil.inicializaDataSimples(umDia,umMes,umAno);
        independenciaDoBrasil.mostraDataSimples();

        if (hoje.eIgual(independenciaDoBrasil)) {
            System.out.println("As datas são iguais !");
        } else {
            System.out.println("As datas são diferentes !");
        }

        hoje.dia = 0;
        hoje.mes = 1;
        hoje.ano = 2001;
        hoje.mostraDataSimples();
        independenciaDoBrasil.mes = 13;
        independenciaDoBrasil.mostraDataSimples();
    }
}
