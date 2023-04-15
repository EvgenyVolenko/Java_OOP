package Seminar_06.HW_NoteBook.controllers;

import java.util.List;

import Seminar_06.HW_NoteBook.model.Note;
import Seminar_06.HW_NoteBook.model.Repository;

public class NoteController {

    private final Validat valid = new Validat();
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) {
        valid.validate(note);
        repository.createNote(note);
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }
        throw new Exception("note not found");
    }

    public List<Note> allnotes() {
        return repository.getAllNotes();

    }

    public void updateNote(Note note) {
        valid.validate(note);
        repository.updateNote(note);
    }

    public void deleteNote(String noteId) {
        repository.deleteNote(noteId);
    }
}
