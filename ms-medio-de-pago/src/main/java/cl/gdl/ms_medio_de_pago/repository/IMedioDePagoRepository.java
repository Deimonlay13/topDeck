package cl.gdl.ms_medio_de_pago.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.gdl.ms_medio_de_pago.dto.MedioDePagoDTO;

@Repository
public interface IMedioDePagoRepository extends CrudRepository<MedioDePagoDTO, UUID> {

    MedioDePagoDTO findByNameMedioDePago(String nameMedioDePago);

    Optional<MedioDePagoDTO> findByNameMedioDePagoIgnoreCase(String nameMedioDePago);

}
