package itacademy.finalproject.service;

import itacademy.finalproject.entity.Window;
import itacademy.finalproject.model.WindowModel;

import java.util.List;

public interface WindowService {
    List<Window> getAllWindows();
    Window getWindowById(Long id);
    Window deleteWindowById(Long id);
    Window updateWindow(Window window, Long id);
    Window saveWindow(Window window);
    Window saveWindow(WindowModel windowModel);
}
