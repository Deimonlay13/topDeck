package cl.gdl.ms_medio_de_pago.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gdl.ms_medio_de_pago.dto.MedioDePagoDTO;
import cl.gdl.ms_medio_de_pago.service.IMedioDePagoService;

@RestController
@RequestMapping("/api/medio-de-pago")
public class MedioDePagoController {

    @Autowired
    IMedioDePagoService medioDePagoService;
    
    @PostMapping("/insert")
    public MedioDePagoDTO insert(@RequestBody MedioDePagoDTO medioDePago){
        return medioDePagoService.insert(medioDePago);
    }
    
    @PutMapping("update/{id}")
    public MedioDePagoDTO update(@PathVariable UUID id, @RequestBody MedioDePagoDTO medioDePago){
        return medioDePagoService.update(id, medioDePago);
    }

    @DeleteMapping("delete/{id}")
    public MedioDePagoDTO delete(@PathVariable UUID id){
        return medioDePagoService.delete(id);
    }

    
    @GetMapping("getbyid/{id}")
    public MedioDePagoDTO getById(@PathVariable UUID id){
        return medioDePagoService.getById(id);
    }

    @GetMapping
    public List<MedioDePagoDTO> getAll(){
        return medioDePagoService.getAll();
    }
}
