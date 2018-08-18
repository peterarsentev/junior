package ru.job4j.bomberman;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;


public class Bomberman extends Application {
    @Override
    public void start(Stage stage) {
        int limitX = 300;
        int limitY = 300;
        Group group = new Group();
        Rectangle rect = new Rectangle(50, 100, 10, 10);
        group.getChildren().add(rect);
        Thread move = new Thread() {
            @Override
            public void run() {
                double directX = 1;
                double directY = 1;
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        rect.setX(rect.getX() + directX);
                        rect.setY(rect.getY() + directY);
                        if (rect.getX() <= 0 || rect.getX() >= limitX) {
                            directX *= -1;
                        }
                        if (rect.getY() <= 0 || rect.getY() >= limitY) {
                            directY *= -1;
                        }
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        move.start();
        stage.setOnCloseRequest(
                event -> move.interrupt()
        );
        stage.setScene(new Scene(group, limitX, limitY));
        stage.setTitle("Job4j");
        stage.setResizable(false);
        stage.show();
    }
}
