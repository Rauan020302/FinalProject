package itacademy.finalproject.service;

import itacademy.finalproject.entity.House;
import itacademy.finalproject.model.HouseModel;

import java.util.List;

public interface HouseService {
    List<House> getAllHouse();
    House saveHouse (House house);
    House saveHouse (HouseModel houseModel);
    House deleteHouseById (Long id);
    House updateHouseById (House house, Long id);
    House getHouseById (Long id);
}
