package dev.varev.managementsystem.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegisterController {

    @FXML
    private Label welcomeText;
    @FXML
    private TextField username;
    @FXML
    private TextField emailAddress;
    @FXML
    private ComboBox<String> type;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField passwordConfirmation;
    @FXML
    private CheckBox dataUsageAndTos;
    @FXML
    private Button registerButton;
    @FXML
    private Label loginRedirection;
    @FXML
    private Label notification;

    @FXML
    private void handleRegister() {
        welcomeText.setText("Creating an account...");
    }

}