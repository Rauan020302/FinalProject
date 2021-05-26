package itacademy.finalproject.service;

import itacademy.finalproject.entity.Brick;
import itacademy.finalproject.entity.House;
import itacademy.finalproject.model.BrickModel;
import itacademy.finalproject.repository.BrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrickServiceImpl implements BrickService {
    @Autowired
    private BrickRepository brickRepository;
    @Autowired
    private HouseService houseService;

    @Override
    public List<Brick> getAllBricks() {
        return brickRepository.findAll();
    }

    @Override
    public Brick getBrickById(Long id) {
        return brickRepository.findById(id).orElse(null);
    }

    @Override
    public Brick deleteBrickById(Long id) {
        Brick brick = getBrickById(id);
        if (brick != null){
            brickRepository.delete(brick);
            return brick;
        }
        return null;
    }

    @Override
    public Brick saveBrick(BrickModel brickModel) {
        House house = houseService.getHouseById(brickModel.getHouseId());
        if (house == null) return null;
        Brick brick = Brick.builder()
                .height(brickModel.getHeight())
                .length(brickModel.getLength())
                .name(brickModel.getName())
                .masonry(brickModel.getMasonry())
                .width(brickModel.getWidth())
                .house(house).build();
        return brickRepository.save(brick);
    }

    @Override
    public Brick saveBrick(Brick brick) {
        return brickRepository.save(brick);
    }

    @Override
    public Brick updateBrick(BrickModel brickModel, Long id) {
        Brick brick1 = getBrickById(id);
        House house = houseService.getHouseById(brickModel.getHouseId());
        brick1.setHouse(house);
        brick1.setHeight(brickModel.getHeight());
        brick1.setLength(brickModel.getLength());
        brick1.setMasonry(brickModel.getMasonry());
        brick1.setName(brickModel.getName());
        brick1.setWidth(brickModel.getWidth());
        return saveBrick(brick1);
    }
}
