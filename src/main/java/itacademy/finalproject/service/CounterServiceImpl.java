package itacademy.finalproject.service;

import itacademy.finalproject.entity.*;
import itacademy.finalproject.model.CounterModel;
import itacademy.finalproject.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CounterServiceImpl implements CounterService {
    @Autowired
    private CounterRepository counterRepository;
    @Autowired
    private WallService wallService;
    @Autowired
    private WindowService windowService;
    @Autowired
    private BrickService brickService;

    @Override
    public BrickCounter saveCounter(BrickCounter brickCounter) {
        return counterRepository.save(brickCounter);
    }

    @Override
    public BrickCounter saveCounter(CounterModel counterModel) {
        BrickCounter brickCounter = new BrickCounter();
        Wall wall = wallService.getWallById(counterModel.getWallId());
        Window window = windowService.getWindowById(counterModel.getWindowId());
        Brick brick = brickService.getBrickById(counterModel.getBrickId());

        Double a = wall.getLength()/brick.getLength();
        Double b = wall.getHeight()/brick.getHeight();
        Double c = window.getLength()/brick.getLength();
        Double d = window.getHeight()/brick.getHeight();
        Double totalWindow = c * d;
        Double totalBrickWithOutWindow = a * b;
        Double totalBrick = totalBrickWithOutWindow - totalWindow;

        brickCounter.setBrick(brick);
        brickCounter.setWall(wall);
        brickCounter.setWindow(window);
        brickCounter.setCount(totalBrick.intValue());
        return counterRepository.save(brickCounter);
    }

    @Override
    public BrickCounter deleteCounter(Long id) {
        BrickCounter brickCounter = getCounterById(id);
        if (brickCounter != null){
            counterRepository.delete(brickCounter);
            return brickCounter;
        }
        return null;
    }

    @Override
    public BrickCounter updateCounter(BrickCounter brickCounter, Long id) {
        BrickCounter counter1 = getCounterById(id);
        counter1.setBrick(brickCounter.getBrick());
        counter1.setCount(brickCounter.getCount());
        counter1.setWindow(brickCounter.getWindow());
        counter1.setWall(brickCounter.getWall());
        return saveCounter(counter1);
    }

    @Override
    public List<BrickCounter> getAllCounter() {
        return counterRepository.findAll();
    }

    @Override
    public BrickCounter getCounterById(Long id) {
        return counterRepository.findById(id).orElse(null);
    }
}
