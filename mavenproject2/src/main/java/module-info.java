module com.lyboidat.mavenproject2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lyboidat.mavenproject2 to javafx.fxml;
    exports com.lyboidat.mavenproject2;
}
