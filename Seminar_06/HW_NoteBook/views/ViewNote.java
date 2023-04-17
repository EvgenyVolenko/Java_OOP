package Seminar_06.HW_NoteBook.views;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Seminar_06.HW_NoteBook.controllers.DateToString;
import Seminar_06.HW_NoteBook.controllers.NoteController;
import Seminar_06.HW_NoteBook.model.Note;

public class ViewNote {

    private NoteController noteController;
    

    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run() {

        Commands com = Commands.NONE;

        while (true) {
            try {
                Menu.printMenu();
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) {
                    return;
                }

                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();
                        break;
                    case LIST:
                        list();
                        break;
                    case UPDATE:
                        updatenote();
                        break;
                    case DELETE:
                        delnote();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void updatenote() throws Exception {
        String id = prompt("Идентификатор записи: ");
        Note note = noteController.readNote(id);
        System.out.println(note);
        System.out.println();
        String dateTime = new DateToString(new Date()).toString();
        String header = prompt("Заголовок: ");
        String noteText = prompt("Текст записи: ");
        noteController.updateNote(new Note(id, dateTime, header, noteText));
    }

    private void create() {
        String dateTime = new DateToString(new Date()).toString();
        String header = prompt("Заголовок: ");
        String noteText = prompt("Текст записи: ");
        noteController.saveNote(new Note(dateTime, header, noteText));
    }

    private void read() throws Exception {
        String id = prompt("Идентификатор записи: ");
        Note note = noteController.readNote(id);
        System.out.println(note);
    }

    private void delnote() throws Exception {
        String id = prompt("Идентификатор записи для удаления: ");
        noteController.deleteNote(id);
    }

    private void list() {
        List<Note> allnotes = noteController.allnotes();
        for (Note note : allnotes) {
            System.out.println(note);
            System.out.println();
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.print(message);
        return in.nextLine();
    }
}
