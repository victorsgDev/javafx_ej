package com.example.practica1805;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.util.Date;

public class HelloController {

    @FXML
    ImageView iv1,iv2,iv3;
    @FXML
    Label lbl_datetime, lbl_raiz;
    @FXML
    TextField tf_raiz;
    @FXML
    private Label welcomeText;
    @FXML
    VBox panel;

    public void changeImage(){
        Image imagen= new Image(getClass().getResource("images/a.jpg").toString());
        Image imagen2= new Image(getClass().getResource("images/ala.jpg").toString());
        Image imagen3= new Image(getClass().getResource("images/portero.jpg").toString());

        ImageView foto1=new ImageView(imagen);
        ImageView foto2=new ImageView(imagen2);
        ImageView foto3=new ImageView(imagen3);

        iv1.setImage(imagen);
        iv2.setImage(imagen2);
        iv3.setImage(imagen3);

    }
    public void datetime() {
        String fecha = new Date().toString();
        lbl_datetime.setText(fecha);
    }

    public void raiz_cuadrada(){
        try {
            double num = Double.parseDouble(tf_raiz.getText());
            lbl_raiz.setText(String.valueOf(Math.sqrt(num)));
        }catch (Exception e){
            lbl_raiz.setText("Introduce un número");
        }
        }

    public void cambiar_fondo(){
        panel.setStyle("-fx-background-color: brown");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}