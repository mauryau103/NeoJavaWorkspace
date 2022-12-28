
public class Armstrong {
    public static void main(String args[]) {
        
        int my_input, my_temp, my_remainder, my_result;
        my_input = 407;
        my_result = 0;
        System.out.println("The number is defined as " +my_input);
        my_temp = my_input;
        while (my_temp != 0){
           my_remainder = my_temp % 10;
           my_result += Math.pow(my_remainder, 3);
           my_temp /= 10;
        }
        if(my_result == my_input)
           System.out.println(my_input + " is an Armstrong number");
        else
           System.out.println(my_input + " is not an Armstrong number");
  
          
      }
    }  
   