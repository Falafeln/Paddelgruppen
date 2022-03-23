package com.hackaton.grupp1.hackaton_grupp_1.controller;

import com.hackaton.grupp1.hackaton_grupp_1.entity.Customer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        setUpCustomerTableview();

    }

    // Customer tab
    @FXML
    private TableColumn<Customer, String> customerCounty;

    @FXML
    private TableColumn<Customer, String> customerEmail;

    @FXML
    private TableColumn<Customer, String> customerFirstName;

    @FXML
    private TableColumn<Customer, Integer> customerID;

    @FXML
    private TableColumn<Customer, String> customerLastName;

    @FXML
    private TableView<Customer> customerTV;

    private void setUpCustomerTableview() {

        customerCounty.setCellValueFactory(new PropertyValueFactory<Customer, String>("county"));
        customerEmail.setCellValueFactory(new PropertyValueFactory<Customer, String>("email"));
        customerID.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("id"));
        customerFirstName.setCellValueFactory(new PropertyValueFactory<Customer, String>("firstName"));
        customerLastName.setCellValueFactory(new PropertyValueFactory<Customer, String>("lastName"));
    }


    //Arena tab

    //Court tab

    //Booking tab


}