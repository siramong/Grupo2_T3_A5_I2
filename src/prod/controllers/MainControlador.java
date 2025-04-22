/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.controllers;

import prod.models.MainModelo;
import prod.views.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC_12
 */
public class MainControlador implements ActionListener {

    MainModelo ModeloMain;
    MainVista VistaMain;

    public MainControlador(MainModelo ModeloMain, MainVista VistaMain) {
        this.ModeloMain = ModeloMain;
        this.VistaMain = VistaMain;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object btn = e.getSource();
        if (btn.equals(VistaMain)) {
        }
    }

}
