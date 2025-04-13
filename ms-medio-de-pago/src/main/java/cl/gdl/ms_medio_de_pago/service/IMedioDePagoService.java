package cl.gdl.ms_medio_de_pago.service;

import java.util.List;
import java.util.UUID;

import cl.gdl.ms_medio_de_pago.dto.MedioDePagoDTO;

public interface IMedioDePagoService {

    MedioDePagoDTO insert(MedioDePagoDTO medioDePago);

    MedioDePagoDTO update(UUID id, MedioDePagoDTO medioDePago);

    MedioDePagoDTO delete(UUID id);

    MedioDePagoDTO getById(UUID id);

    List<MedioDePagoDTO> getAll();

}
