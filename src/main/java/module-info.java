module com.example.practica1805 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practica1805 to javafx.fxml;
    exports com.example.practica1805;
}