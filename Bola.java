package pbo_2;

public class Bola {
    private double jarijari;
    
    public void setjarijari(double jari){
        this.jarijari=jari;
    }
    public double showDiameter(){
        return jarijari*2;
    }
     public double showLuasPermukaan(){
         return 4*Math.PI*Math.pow(jarijari,2);
//         return 4*22/7*Math.pow(jarijari, 2);
    }
     public double showVolume(){
         return Math.PI*Math.pow(jarijari, 3)*4/3;
    }
     public void cetak(){
         System.out.println("jari jari\t:" + jarijari);
         System.out.println("Diameter\t:"+showDiameter());
         System.out.println("Luas Permukaan\t:"+showLuasPermukaan());
         System.out.println("Volume\t\t:"+showVolume());
      
     
     }
    
}
