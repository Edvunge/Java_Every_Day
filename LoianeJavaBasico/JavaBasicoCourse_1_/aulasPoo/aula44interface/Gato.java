package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula44interface;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    public String raca;


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
