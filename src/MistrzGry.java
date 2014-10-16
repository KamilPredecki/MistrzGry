import java.util.Random;
public class MistrzGry {

   
    public static void main(String[] args) {
        
       int numer;
       int b;
        Random kostka = new Random();
       // PlayerComp gracz = new PlayerComp();
       PlayerHuman gracz = new PlayerHuman();
        
      do{
        
         numer = kostka.nextInt(6)+1;
        System.out.println("Wylosowano: "+numer);
        
         b = gracz.guess();
        System.out.println("Strzal:"+b);
        
                
             if(numer==b){
     System.out.println("Bravo!");
     System.out.println(numer);
    } else {
        System.out.println("Pudlo!"); }
             
        System.out.println("_______________________________________");
        
    }while (numer!=b);
      }
      
    }
        
    

    