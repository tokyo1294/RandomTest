import java.util.Random;
import java.util.ArrayList; 

/**
 * Write a description of class Random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random generator;

    /**
     * Constructor for objects of class Random
     */
    public RandomTester()
    {
        // initialise instance variables
        generator = new Random();
    } 
    public void printOneRandom(){
        System.out.println(generator.nextInt(100));
    }
    ///question 3
    public void printMultiRandom(int howMany){
        int count = 0;
         while (count < howMany) {
            
            System.out.println(generator.nextInt(100));
            count++; 
    }
   } 
   // question 5 of part 2
   public int ThrowDice(){
       int random = generator.nextInt(6);
       return random+1;
   } 
   
   // question 6
   public String getResponse(){
       ArrayList<String>responses = new ArrayList<>();
       responses.add("yes");
       responses.add("no");
       responses.add("maybe");
       int index = generator.nextInt(responses.size()); // question 7
       return responses.get(index);
   }
   //question 8 
   public int getUpToMax(int max){
       int random = generator.nextInt(max);
       return random+1;
   }
   public int getUpToMax2(int max){
       int random = generator.nextInt(max);
       return random+1;
    }
   public int getinRange(int min, int max){
       int random = generator.nextInt(max - min +1);
       return random+min;
   }
}
 