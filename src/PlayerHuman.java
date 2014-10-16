import java.util.Scanner;
public class PlayerHuman extends Player {
    private Scanner  scanner = new Scanner(System.in);
    
    @Override
    public int guess() {
         
      int  liczba = scanner.nextInt();
        
        return liczba;
    }
}
