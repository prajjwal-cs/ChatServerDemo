module io.github.prajjwal.chatserverdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.prajjwal.chatserverdemo to javafx.fxml;
    exports io.github.prajjwal.chatserverdemo;
}