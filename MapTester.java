import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String,String>phoneBook;
    
    public MapTester()
    {
        phoneBook = new HashMap<>();
    }
    //question 4 
    public void enterNumber(String name,String number){
        phoneBook.put(name,number);
    }
     public String enterNumber(String name){
         return phoneBook.get(name);
     }
     public void printAllNumbers(){
         for(String name : phoneBook.keySet()){
             System.out.println(name + ":" + phoneBook.get(name));
         }
     }
}