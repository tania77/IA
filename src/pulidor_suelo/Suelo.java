package pulidor_suelo;

import java.awt.*;
import javax.swing.*;
import java.util.Random;
//HOLA
public class Suelo extends JPanel {
    
    int filas_;
    int columnas_;
    
    public void paint (Graphics g){
        Toolkit kit;
        Dimension dimensionPantalla;
        int altura;
        int anchura;
        kit = Toolkit.getDefaultToolkit();
        dimensionPantalla = kit.getScreenSize();
        altura = (int)dimensionPantalla.getHeight();
        anchura = (int)dimensionPantalla.getWidth();
        
        int altoBaldosa = altura/filas_;
        int anchoBaldosa = anchura/columnas_;
        g.setColor(Color.white);
        g.fillRect(0,0,altoBaldosa,anchoBaldosa);
        
        for (int i=0; i<filas_; i++){
            for (int j=0; j<columnas_; j++){
                if ((i+j)%2 == 0){
                    g.setColor(Color.black);
                    g.fillRect(0+j*altoBaldosa, 0+i*anchoBaldosa, altoBaldosa, anchoBaldosa);
                }
                else{
                    g.setColor(Color.white);
                    g.fillRect(0+j*altoBaldosa, 0+i*anchoBaldosa, altoBaldosa, anchoBaldosa);
                }
            }
        }
        
        
    }
    
    public Suelo(int filas, int columnas){
        super();
        filas_ = filas;
        columnas_ = columnas;
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
