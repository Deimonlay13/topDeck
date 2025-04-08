package cl.gdl.ms_stage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gdl.ms_stage.dto.StageDTO;
import cl.gdl.ms_stage.service.IStageService;

@RestController
@RequestMapping("/api/stage")
public class StageController {

    @Autowired
    IStageService stageService;

    @PostMapping
    public StageDTO insert(@RequestBody StageDTO stage){
        return stageService.insert(stage);
    }
    
    // @PutMapping("/{id}")
    // public StageDTO update(@PathVariable Integer id, @RequestBody StageDTO stage){
    //     return stageService.update(id,stage);


}
