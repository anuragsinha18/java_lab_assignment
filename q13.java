import java.io.*;  
import java.util.*;  
  
class q13 
{     
   
    public static void main(String args[])  
    {  
        String str = new String("The quick brown fox jumps over the lazy dog");
        
        System.out.println("Printing 12th index of string\n"+str.charAt(11));
        System.out.println("Contains is or not\n"+str.contains("is"));
        System.out.println("Adding to string\n "+str.concat(" and killed it."));
        System.out.println("Checking equality with string The quick brown Fox jumps over the lazy Dog\n"+str.equals("The quick brown Fox jumps over the lazy Dog"));
        System.out.println("Checking equality with string THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG\n"+str.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        System.out.println("Length of the string is \n"+str.length());
        System.out.println("Checking equality with The quick brown Fox jumps over the lazy Dog\n"+str.equals("The quick brown Fox jumps over the lazy Dog"));
        System.out.println("Replacing The with A\n "+str.replace("The", "A"));

        str = new String("The quick brown fox ,jumps over the lazy dog");

        String splitted[] = str.split(",");

        System.out.println("Split two animals\n");

        for (String s : splitted) {
            System.out.println(s);
        }

        System.out.println("Printing Animals names \tfox\tdog");
        System.out.println("Lowercase string\n"+str.toLowerCase());
        System.out.println("Uppercase string\n"+str.toUpperCase());
        System.out.println("Finding a index\n"+str.indexOf("a"));
        System.out.println("Finding e index\n"+str.lastIndexOf("e"));


    }
}