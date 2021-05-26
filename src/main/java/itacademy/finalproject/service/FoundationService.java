package itacademy.finalproject.service;

import itacademy.finalproject.entity.Foundation;

import java.util.List;

public interface FoundationService {
    List<Foundation> getAllFoundation();
    Foundation getFoundationById(Long id);
    Foundation saveFoundation(Foundation foundation);
    Foundation deleteFoundation(Long id);
    Foundation updateFoundation(Foundation foundation,Long id);

}
