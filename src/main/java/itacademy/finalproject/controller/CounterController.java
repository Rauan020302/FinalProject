package itacademy.finalproject.controller;

import itacademy.finalproject.entity.BrickCounter;
import itacademy.finalproject.model.CounterModel;
import itacademy.finalproject.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/counter")
public class CounterController {
    @Autowired
    private CounterService counterService;

    @PostMapping
    public BrickCounter saveCounter (@RequestBody CounterModel counterModel){
        return counterService.saveCounter(counterModel);
    }
    @GetMapping
    public List<BrickCounter> getAllCounters (){
        return counterService.getAllCounter();
    }
    @GetMapping("/{id}")
    public BrickCounter getCounterById(@PathVariable Long id){
        return counterService.getCounterById(id);
    }
    @PutMapping("/{id}")
    public BrickCounter updateCounter(@RequestBody BrickCounter brickCounter, @PathVariable Long id){
        return counterService.updateCounter(brickCounter,id);
    }
    @DeleteMapping("/{id}")
    public BrickCounter deleteCounter(@PathVariable Long id){
        return counterService.deleteCounter(id);
    }
}
