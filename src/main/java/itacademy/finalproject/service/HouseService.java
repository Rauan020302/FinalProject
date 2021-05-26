package itacademy.finalproject.service;

import itacademy.finalproject.entity.House;

import java.util.List;

public interface HouseService {
    List<House> getAllHouse();
    House saveHouse (House house);
    House deleteHouseById (Long id);
    House updateHouseById (House house, Long id);
    House getHouseById (Long id);
}
