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
    @Autowired
    private FoundationService foundationService;

    @Override
    public Counter saveCounter(Counter counter) {
        return counterRepository.save(counter);
    }

    @Override
    public Counter saveCounter(CounterModel counterModel) {
        Counter counter = new Counter();
        Foundation foundation = foundationService.getFoundationById(counterModel.getFoundationId());
        Wall wall = wallService.getWallById(counterModel.getWallId());
        Window window = windowService.getWindowById(counterModel.getWindowId());
        Brick brick = brickService.getBrickById(counterModel.getBrickId());
        counter.setBrick(brick);
        counter.setFoundation(foundation);
        counter.setWall(wall);
        counter.setWindow(window);
        counter.setCount(counterModel.getCount());
        return counterRepository.save(counter);
    }

    @Override
    public List<Counter> getAllCounter() {
        return counterRepository.findAll();
    }

    @Override
    public Counter getCounterById(Long id) {
        return counterRepository.findById(id).orElse(null);
    }
}
