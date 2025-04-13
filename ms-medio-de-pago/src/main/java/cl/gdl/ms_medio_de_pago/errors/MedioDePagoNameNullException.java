package cl.gdl.ms_medio_de_pago.errors;

public class MedioDePagoNameNullException extends BaseServiceException{
    public MedioDePagoNameNullException(String fieldName) {
        super("El campo '" + fieldName + "' no debe ser nulo.");
    }
}
