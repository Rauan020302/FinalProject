package itacademy.finalproject.controller;

import itacademy.finalproject.entity.Wall;
import itacademy.finalproject.model.WallModel;
import itacademy.finalproject.service.WallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wall")
public class WallController {
    @Autowired
    private WallService wallService;

    @GetMapping
    public List<Wall> getAllWalls(){
        return wallService.getAllWalls();
    }
    @GetMapping("/{id}")
    public Wall getWallById(@PathVariable Long id){
        return wallService.getWallById(id);
    }
    @PutMapping("/{id}")
    public Wall updateWall(@PathVariable Long id,@RequestBody WallModel wallModel){
        return wallService.updateWall(wallModel,id);
    }
    @DeleteMapping("/{id}")
    public Wall deleteWall(@PathVariable Long id){
        return wallService.deleteWall(id);
    }
    @PostMapping
    public Wall saveWall(@RequestBody WallModel wallModel){
        return wallService.saveWall(wallModel);
    }
}
