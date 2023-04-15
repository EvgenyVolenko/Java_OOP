package Seminar_06.HW_NoteBook.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {

    private NoteMapper mapper;
    private FileOperation fileOperation;

    public RepositoryFile(NoteMapper mapper, FileOperation fileOperation) {

        this.mapper = mapper;
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public String createNote(Note note) {
        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveNote(notes);
        return id;
    }

    @Override
    public void updateNote(Note note) {
        List<Note> notes = getAllNotes();
        for (Note item : notes) {
            if (item.getId().equals(note.getId())) {
                item.setHeader(note.getHeader());
                item.setDateTime(note.getDateTime());
                item.setNoteText(note.getNoteText());
            }
        }
        saveNote(notes);
    }

    @Override
    public void deleteNote(String noteId) {
        List<Note> notes = getAllNotes();
        for (Note item : notes) {
            if (item.getId().equals(noteId)) {
                notes.remove(item);
            }
        }
        saveNote(notes);
    }
    
    private void saveNote(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
