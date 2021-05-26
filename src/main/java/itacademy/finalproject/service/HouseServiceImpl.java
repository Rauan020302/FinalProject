package itacademy.finalproject.service;

import itacademy.finalproject.entity.House;
import itacademy.finalproject.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseRepository houseRepository;

    @Override
    public List<House> getAllHouse() {
        return houseRepository.findAll();
    }

    @Override
    public House saveHouse(House house) {
        return houseRepository.save(house);
    }

    @Override
    public House deleteHouseById(Long id) {
        House house = getHouseById(id);
        if (house != null){
            houseRepository.delete(house);
            return house;
        }
        return null;
    }

    @Override
    public House updateHouseById(House house, Long id) {
//        House house1 = getHouseById(id);
//        house1.
        return null;
    }

    @Override
    public House getHouseById(Long id) {
        return houseRepository.findById(id).orElse(null);
    }
}
