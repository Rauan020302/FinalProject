package itacademy.finalproject.service;


import itacademy.finalproject.entity.Cement;

import java.util.List;

public interface CementService {
    List<Cement> getALlCement();
    Cement getCementById(Long id);
    Cement deleteCementById(Long id);
    Cement updateCementById(Cement cement ,Long id);
    Cement saveCement(Cement cement);

}
