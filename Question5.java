import java.util.Scanner;
import java.util.HashMap;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
      //count of number user will input 
      int numIntegers = in.nextInt();   

      HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>(); 
      int maxFreq = 0; 
      int mode = 0; 

      //prompt to enter integers 
      for (int i = 0; i < numIntegers; i++) { 
        int current = in.nextInt();  // Read each integer 
        // Update frequency count for every integer 
        if (frequencyMap.containsKey(current)) { 
          frequencyMap.put(current, frequencyMap.get(current) + 1); 
        } else { 
          frequencyMap.put(current, 1); 
        } 

        // Check if current integer has a higher frequency 
        if (frequencyMap.get(current) > maxFreq) { 
          maxFreq = frequencyMap.get(current); 
          mode = current; 
        } 
      } 

      // Output mode 
      System.out.print(mode); 
      in.close(); 
    }
  }
}
