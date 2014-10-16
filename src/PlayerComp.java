
import java.util.Random;

public class PlayerComp extends Player {
     private Random guesser = new Random();
     
    @Override
      public int guess(){
          int guess= guesser.nextInt(6)+1;
          System.out.println("Strzal: "+guess);
          return guess;
      }
     
}
