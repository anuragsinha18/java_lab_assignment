public class q14 {
    
    public static void main(String args[]) {
       String stringArray[] = {"Anurag ", " satya", " mohit", " yuvraj", " simran", " mayank", " jhabar" , " deepanshu" , " nikhil" , " adarsh"};
       StringBuffer sb = new StringBuffer();
       for(int i = 0; i < stringArray.length; i++) {
          sb.append(stringArray[i]);
       }
       String str = sb.toString();
       System.out.println(str);
    }
 }