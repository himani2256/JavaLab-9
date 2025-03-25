module org.example.assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.assignment2 to javafx.fxml;
    exports org.example.assignment2;
}