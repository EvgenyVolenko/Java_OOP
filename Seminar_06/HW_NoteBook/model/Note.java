package Seminar_06.HW_NoteBook.model;

public class Note {

    private String id = "";
    private String dateTime;
    private String header;
    private String noteText;

    public Note(String id, String dateTime, String header, String noteText) {
        this.id = id;
        this.dateTime = dateTime;
        this.header = header;
        this.noteText = noteText;
    }

    @Override
    public String toString() {
        return "Запись № " + id + " Дата, время " + getDateTime() + "\nЗаголовок" + header + "\n" + noteText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
}
