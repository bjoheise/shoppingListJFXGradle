module com.example.shoppinglistjfxgradle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.shoppinglistjfxgradle to javafx.fxml;
    exports com.example.shoppinglistjfxgradle;
}