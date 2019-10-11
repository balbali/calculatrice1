package Exemple;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Calaculatrice1 extends Application {
    // les champs pour récupérer une valeur et pour afficher les résultats
    TextField valueField, squareField, rootField;

    public void start(Stage primaryStage) {
        Pane aPane = new Pane();
        // Ajouter le lable Donner une valeur
        Label label = new Label("Donner une valeur:");
        label.relocate(10,10);
        label.setPrefSize(100, 30);
        aPane.getChildren().add(label);
        valueField = new TextField();
        valueField.relocate(130,10);
        valueField.setPrefSize(150, 30);
        aPane.getChildren().add(valueField);

        // Ajouter le bouton Calculer
        Button computeButton = new Button("Calculer");
        computeButton.relocate(30,50);
        computeButton.setPrefSize(240, 30);
        aPane.getChildren().add(computeButton);

        // Ajouter le label et le champ pour Le carré
        label = new Label("Le carré:");
        label.relocate(10,100);
        label.setPrefSize(100, 30);
        aPane.getChildren().add(label);

        squareField = new TextField();
        squareField.relocate(130,100);
        squareField.setPrefSize(150, 30);
        squareField.setEditable(false);
        aPane.getChildren().add(squareField);

        // Add the square root label and text field
        label = new Label("La racine carré:");
        label.relocate(10,150);
        label.setPrefSize(100, 30);
        aPane.getChildren().add(label);

        rootField = new TextField();
        rootField.relocate(130,150);
        rootField.setPrefSize(150, 30);
        rootField.setEditable(false);
        aPane.getChildren().add(rootField);

        // Connect the event handlers to the buttons
        computeButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
           String s=valueField.getText();
           Double value=Double.parseDouble(s);
           Double c=value*value;
           Double racine=Math.sqrt(value);
                squareField.setText(String.valueOf(c));
                rootField.setText(String.valueOf(racine));

                                      }
                                  }
        );

        primaryStage.setTitle("Calculatrice Carré & Racine Carré");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(aPane, 300,178));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); } }
