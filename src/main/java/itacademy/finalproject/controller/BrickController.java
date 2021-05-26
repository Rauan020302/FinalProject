package itacademy.finalproject.controller;

import itacademy.finalproject.entity.Brick;
import itacademy.finalproject.model.BrickModel;
import itacademy.finalproject.service.BrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brick")
public class BrickController {
    @Autowired
    private BrickService brickService;

    @GetMapping
    public List<Brick> getAllBricks(){
        return brickService.getAllBricks();
    }
    @GetMapping("/{id}")
    public Brick getBrickById(@PathVariable Long id){
        return brickService.getBrickById(id);
    }
    @DeleteMapping("/{id}")
    public Brick deleteBrick(@PathVariable Long id){
        return brickService.deleteBrickById(id);
    }
    @PutMapping("/{id}")
    public Brick updateBrick(@PathVariable Long id, @RequestBody BrickModel brickModel){
        return brickService.updateBrick(brickModel,id);
    }
    @PostMapping
    public Brick saveBrick(@RequestBody BrickModel brickModel){
        return brickService.saveBrick(brickModel);
    }
}
