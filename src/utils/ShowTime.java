package utils;
import com.Books;
import moc.BookEntity;
import utils.ServiceImpl;

import javafx.application.Application;
import javafx.stage.Stage;

public class ShowTime extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BookEntity bookentity =  new BookEntity();
        Books books = new Books();
        books.setId("1");
        books.setName("wang");

        ServiceImpl impl = new ServiceImpl();
        BookEntity bookentityTar = (BookEntity)impl.objectInfect(books, bookentity,9,3);
        System.out.println(bookentityTar.getResultName());



    }
}
