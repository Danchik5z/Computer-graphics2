package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {

        //вращение
        Rotate rotate = new Rotate(20,1000, 200);
        //перемещение
        Translate translate = new Translate(25, 50);
        //масштабирование
        Scale scale = new Scale(1.3,1.3,700,300);
        //вытягивание
        Shear shear = new Shear(0.5,0,300,500);
        //точка1
        Line point1 = new Line(500,500,500,500);
        point1.setStroke(Color.GREEN);
        //точка2
        Circle point2 = new Circle(400, 400,1, Color.BLUE);
        //линия
        Line line = new Line(100, 250, 500, 50);
        line.setStroke(Color.PURPLE);
        //прямоугольник
        Rectangle rec = new Rectangle(100,400,200,100);
        rec.setFill(Color.LIGHTBLUE);
        //круг
        Circle circle = new Circle(700, 300, 100, Color.YELLOW);
        circle.setStroke(Color.BLUE);
        //Эллипс
        Ellipse ellipse = new Ellipse(1000,200, 180,100);
        ellipse.setFill(Color.LIGHTGREEN);

        Button button1 = new Button("Масштабирование");
        button1.setOnAction(event -> {
            circle.getTransforms().addAll(scale);
        });

        Button button2 = new Button("Перемещение");
        button2.setLayoutX(120);
        button2.setOnAction(event -> {
            line.getTransforms().addAll(translate);
        });

        Button button3 = new Button("Поворот");
        button3.setLayoutX(215);
        button3.setOnAction(event -> {
            ellipse.getTransforms().addAll(rotate);
        });

        Button button4 = new Button("Вытягивание");
        button4.setLayoutX(279);
        button4.setOnAction(event -> {
            rec.getTransforms().addAll(shear);
        });


        Group root = new Group(point1, point2, line, rec, circle, ellipse, button1, button2, button3, button4);
        stage.setScene(new Scene(root, 1200, 600));
        stage.setTitle("Фигуры");
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
