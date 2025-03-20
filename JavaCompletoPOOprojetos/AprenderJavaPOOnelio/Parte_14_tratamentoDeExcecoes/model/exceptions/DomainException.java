package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_14_tratamentoDeExcecoes.model.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
