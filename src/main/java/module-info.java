module morra.module05lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens morra.module05lab2 to javafx.fxml;
    exports morra.module05lab2;
}