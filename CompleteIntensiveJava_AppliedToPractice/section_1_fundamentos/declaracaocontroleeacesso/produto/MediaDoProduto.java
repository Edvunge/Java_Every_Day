package CompleteIntensiveJava_AppliedToPractice.section_1_fundamentos.declaracaocontroleeacesso.produto;

public class MediaDoProduto {
    public static void main(String[] args) {
        // 294 commits
        // 60 dias
        // media

        double numerDeCommits = 294.00;
        int dias = 60;
        double media;

        media = (numerDeCommits + (double) dias)/60;
        System.out.printf("Media: %.1f\n",media);
    }
}
