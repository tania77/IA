package pulidor_suelo;

public class Baldosa {
    boolean obstaculo;
    int posX;
    int posY;
    
    public Baldosa(boolean obstaculo, int x, int y){
        this.obstaculo = obstaculo;
        this.posX = x;
        this.posY = y;
    }
    
    public void setObstaculo(boolean obstaculo){
        this.obstaculo = true;
    }
    
    public boolean getObstaculo(){
        return this.obstaculo;
    }
}