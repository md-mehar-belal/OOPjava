import java.util.Scanner;
public class Initials{
 public static void main (String[] args){
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter Your Name : ");
   String name = scanner.nextLine();
   scanner.close();
   System.out.println("Initials: "+getInitials(name));
  }
   public static String getInitials(String name){
    String[] words=name.split("\\s+");
    
    String in="";
    in += words[0].charAt(0) + ". " +words[(words.length)-1].charAt(0);
    System.out.println("Initials: "+in);
    return in;
    
    /*
    StringBuilder initials = new StringBuilder();
    for(String word:words){
    initials.append(word.charAt(0)).append(".");
    }
    return initials.toString().trim();
    */
    
   }
  }
