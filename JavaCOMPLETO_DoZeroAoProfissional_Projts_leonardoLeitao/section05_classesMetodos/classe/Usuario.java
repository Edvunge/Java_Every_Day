package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section05_classesMetodos.classe;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return  false;
        }
    }
}