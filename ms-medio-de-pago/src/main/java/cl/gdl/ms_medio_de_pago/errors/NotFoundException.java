package cl.gdl.ms_medio_de_pago.errors;

public class NotFoundException extends BaseServiceException {
    public NotFoundException(String mensaje) {
        super(mensaje);
    }
}