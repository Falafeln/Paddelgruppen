module com.hackaton.grupp1.hackaton_grupp_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hackaton.grupp1.hackaton_grupp_1 to javafx.fxml;
    exports com.hackaton.grupp1.hackaton_grupp_1;
    exports com.hackaton.grupp1.hackaton_grupp_1.controller;
    opens com.hackaton.grupp1.hackaton_grupp_1.controller to javafx.fxml;
}