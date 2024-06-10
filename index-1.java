// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0){
    int x = sc.nextInt();
    if(x<=28)
    System.out.println("aa"+(char)((x-3)+'a'));
   }
   else if(x<=53)
   System.out.println('a'+((char)(x-27)+('a'))+'z');
   else{
    System.out.printn((char)(x-53)+'a'+"zz");
   }
  }
}