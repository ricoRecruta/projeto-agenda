package br.ufpb.dcx.ayla.agenda.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaGUI extends JFrame {
    public AgendaGUI(){
        setTitle("Agenda de Aniversários");
        setSize(800,600);
        setLocation(100,150);
        setResizable(false);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }



    public static void main(String []args){
        JFrame janela = new AgendaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }

}
