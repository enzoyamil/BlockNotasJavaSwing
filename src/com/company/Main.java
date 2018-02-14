package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana x = new Ventana();
                x.setSize(700, 600);
                x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                x.setVisible(true);
            }
        });

    }
}
