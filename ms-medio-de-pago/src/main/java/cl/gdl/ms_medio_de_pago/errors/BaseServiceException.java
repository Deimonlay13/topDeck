package cl.gdl.ms_medio_de_pago.errors;

public class BaseServiceException extends RuntimeException {
    public BaseServiceException(String message) {
        super(message);
    }
}
