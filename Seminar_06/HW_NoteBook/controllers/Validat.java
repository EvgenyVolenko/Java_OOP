package Seminar_06.HW_NoteBook.controllers;

import java.util.regex.Pattern;

import Seminar_06.HW_NoteBook.model.Note;

public class Validat {

    final String regex = "^\\S+$";
    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    
    public void validate(Note note) {

        if (!pattern.matcher(note.getHeader()).find()) {
            throw new RuntimeException("Заголовок не может быть пустым");
        }
    }
}