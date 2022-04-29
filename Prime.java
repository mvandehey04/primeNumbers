/*
* Purpose: collect range of numbers and find prime numbers
* Author: Madeline Vande Hey
* Date: 4/26/22
*/
import java.util.ArrayList;

public class Prime {
    private String range;

    public Prime(String range){
        this.range = range;
    }

    // get and set
    public String getRange(){
        return range;
    }
    public void setRange(String r){
        range = r;
    }

    public void getPrime(){
        // remove possible spaces and set range
        String range = getRange().trim();

        // lower and upper limits
        String lowerLimit = "";
        String upperLimit = "";

        // list and count
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;

        // get lower limit
        for(int i = 0; i < range.length(); i++){
            if(range.substring(i,i+1).equals("-")) break;
            else if(!range.substring(i,i+1).equals(" ")) lowerLimit += range.substring(i,i+1);
        }
        int low = Integer.parseInt(lowerLimit);

        // get upper limit
        for(int i = (range.indexOf("-") + 1); i < range.length(); i++){
            if(!range.substring(i,i+1).equals(" ")) upperLimit += range.substring(i,i+1);
        }
        int up = Integer.parseInt(upperLimit);

        // check within range
        for(int n = low; n < up; n++){
            boolean isPrime = true;
            // check if 1
            if(n ==1){
                isPrime = false;
            }
            
            for(int i = 2; i <= n/2; i++){

                // check prime
                if (n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            
            // if prime add to count and add to list
            if(isPrime == true){
                list.add(n);
                count++;
            }
        }

        System.out.println("\nPrime numbers in the range of " + low + "-" + up + " are:\n");

        int align = 1;
        for(int i : list){
            if(align == 1){
                System.out.printf("%s", i);
                align++;
            }
            else if(align <= 8){
                System.out.printf("%6s", i);
                align++;
            }
            else{
                System.out.println();
                System.out.println();
                align = 1;
            }
        }
        System.out.println();
        System.out.println("\nTotal prime numbers in range: " + count);
    }
}
