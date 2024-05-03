package Mini_Projects.conversorGeral.dominio;

public class ConversorDeMoedas {

    public double notasKwanzas;
    public double notasEuros;
    public double taxaCambioAoDia;

    public double eurosTOkwanzasConverter(double notasEuros, double notasKwanzas) {
        this.notasKwanzas = this.notasEuros * 908.043;
        return this.notasKwanzas;
    }
    // notasKwzs = notasEuros * 908.043


    // notasEurs = notasKwzs *  0.011
     public double kwanzasTOeurosConverter(double notasKwanzas, double notasEuros) {
        this.notasEuros = 0.011 * this.notasKwanzas;
        return this.notasEuros;
     }


    // 1  Criar um Menu, com varias opcoes de escolhas:
// Para converter de kwanza para euros  ( clique no botao: )

// Para converter de euros para kwanzas ( clique no botao: )

// Para converter de dolar para kwanzas ( clique no botao: )

// Para converter de kwanza para dolar  ( clique no botao: )

}
