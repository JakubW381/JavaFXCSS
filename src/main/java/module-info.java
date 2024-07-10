module com.example.modelcss {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.modelcss to javafx.fxml;
    exports com.example.modelcss;
}