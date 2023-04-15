package Seminar_06.HW_NoteBook.model;

import java.util.List;

public interface Repository {

    List<Note> getAllNotes();

    String createNote(Note note);

    void updateNote(Note note);

    void deleteNote(String noteId);
}
