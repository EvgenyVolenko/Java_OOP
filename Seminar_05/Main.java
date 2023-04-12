package Seminar_05;

import Seminar_05.controllers.UserController;
import Seminar_05.model.FileOperation;
import Seminar_05.model.FileOperationImpl;
import Seminar_05.model.Repository;
import Seminar_05.model.RepositoryFile;
import Seminar_05.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        // FileOperation fileOperation = new FileOperationImpl("users.txt");
        FileOperation fileOperation = new FileOperationImpl("usersDot.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
