package itacademy.finalproject.controller;

import itacademy.finalproject.entity.House;
import itacademy.finalproject.model.HouseModel;
import itacademy.finalproject.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/house")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping
    public List<House> getAllHouse() {
        return houseService.getAllHouse();
    }

    @GetMapping("/{id}")
    public House getHouseById (@PathVariable Long id){
        return houseService.getHouseById(id);
    }

    @PostMapping
    public House saveHouse(@RequestBody HouseModel houseModel){
        return houseService.saveHouse(houseModel);
    }

    @PutMapping("/{id}")
    public House updateHouse(@PathVariable Long id,@RequestBody House house){
        return houseService.updateHouseById(house,id);
    }

    @DeleteMapping("/{id}")
    public House deleteHouseById(@PathVariable Long id){
        return houseService.deleteHouseById(id);
    }
}
