package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula36_relacionamentoEntreClasses;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Tyrion");
        contato.setEndereco("Kings Landing");
        contato.setTelefone("11 99999-9999");

        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        System.out.println(contato.getTelefone());

        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("kings landing");
        end.setEstado("Westeros");
        end.setCep("999999999");

        //contato.setEndereco(end);

        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco());
        }
    }
}
