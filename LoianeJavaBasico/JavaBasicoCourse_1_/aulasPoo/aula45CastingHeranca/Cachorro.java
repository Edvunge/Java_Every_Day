package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula45CastingHeranca;

import LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula44interface.AnimalDomesticado;
import LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula44interface.AnimalEstimacao;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String tamanho;
    private String raca;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
