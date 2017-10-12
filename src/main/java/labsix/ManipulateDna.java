package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * This class uses the unholy union of Biology and Computer Science to show how DNA can mutate.  
 * The program uses the above imports and substrings to  
 * produce output statements. 
 *
 * <p>Bugs: This program has no known bugs, but is missing code
 *
 * @author Isaiah Speights
 */

public class ManipulateDna {

  /**
   * This is the main method for ManipulateDna. 
   * This method will use strings and substrings to delete, insert, and otherwise change    
   * the order of dna nucleotides that are taken from another file as input.
   * The program makes use of the random number generation class to ensure proepr mutation. 
   */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Isaiah Speights " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String chosenDnaString = scanner.nextLine();
    System.out.println("Your chosen DNA String is: " + chosenDnaString);
    // Step Two: Compute the complement of the DNA String
    System.out.println(" \nComputing your DNA String Complement Now");
    String dnaComplement1 = chosenDnaString.replace('a', 'T');
    String dnaComplement2 = dnaComplement1.replace('t', 'A');
    String dnaComplement3 = dnaComplement2.replace('c', 'G');
    String dnaComplement4 = dnaComplement3.replace('g', 'C');
    chosenDnaString = chosenDnaString.toUpperCase();
    System.out.println(" \nThe complement of " + chosenDnaString + " is " + dnaComplement4 + ".");
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    // use substrings to isolate the code into halves
    System.out.println(" \nBelow is a demonstration of a mutation!");
    char dnaChar1 = 'A';
    char dnaChar2 = 'T';
    char dnaChar3 = 'C';
    char dnaChar4 = 'G';
    Random rng = new Random();
    String subString1 = chosenDnaString.substring(0,2);
    String subString2 = chosenDnaString.substring(2,4);
    System.out.println(subString1 + chosenDnaString.charAt(rng.nextInt(4)) + subString2);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    System.out.println(" \nBelow is a demonstration of a deletion!");
    int deleteThis = rng.nextInt(chosenDnaString.length());
    String substring3 = chosenDnaString.substring(0, deleteThis);
    String substring4 = chosenDnaString.substring(deleteThis + 1);
    System.out.println(substring3 + substring4);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    System.out.println(" \nBelow is a demonstration of random replacement!");
    int deleteThis2 = rng.nextInt(chosenDnaString.length());
    String substring5 = chosenDnaString.substring(0, deleteThis2);
    String substring6 = chosenDnaString.substring(deleteThis2 + 1);
    System.out.println(substring5 + chosenDnaString.charAt(rng.nextInt(4)) + substring6);
    // Step Six: Display a final thankyou message
    System.out.println(" \nThanks for using the ManipulateDna Program.");
  }

}
