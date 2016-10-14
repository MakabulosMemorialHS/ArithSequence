/* ********************************************************************************
 * ASeqMobile.java
 *
 * Mobile version of the Arithmetic Sequence Demonstration Program.
 *
 * ********************************************************************************/
package ph.mmhsvictoria.aseqmobile;

import java.lang.*;
import java.util.*;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ASeqMobile extends Application {
    @Override
    public void start(Stage primaryStage) {
        String osName = System.getProperty("os.name");
        double width, height;
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        final double outWidth  = 280.0;
        final double outHeight = 100.0;

        if (osName.compareTo("Linux") == 0) {
             width = 350.0;
             height = 600.0;
        }
        else {
            width = visualBounds.getWidth();
            height = visualBounds.getHeight();
        }


        GridPane rootPane = new GridPane();
        Scene scene = new Scene(rootPane, width, height);
        scene.getStylesheets().add("css/default.css");
        rootPane.getStyleClass().add("grid");

        Rectangle outputRect = new Rectangle(outWidth,outHeight);
        outputRect.getStyleClass().add("rectangle");

        outputRect.setArcHeight(6);
        outputRect.setArcWidth(6);

        GridPane.setRowIndex(outputRect, 0);
        GridPane.setColumnIndex(outputRect, 0);
        GridPane.setColumnSpan(outputRect, 5);
        GridPane.setRowSpan(outputRect, 3);
        rootPane.getChildren().add(outputRect);

        Label lb1 = new Label("First Term");
        lb1.getStyleClass().add("field-labels");
        GridPane.setRowIndex(lb1, 3);
        GridPane.setColumnIndex(lb1, 0);
        GridPane.setColumnSpan(lb1, 2);
        rootPane.getChildren().add(lb1);

        Label lb2 = new Label("Second Term");
        lb2.getStyleClass().add("field-labels");
        GridPane.setRowIndex(lb2, 4);
        GridPane.setColumnIndex(lb2, 0);
        GridPane.setColumnSpan(lb2, 2);
        rootPane.getChildren().add(lb2);

        Label lb3 = new Label("Index");
        lb3.getStyleClass().add("field-labels");
        GridPane.setRowIndex(lb3, 5);
        GridPane.setColumnIndex(lb3, 0);
        GridPane.setColumnSpan(lb3, 2);
        rootPane.getChildren().add(lb3);

        Rectangle OKButton     = new Rectangle(280,50);
        OKButton.getStyleClass().add("push-box");

        OKButton.setArcHeight(6);
        OKButton.setArcWidth(6);

        GridPane.setRowIndex(OKButton, 6);
        GridPane.setColumnIndex(OKButton, 0);
        GridPane.setColumnSpan(OKButton, 5);
        rootPane.getChildren().add(OKButton);

        Rectangle cancelButton = new Rectangle(280,50);
        cancelButton.getStyleClass().add("push-box");
        cancelButton.setArcHeight(6);
        cancelButton.setArcWidth(6);

        GridPane.setRowIndex(cancelButton, 7);
        GridPane.setColumnIndex(cancelButton, 0);
        GridPane.setColumnSpan(cancelButton, 5);
        rootPane.getChildren().add(cancelButton);

        TextField tf1    = new TextField();
        tf1.getStyleClass().add("text-fields");
        GridPane.setRowIndex(tf1, 3);
        GridPane.setColumnIndex(tf1, 3);
        GridPane.setColumnSpan(tf1, 3);
        rootPane.getChildren().add(tf1);

        TextField tf2    = new TextField();
        tf2.getStyleClass().add("text-fields");
        GridPane.setRowIndex(tf2, 4);
        GridPane.setColumnIndex(tf2, 3);
        GridPane.setColumnSpan(tf2, 3);
        rootPane.getChildren().add(tf2);

        TextField tf3    = new TextField();
        tf3.getStyleClass().add("text-fields");
        GridPane.setRowIndex(tf3, 5);
        GridPane.setColumnIndex(tf3, 3);
        GridPane.setColumnSpan(tf3, 3);
        rootPane.getChildren().add(tf3);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

