package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class EnterController {

    private Window window = new Window();

    @FXML
    private void enter(ActionEvent event) throws IOException {
        try {
            window.open("word", "Scrabble Points Generator", 600, 800);
            window.close(event);
        } catch (Exception e) {
            System.err.println("Cannot load file!");
        }
    }
}
