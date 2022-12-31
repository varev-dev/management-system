package dev.varev.managementsystem;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        Main.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setWidth(1024);
        stage.setHeight(768);
        stage.setTitle("Enterprise Resource Management");
        stage.setScene(scene);
        stage.show();
    }

    public static void changeScene(String profile) {
        profile += ".fxml";
        Parent parent = null;

        try {
            parent = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(profile)));
        } catch (IOException ignore) {
            /* TODO: Redirect to error page */
        }

        stage.getScene().setRoot(parent);
    }

    public static void changeSceneDelayed(String profile, Duration delay) {
        profile += ".fxml";
        Parent parent = null;

        try {
            parent = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(profile)));
        } catch (IOException ignore) {
            /* TODO: Redirect to error page */
        }

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Parent finalParent = parent;
        executorService.scheduleAtFixedRate(() -> {
            stage.getScene().setRoot(finalParent);
        }, delay.toMillis(), 1, TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) {
        launch();
    }

}