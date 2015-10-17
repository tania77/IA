package pulidor_suelo;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Suelo extends JPanel {
    
    //Baldosa suelo_[][] = new Baldosa [][];
    
    public void paint (Graphics g){
        g.setColor(Color.white);
        g.fillRect(0,0,400,400);
    }
    
    public Suelo(int filas, int columnas){
        super();
        setSize(600,600);
        setVisible(true);
        Baldosa suelo_[][] = new Baldosa [filas][columnas];
         
        Random rnd = new Random();
        
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                if ((i+j)%2==0){
                    suelo_[i][j] = new Baldosa (false, i, j);
                    System.out.print(i+""+j+" ");
                }
                else{
                    suelo_[i][j] = new Baldosa (false, i, j);
                    System.out.print(i+""+j+" ");
                }
            }
            System.out.println();
        }
        
        for (int ale=0; ale<5; ale++){
            int a=((int)(rnd.nextDouble()*10.0)) % filas;
            int b=((int)(rnd.nextDouble()*10.0)) % columnas;
            System.out.println(a+", "+b);
            suelo_[a][b].setObstaculo(true);
        }
    }
}
