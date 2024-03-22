module com.example {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example to javafx.base, javafx.graphics, javafx.fxml;
    opens com.example.controller to javafx.fxml;
    opens com.example.DTO to javafx.base;
    // exports com.example;

}
