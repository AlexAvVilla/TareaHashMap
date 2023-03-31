/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelos.MapModelo;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class MapController implements ActionListener{
    frmPrincipal VistaPrincipal;
    MapModelo ModeloMapa;

    public MapController(frmPrincipal VistaPrincipal, MapModelo ModeloMapa) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloMapa = ModeloMapa;
        
        this.VistaPrincipal.setVisible(true);
        
        this.VistaPrincipal.btnIngresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnIngresar){
            this.ModeloMapa.IngresarMap(Integer.parseInt(this.VistaPrincipal.txtCod.getText()), this.VistaPrincipal.txtNombre.getText());
        }
    }
    
    
}
