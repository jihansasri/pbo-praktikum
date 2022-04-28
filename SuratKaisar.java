import java.io.*;
import java.util.*;

public class Solution {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
         
             
        
      String msg = input.nextLine();
       int key = input.nextInt();
      
        String encryp = "";
        
        for(int i = 0; i <msg.length(); i++){
            
            if ((int)msg.charAt(i) ==32){
                encryp += (char) 32;
                
            }else if((int)msg.charAt(i) + key > 122){
                int temp = ((int)msg.charAt(i) + key) - 122;
                encryp +=(char) (96 + temp);
                
            }else if ((int)msg.charAt(i) + key > 90 && (int)msg.charAt(i) < 96){
                int temp = ((int)msg.charAt(i) + key) - 90;
                encryp += (char) (64+temp);
                
            }else{
                encryp += (char)((int)msg.charAt(i) + key);
            }
        }
        System.out.println(encryp);
    }
        
    
    
}
