/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.*;

/**
 *
 * @author rodry
 */
public class Paneles {
    //creo el marco que es un frame
    static Frame marco = new Frame();
    //
    static Panel p1 = new Panel();
    static Panel p2 = new Panel(new GridLayout(0, 2));
    static Panel p3 = new Panel();

    static Label l1 = new Label("Etiqueta 1");
    static Label l2 = new Label("Etiqueta 2");
    static Label l3 = new Label("Etiqueta 3");
    static Label l4 = new Label("Etiqueta 4");
    static Label l5 = new Label("Etiqueta 5");
    static Label l6 = new Label("Etiqueta 6");
    static Label l7 = new Label("Etiqueta 7");


    public static void main(String[] args) {
        marco.setTitle("Marco que incluye 3 paneles");
        //se añaden los controles a los paneles
        p1.add(l1);
        p1.add(l2);
        p2.add(l3);
        p2.add(l4);
        p2.add(l5);
        p3.add(l6);
        p3.add(l7);

        //color de fondo a cada panel
        p1.setBackground(Color.red);
        p2.setBackground(Color.pink);
        p3.setBackground(Color.green);

        //paneles al frame
        marco.add(p1, BorderLayout.NORTH);
        marco.add(p2, BorderLayout.EAST);
        marco.add(p3, BorderLayout.SOUTH);
        marco.setBounds(100,100,180,190);
        marco.setVisible(true);

    }

}
