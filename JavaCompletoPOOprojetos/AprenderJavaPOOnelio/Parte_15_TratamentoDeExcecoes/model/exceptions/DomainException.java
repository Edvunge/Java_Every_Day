package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_15_TratamentoDeExcecoes.model.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
