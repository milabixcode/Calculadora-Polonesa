package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex3;

import java.util.*;

public class jogoDados {
    
    public static int interval = 12;

    private static int rollDices(Random random) {
        return random.nextInt(2, interval + 1);
    }

    public static void main(String[] args){
        
        Random random = new Random();
               
        int initialRelease = rollDices(random);
        System.out.printf("Initial release: %d  \n", initialRelease);           
        
        if(initialRelease == 7 || initialRelease == 11) {
            System.out.printf("You win!");

        } else {
            if(initialRelease == 2 || initialRelease == 3 || initialRelease == 12){
                System.out.printf("You lose!");
            
            } else {
                int point = initialRelease;
                int release;
                do{
                    release = rollDices(random);
                    System.out.printf("Release: %d\n", release);
                }
                while(release != point && release != 7);
                if(release == point) {
                    System.out.printf("You win!");
                } else {
                    System.out.printf("You lose!");
                }
            }                                                
        }  
    }
}
