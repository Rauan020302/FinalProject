package itacademy.finalproject.service;

import itacademy.finalproject.entity.House;
import itacademy.finalproject.entity.Wall;
import itacademy.finalproject.model.WallModel;
import itacademy.finalproject.repository.WallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WallServiceImpl implements WallService {
    @Autowired
    private WallRepository wallRepository;
    @Autowired
    private HouseService houseService;
    @Override
    public List<Wall> getAllWalls() {
        return wallRepository.findAll();
    }

    @Override
    public Wall getWallById(Long id) {
        return wallRepository.findById(id).orElse(null);
    }

    @Override
    public Wall deleteWall(Long id) {
        Wall wall =getWallById(id);
        if (wall != null){
            wallRepository.delete(wall);
            return wall;
        }
        return null;
    }

    @Override
    public Wall updateWall(WallModel wallModel, Long id) {
        Wall wall = getWallById(id);
        House house = houseService.getHouseById(wallModel.getHouseId());
        wall.setLength(wallModel.getLength());
        wall.setHeight(wallModel.getHeight());
        wall.setHouse(house);
        return saveWall(wall);
    }

    @Override
    public Wall saveWall(Wall wall) {
        return wallRepository.save(wall);
    }

    @Override
    public Wall saveWall(WallModel wallModel) {
        Wall wall = new Wall();
        House house = houseService.getHouseById(wallModel.getHouseId());
        wall.setLength(wallModel.getLength());
        wall.setHeight(wallModel.getHeight());
        wall.setHouse(house);
        return wallRepository.save(wall);
    }

}
