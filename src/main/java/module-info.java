module com.example.jpong {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jpong to javafx.fxml;
    exports com.example.jpong;
}