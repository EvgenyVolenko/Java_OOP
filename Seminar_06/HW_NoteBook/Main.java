package Seminar_06.HW_NoteBook;

import Seminar_06.HW_NoteBook.controllers.NoteController;
import Seminar_06.HW_NoteBook.model.FileOperation;
import Seminar_06.HW_NoteBook.model.FileOperationImpl;
import Seminar_06.HW_NoteBook.model.NoteMapper;
import Seminar_06.HW_NoteBook.model.Repository;
import Seminar_06.HW_NoteBook.model.RepositoryFile;
import Seminar_06.HW_NoteBook.views.ViewNote;


public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("Note.txt");
        NoteMapper mapper = new NoteMapper();
        Repository repository = new RepositoryFile(mapper, fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
