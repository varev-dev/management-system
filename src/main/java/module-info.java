module dev.varev.managementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.varev.managementsystem to javafx.fxml;
    exports dev.varev.managementsystem;
    exports dev.varev.managementsystem.controller;
    opens dev.varev.managementsystem.controller to javafx.fxml;
}