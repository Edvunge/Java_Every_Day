package Java_COMPLETO_POO_Projetos.AcademiaDevs;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno alunoN = new Aluno();
        alunoN.nome = "edward chris";
        alunoN.rg = 2343;
        alunoN.dataDeNascimntDosAluns = "18/jun/1995";

        Aluno alunoM = new Aluno();
        alunoM.nome = "silvia lemos";
        alunoM.rg = 4312;
        alunoM.dataDeNascimntDosAluns = "01/jan/1999";

        System.out.format("meu nome: %s , sou aluno com numero RG: %d , e data de nascimnt: %s \n",alunoN.nome ,alunoN.rg ,alunoN.dataDeNascimntDosAluns);
        System.out.format("meu nome: %s , sou aluno com numero RG: %d , e data de nascimnt: %s \n",alunoM.nome ,alunoM.rg ,alunoM.dataDeNascimntDosAluns);
    }
}