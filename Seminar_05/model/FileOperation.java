package Seminar_05.model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
