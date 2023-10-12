module com.mycompany.tipcalculator_lukegreen {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tipcalculator_lukegreen to javafx.fxml;
    exports com.mycompany.tipcalculator_lukegreen;
}
