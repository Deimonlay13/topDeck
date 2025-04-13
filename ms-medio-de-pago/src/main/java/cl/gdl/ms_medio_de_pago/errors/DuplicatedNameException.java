package cl.gdl.ms_medio_de_pago.errors;

public class DuplicatedNameException extends BaseServiceException {
    public DuplicatedNameException(String name) {
           super("Ya existe una categoria con el nombre: " + name);
       }
   }