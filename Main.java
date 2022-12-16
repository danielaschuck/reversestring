import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        String text =sc.nextLine();
        
        
        //reverse String
String saida="";
        for(int i= text.length()-1;i>=0 ;i--){
    saida=saida+text.charAt(i);
}
System.out.println(saida);
    }
}