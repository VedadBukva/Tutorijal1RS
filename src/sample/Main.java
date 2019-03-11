package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scena1, scena2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        primaryStage.setTitle("Prva vježba");
        Label labela = new Label("Dobrodošli na tutorijal - Razvoj Softvera");

        Button tipka1 = new Button("Reci \"Hello World!\"\n");
        tipka1.setOnAction(e -> window.setScene(scena2));

        //Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.setAlignment(Pos.CENTER);

        layout1.getChildren().addAll(labela, tipka1);
        labela.setAlignment(Pos.TOP_CENTER);
        tipka1.setAlignment(Pos.CENTER);
        scena1  = new Scene(layout1, 400, 400);

        Label labela1 = new Label("Hello World!");
        labela1.setStyle("-fx-font-size: 20pt;");

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(labela1);
        scena2 = new Scene(layout2, 400, 400);

        window.setScene(scena1);
        window.setTitle("Tutorijal");
        window.show();

    }


}