public class Overloading75 {
public static void main(int num) {
System.out.println("Printing integer:"+num) ;
}
public static void print(double num) {
System.out.println("Printing double:"+num);
}
public static void print(String Str) {
System.out.println("Printing String:"+Str);
}
public static void print(char ch) {
System.out.println("Printing character:"+ch);
}
public static void main(String[] args) {
print(10);
print(3.14);
print("Hello,World!");
}
}