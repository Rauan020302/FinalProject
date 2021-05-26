package itacademy.finalproject.service;

import itacademy.finalproject.entity.Cement;
import itacademy.finalproject.repository.CementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CementServiceImpl implements CementService {
    @Autowired
    private CementRepository cementRepository;


    @Override
    public List<Cement> getALlCement() {
        return cementRepository.findAll();
    }

    @Override
    public Cement getCementById(Long id) {
        return cementRepository.findById(id).orElse(null);
    }

    @Override
    public Cement deleteCementById(Long id) {
        Cement cement = getCementById(id);
        if (cement != null){
            cementRepository.delete(cement);
            return cement;
        }
        return null;
    }

    @Override
    public Cement updateCementById(Cement cement, Long id) {
        Cement cement1 = getCementById(id);
        cement1.setName(cement.getName());
        cement1.setType(cement.getType());
        return saveCement(cement1);
    }

    @Override
    public Cement saveCement(Cement cement) {
        return cementRepository.save(cement);
    }
}
