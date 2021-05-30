package itacademy.finalproject.service;


import itacademy.finalproject.entity.Cement;
import itacademy.finalproject.model.CementModel;

import java.util.List;

public interface CementService {
    List<Cement> getALlCement();
    Cement getCementById(Long id);
    Cement deleteCementById(Long id);
    Cement updateCementById(Cement cement ,Long id);
    Cement saveCement(Cement cement);
    Cement saveCement(CementModel cementModel);

}
