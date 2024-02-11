package Java_COMPLETO_POO_Projetos.AcademiaDevs.RewiesExtras;

public class ContaNetflix {
    String idiomaPreferencial;
    String resolucaoTela;

    void entrar() {
        buscarPreferenciasDoUsuario();
        identificarResolucao();
    }

    void buscarPreferenciasDoUsuario() {
        idiomaPreferencial = "PT-BR";
    }

    private void identificarResolucao() {
        resolucaoTela = "Full HD";
    }

    public void assistirFilme(String nameFilme) {
        System.out.println("Inicianco o filme " + nameFilme);
        System.out.println("Carregando o filme na resolucao " + resolucaoTela);
        carregarAudioFilme();
    }

    private void carregarAudioFilme() {
        if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US") {
            System.out.println("Carregando o audio em " + idiomaPreferencial);
        } else {
            System.out.println("Carregando o audio em EN-US");
        }
    }
}