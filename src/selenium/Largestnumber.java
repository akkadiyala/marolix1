package selenium;

public class Largestnumber {
    public static void main(String[] args) {  
    	  
        //Initialize array  
        int [] number = new int [] {1,1223,4,234132,3432423,12123};  
        //Initialize max with first element of array.  
        int Maximum = number[0];  
        //Loop through the array  
        for (int i = 0; i < number.length; i++) {  
            //Compare elements of array with max  
           if(number[i] > Maximum)  
               Maximum = number[i];  
        }  
        System.out.println("Largest element present in given array: " + Maximum);  
    }  

}
