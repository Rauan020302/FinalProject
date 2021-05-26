package itacademy.finalproject.controller;

import itacademy.finalproject.entity.Foundation;
import itacademy.finalproject.service.FoundationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foundation")
public class FoundationController {
    @Autowired
    private FoundationService foundationService;

    @GetMapping
    public List<Foundation> getAllFoundation(){
        return foundationService.getAllFoundation();
    }
    @GetMapping("/{id}")
    public Foundation getFoundationById(@PathVariable Long id){
        return foundationService.getFoundationById(id);
    }
    @DeleteMapping("/{id}")
    public Foundation deleteFoundationById(@PathVariable Long id){
        return foundationService.deleteFoundation(id);
    }
    @PutMapping("/{id}")
    public Foundation updateFoundationById(@RequestBody Foundation foundation, @PathVariable Long id){
        return foundationService.updateFoundation(foundation,id);
    }
    @PostMapping
    public Foundation saveFoundation(@RequestBody Foundation foundation){
        return foundationService.saveFoundation(foundation);
    }
}
