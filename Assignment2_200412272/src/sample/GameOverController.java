package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class GameOverController {

    private Window window = new Window();

    @FXML
    public void close (ActionEvent event) throws IOException {
        try {
            window.close(event);
        } catch (Exception e) {
            System.err.println("Cannot clear text field");
        }
    }

    @FXML
    public void restart (ActionEvent event) throws IOException {

        try {
            window.open("word", "Scrabble Points Generator", 600, 800);
            window.close(event);
        }
        catch (Exception e) {
            System.err.println("Cannot restart file!");
        }
    }

}
