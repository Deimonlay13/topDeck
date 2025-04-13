package cl.gdl.ms_medio_de_pago.errors;

public class NoDataException  extends BaseServiceException{
    public NoDataException() {
        super("No existen datos.");
    }
}

