import java.util.Scanner;

public class FindFactors {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    int i = 2;
    
    while(num != 1){
      if (num % i == 0){
        System.out.print(i + " ");
        num = num / i;
        i = 2;
      } // if 
      else
        i++;
    } // while
  }  // main
} // FindFactors
