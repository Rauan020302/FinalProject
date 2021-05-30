package itacademy.finalproject.controller;

import itacademy.finalproject.entity.Cement;
import itacademy.finalproject.model.CementModel;
import itacademy.finalproject.service.CementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cement")
public class CementController {
    @Autowired
    private CementService cementService;

    @GetMapping
    public List<Cement> getAllCement(){
        return cementService.getALlCement();
    }

    @GetMapping("/{id}")
    public Cement getCementById(@PathVariable Long id){
        return cementService.getCementById(id);
    }

    @PostMapping
    public Cement saveCement(@RequestBody CementModel cementModel){
        return cementService.saveCement(cementModel);
    }

    @DeleteMapping("/{id}")
    public Cement deleteCementById(@PathVariable Long id){
        return cementService.deleteCementById(id);
    }

    @PutMapping("/{id}")
    public Cement updateCement(@RequestBody Cement cement,@PathVariable Long id){
        return cementService.updateCementById(cement,id);
    }
}
