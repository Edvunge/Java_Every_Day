package books.programacaoOrientadAaObjetos.chapter02_classesEmJavaManipulacaoDeDados;

public class DemoDataSimples {
    public static void main(String[] args) {
        DataSimples hoje = new DataSimples();
        DataSimples independenciaDoBrasil = new DataSimples();

        byte umDia, umMes;
        short umAno;

        umDia = 40;
        umMes = 1;
        umAno = 2001;

        hoje.inicializaDataSimples(umDia, umMes, umAno);
        hoje.mostrarDataSimples();

        umDia = 7;
        umMes = 9;
        umAno = 1822;
        independenciaDoBrasil.inicializaDataSimples(umDia, umMes, umAno);
        independenciaDoBrasil.mostrarDataSimples();

        if (hoje.eIgual(independenciaDoBrasil)) {
            System.out.println("As datas são iguais !");
        } else {
            System.out.println("As datas são diferentes !");
        }

        hoje.dia = 0;
        hoje.mes = 1;
        hoje.ano = 2001;
        hoje.mostrarDataSimples();
        independenciaDoBrasil.mes = 13;
        independenciaDoBrasil.mostrarDataSimples();
    }
}
