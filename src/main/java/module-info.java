module com.goat.project.system {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.goat.project.system.controller to javafx.fxml;
    exports com.goat.project.system;
}
