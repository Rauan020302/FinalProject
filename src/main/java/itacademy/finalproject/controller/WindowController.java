package itacademy.finalproject.controller;

import itacademy.finalproject.entity.Window;
import itacademy.finalproject.service.WindowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/window")
public class WindowController {
    @Autowired
    private WindowService windowService;

    @GetMapping
    public List<Window> getAllWindows(){
        return windowService.getAllWindows();
    }
    @GetMapping("/{id}")
    public Window getWindowById(@PathVariable Long id){
        return windowService.getWindowById(id);
    }
    @PostMapping
    public Window saveWindow(@RequestBody Window window){
        return windowService.saveWindow(window);
    }
    @DeleteMapping("/{id}")
    public Window deleteWindow(@PathVariable Long id){
        return windowService.deleteWindowById(id);
    }
    @PutMapping("/{id}")
    public Window updateWindow(@RequestBody Window window,@PathVariable Long id){
        return windowService.updateWindow(window,id);
    }
}
