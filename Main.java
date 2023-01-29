import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.*;
import java.util.*;
import java.util.stream.DoubleStream;

//Creating public class 
public class Main 
{
    //Creating method
    private void Budget(int amount)
    {
       //Store the given input values in the arrays   
	   double toi[] = { 3, 3, 3, 3, 3, 5, 6 };
	   double hindu[] = {2.5, 2.5, 2.5, 2.5, 2.5, 4, 4  };
	   double et[] = {4, 4, 4, 4, 4, 4, 10  };
	   double bm[] = { 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5};
	   double ht[] = { 2, 2, 2, 2, 2, 4, 4 };
	   
	   //Summation of values by using stream
	   double sum1 = DoubleStream.of(toi).sum();
	   double sum2 = DoubleStream.of(hindu).sum();
	   double sum3 = DoubleStream.of(et).sum();
	   double sum4 = DoubleStream.of(bm).sum();
	   double sum5 = DoubleStream.of(ht).sum();
	   
	   
	   //assigning key and value using HashMap concept
        HashMap<Integer,String> mainMap = new HashMap<>();
        mainMap.put(0,"TOI");
        mainMap.put(1,"Hindu");
        mainMap.put(2,"ET");
        mainMap.put(3,"BM");
        mainMap.put(4,"HT");
        
        
        //assigning key and value using HashMap concept
        HashMap<String,Double> map = new HashMap<>();
        map.put("TOI",sum1);
        map.put("Hindu",sum2);
        map.put("ET",sum3);
        map.put("BM",sum4);
        map.put("HT",sum5);
        
        char value = '"';
        
        System.out.println("Possible combinations of newspaper subscriptions are:");
        
        //using for loop for iteration through the HashMap
        for(int i=0;i<map.size();i++)
        {
            for(int j=i+1;j<map.size();j++)
            {
                //Summing up the two values and comparing with the input budget value
                if((map.get(mainMap.get(i))+map.get(mainMap.get(j)))<=amount)
                {
                    //Printing the combinations of newspaper
                    System.out.print("{"+value+mainMap.get(i)+value+","+value+mainMap.get(j)+value+"}"+",");
                }
            }
        }
    }
    
    
    //main function
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      //Taking budget amount as input 
      System.out.println("Enter the budget value:");
      int n = sc.nextInt();
      //creating object to main class
      Main ms= new Main();
      //calling main method by passing the budget amount
      ms.Budget(n);
    }
}
