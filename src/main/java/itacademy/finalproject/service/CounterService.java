package itacademy.finalproject.service;

import itacademy.finalproject.entity.BrickCounter;
import itacademy.finalproject.model.CounterModel;

import java.util.List;

public interface CounterService {
    BrickCounter saveCounter(BrickCounter brickCounter);
    BrickCounter saveCounter(CounterModel counterModel);
    List<BrickCounter> getAllCounter();
    BrickCounter getCounterById(Long id);
    BrickCounter updateCounter(BrickCounter brickCounter, Long id);
    BrickCounter deleteCounter(Long id);
}
