package itacademy.finalproject.service;

import itacademy.finalproject.entity.Foundation;
import itacademy.finalproject.entity.House;
import itacademy.finalproject.model.FoundationModel;
import itacademy.finalproject.repository.FoundationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoundationServiceImpl implements FoundationService {
    @Autowired
    private FoundationRepository foundationRepository;

    @Autowired
    private HouseService houseService;

    @Override
    public List<Foundation> getAllFoundation() {
        return foundationRepository.findAll();
    }

    @Override
    public Foundation getFoundationById(Long id) {
        return foundationRepository.findById(id).orElse(null);
    }

    @Override
    public Foundation saveFoundation(Foundation foundation) {
        return foundationRepository.save(foundation);
    }

    @Override
    public Foundation saveFoundation(FoundationModel foundationModel) {
        House house = houseService.getHouseById(foundationModel.getHouseId());
        if (house == null)return null;
        Foundation foundation = Foundation.builder()
                .length(foundationModel.getLength())
                .height(foundationModel.getHeight())
                .width(foundationModel.getWidth())
                .house(house).build();
        return saveFoundation(foundation);
    }

    @Override
    public Foundation deleteFoundation(Long id) {
        Foundation foundation = getFoundationById(id);
        if (foundation != null){
            foundationRepository.delete(foundation);
            return foundation;
        }
        return null;
    }

    @Override
    public Foundation updateFoundation(Foundation foundation,Long id) {
        Foundation foundation1 = getFoundationById(id);
        foundation1.setLength(foundation.getLength());
        foundation1.setHeight(foundation.getHeight());
        foundation1.setWidth(foundation.getWidth());
        return foundationRepository.save(foundation1);
    }
}
