package Seminar_06.HW_NoteBook.model;

import java.util.List;

public interface FileOperation {

    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
