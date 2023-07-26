package uff.ic.lleme.tcc00328.exercicios.CamilaFerrari.ex1;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ex1 {
    
    public static int interval = 100;
    public static void main(String[] args){
        //qtos números gerados
        int n = 1000;
        //gera arquivo output saida.txt e cria vetor
        randomNumberWriter(n);        
        printHistogram(makeHistogram(arrayReader(n)));
    }    


public static void randomNumberWriter(int amount){
    //gera o arquivo saida.txt
    try {
        FileWriter myWriter = new FileWriter("saida.txt");
        Random random = new Random();
        for(int i = 0; i < amount; i++){
            //colocando os números aleatórios
            int n = random.nextInt(interval);
            //escrever no arquivo os numeros gerados
            myWriter.write(n + "\n");
        }
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}

public static int[] arrayReader(int amount){
    int [] arrayNumbers = new int[amount];
    try {
        File file = new File("saida.txt");
        Scanner myReader = new Scanner(file);
        int i = 0;
        while (myReader.hasNextLine()) {
          String line = myReader.nextLine();
          arrayNumbers[i] = Integer.parseInt(line);
          i++;
        }
        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    return arrayNumbers;
}

public static float[] makeHistogram(int[] arrayNumbers){
    float [] arrayPercentage = new float[interval];
    for(int i = 0; i < arrayNumbers.length; i++) {
        arrayPercentage[arrayNumbers[i]]++;
    }
    for(int i = 0; i < interval; i++){
       float percentage = (arrayPercentage[i]/arrayNumbers.length)*100;
       arrayPercentage[i] = percentage;
    }
    return arrayPercentage; 
} 

public static void printHistogram(float[] arrayPercentage){
    for(int i = 0; i < interval; i++){
        System.out.printf("%d = %.2f%%\n", i, arrayPercentage[i]);

        // System.out.println(String.valueOf(i) + " = " + String.valueOf(arrayPercentage[i]) + "%");
    }
}
}


