module com.converter.converter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.converter.converter to javafx.fxml;
    exports com.converter.converter;
}