package itacademy.finalproject.service;

import itacademy.finalproject.entity.Window;
import itacademy.finalproject.repository.WindowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WindowServiceImpl implements WindowService {
    @Autowired
    private WindowRepository windowRepository;

    @Override
    public List<Window> getAllWindows() {
        return windowRepository.findAll();
    }

    @Override
    public Window getWindowById(Long id) {
        return windowRepository.findById(id).orElse(null);
    }

    @Override
    public Window deleteWindowById(Long id) {
        Window window = getWindowById(id);
        if (window != null){
            windowRepository.delete(window);
            return window;
        }
        return null;
    }

    @Override
    public Window updateWindow(Window window, Long id) {
        Window window1 = getWindowById(id);
        window1.setBrand(window.getBrand());
        window1.setCount(window.getCount());
        window1.setHeight(window.getHeight());
        window1.setHouse(window.getHouse());
        window1.setLength(window.getLength());
        return saveWindow(window1);
    }

    @Override
    public Window saveWindow(Window window) {
        return windowRepository.save(window);
    }
}
