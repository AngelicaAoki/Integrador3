/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.presentacion.controladores;

import ar.com.educacionit.vehiculos.presentacion.ventanas.Ventanas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rodolfo Durante
 */
public class CompradoresVentanaControlador extends ConcesionariaControlador implements Initializable {

    @FXML
    private Button btn_close;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirEdicion(ActionEvent event) {
        Stage stage = (Stage) btn_close.getScene().getWindow();
        super.mainApp.mostrarVentanaModal(Ventanas.CompradoresEdicion, stage);
    }

    @FXML
    private void cerrarVentana(ActionEvent event) {
        
    }
}
