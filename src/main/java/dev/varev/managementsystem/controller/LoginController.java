package dev.varev.managementsystem.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Label welcomeText;
    @FXML
    private TextField usernameInput;
    @FXML
    private PasswordField passwordInput;
    @FXML
    private Button loginButton;
    @FXML
    private Label notification;
    @FXML
    private Label registerLink;

    @FXML
    protected void handleLogin() {
        welcomeText.setText("Logging in...");
    }

}