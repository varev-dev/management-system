package dev.varev.managementsystem.controller;

import dev.varev.managementsystem.Main;
import dev.varev.managementsystem.service.LoginService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.time.Duration;

public class LoginController {

    private LoginService loginService;

    @FXML
    private Label welcomeText;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginButton;
    @FXML
    private Label notification;
    @FXML
    private Label registerRedirection;

    @FXML
    protected void handleLogin() {
        welcomeText.setText("Logging in...");
    }

    @FXML
    protected void redirectToRegister() {
        welcomeText.setText("Redirecting...");
        Main.changeSceneDelayed("register", Duration.ofMillis(1000));
    }

}