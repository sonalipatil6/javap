import java.util.Scanner;
public class palindromeCheck {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.print("Enter a number:");
int originalNum=scanner.nextInt();
int reversedNum=0;
int num=originalNum;
while(num>0) {
int digit=num%10;
reversedNum=reversedNum*10+digit;
num/=10;
}
if(originalNum==reversedNum) {
System.out.println(originalNum+"is a palindrome.");
}else{
System.out.println(originalNum+"is not a palindrome.");
}
scanner.close();
}
}