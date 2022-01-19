package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField email_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button logInButton;

    @FXML
    private Button signUpButton;

    @FXML
    void logInAction(ActionEvent event) {

    }

    @FXML
    void signUpAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert email_field != null : "fx:id=\"email_field\" was not injected: check your FXML file 'log in page.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'log in page.fxml'.";
        assert logInButton != null : "fx:id=\"logInButton\" was not injected: check your FXML file 'log in page.fxml'.";
        assert signUpButton != null : "fx:id=\"signUpButton\" was not injected: check your FXML file 'log in page.fxml'.";

    }
}
