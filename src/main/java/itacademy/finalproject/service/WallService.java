package itacademy.finalproject.service;

import itacademy.finalproject.entity.Wall;
import itacademy.finalproject.model.WallModel;

import java.util.List;

public interface WallService {
    List<Wall> getAllWalls();
    Wall getWallById(Long id);
    Wall deleteWall(Long id);
    Wall updateWall(WallModel wallModel, Long id);
    Wall saveWall(Wall wall);
    Wall saveWall(WallModel wallModel);
}
