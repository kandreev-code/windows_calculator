module com.kandreevcode.windows_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kandreevcode.windows_calculator to javafx.fxml;
    exports com.kandreevcode.windows_calculator;
}