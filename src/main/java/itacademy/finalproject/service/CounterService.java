package itacademy.finalproject.service;

import itacademy.finalproject.entity.Counter;
import itacademy.finalproject.model.CounterModel;

import java.util.List;

public interface CounterService {
    Counter saveCounter(Counter counter);
    Counter saveCounter(CounterModel counterModel);
    List<Counter> getAllCounter();
    Counter getCounterById(Long id);
}
