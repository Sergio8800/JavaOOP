package Lesson5BookPhone.Model.repository;

import java.util.List;

public interface Operation {
    List<String> readAll();
    void saveAll(List<String> data);
}
