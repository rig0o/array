package com.contralador;

import com.company.matriz;
import com.gui.latexGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listener   implements ActionListener {

    private latexGUI vista;
    private matriz modelo;

    public listener(latexGUI vista, matriz modelos) {
        this.vista = vista;
        this.modelo = modelos;
        this.vista.boton.addActionListener(this);
    }
    public void iniciar (){
        //vista.setTitle("antlr");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String texto = vista.texto.getText();
       String latex = modelo.antlr(texto);
       vista.Latex.setIcon(modelo.actualizarIconLaTex(latex, 30));
    }
}
