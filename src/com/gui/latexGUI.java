package com.gui;

import javax.swing.*;
import java.awt.*;

public class latexGUI   extends JFrame {
    public JPanel mainPanel;
    public JEditorPane texto;
    public JButton boton;
    public JLabel Latex;

    public latexGUI (String titulo){
        super(titulo);
        this.setDefaultCloseOperation(3);
        this.setContentPane(mainPanel);
        this.pack();
    }
}
