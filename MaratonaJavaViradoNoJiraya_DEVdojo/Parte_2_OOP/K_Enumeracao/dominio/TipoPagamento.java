package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.K_Enumeracao.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public double calcularDesconto(double valor){
        return 0;
    }
}
