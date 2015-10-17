package pulidor_suelo;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
//import pulidor_suelo.Pulidor;

public class Pulidor extends JFrame {
    
    public Pulidor(int x, int y){
        super("Prueba");
        this.setLayout(new GridLayout(x,y));
        //this.setPreferredSize(x*10,y*10);
        this.setBackground(Color.LIGHT_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //his.add(new Suelo(x,y), BorderLayout.CENTER);
        this.getContentPane().add(new Suelo(x,y));
        this.pack();

        this.setVisible(true);
        
        /*FlowLayout dis= new FlowLayout();
        setLayout(dis);
        JButton play  = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pausa = new JButton("Pausa");
        add(play);
        add(stop);
        add(pausa);
        setVisible(true);*/
        
        
    }
   
    public static void main (String[] args){
        System.out.print("filas:");
        Scanner pop = new Scanner(System.in);
        int filas = pop.nextInt();
        System.out.print("columnas:");
        Scanner popo = new Scanner(System.in);
        int columnas = popo.nextInt();
        
        Pulidor pb = new Pulidor(filas,columnas);
       
    }
}
