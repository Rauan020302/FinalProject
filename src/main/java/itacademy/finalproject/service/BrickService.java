package itacademy.finalproject.service;

import itacademy.finalproject.entity.Brick;
import itacademy.finalproject.model.BrickModel;

import java.util.List;

public interface BrickService {
    List<Brick> getAllBricks();
    Brick getBrickById(Long id);
    Brick deleteBrickById(Long id);
    Brick saveBrick(BrickModel brickModel);
    Brick saveBrick(Brick brick);
    Brick updateBrick(BrickModel brickModel,Long id);
}
