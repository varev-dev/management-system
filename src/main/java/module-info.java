module dev.varev.managementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires lombok;
    requires org.hibernate.orm.core;
    requires java.naming;


    opens dev.varev.managementsystem to javafx.fxml;
    exports dev.varev.managementsystem;
    opens dev.varev.managementsystem.controller to javafx.fxml;
    exports dev.varev.managementsystem.controller;
    exports dev.varev.managementsystem.service;
    exports dev.varev.managementsystem.model;
    exports dev.varev.managementsystem.repository;
}