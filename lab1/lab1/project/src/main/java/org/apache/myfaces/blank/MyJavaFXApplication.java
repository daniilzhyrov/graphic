package org.apache.myfaces.blank;

import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;

public class MyJavaFXApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Hello World!");

        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
        scene.setFill(Color.LIGHTGRAY);
        Color purple = Color.rgb(115, 38, 245);

        Rectangle r = new Rectangle(90,70,120,100);
        root.getChildren().add(r);
        r.setFill(purple);

        r = new Rectangle(120,30,60,50);
        root.getChildren().add(r);
        r.setFill(purple);

        r = new Rectangle(60,70,30,80);
        root.getChildren().add(r);
        r.setFill(purple);
        r = new Rectangle(210,70,30,70);
        root.getChildren().add(r);
        r.setFill(purple);

        r = new Rectangle(90,170,40,70);
        root.getChildren().add(r);
        r.setFill(purple);
        r = new Rectangle(170,170,40,70);
        root.getChildren().add(r);
        r.setFill(purple);

        r = new Rectangle(100,210,50,30);
        root.getChildren().add(r);
        r.setFill(purple);
        r = new Rectangle(180,210,45,30);
        root.getChildren().add(r);
        r.setFill(purple);

        r = new Rectangle(135,40,8,8);
        root.getChildren().add(r);
        r.setFill(Color.YELLOW);
        r = new Rectangle(160,40,8,8);
        root.getChildren().add(r);
        r.setFill(Color.YELLOW);


        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(120.0, 30.0,
                120.0, 2.0,
                90.0, 10.0);
        polygon.setFill(Color.BLUE);
        root.getChildren().add(polygon);

        polygon = new Polygon();
        polygon.getPoints().addAll(180.0, 30.0,
                185.0, 2.0,
                220.0, 30.0);
        polygon.setFill(Color.BLUE);
        root.getChildren().add(polygon);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
