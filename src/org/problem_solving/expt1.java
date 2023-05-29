package org.problem_solving;

import java.util.Scanner;
public class expt1 {
static void cheakingcharectors(String str){

for(int i=0; i<str.length();i++){

if(str.charAt(i)=='='){
System.out.println(str.charAt(i)+" : assingment operator");
}
else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
System.out.println(str.charAt(i)+ " : identifier");
}

else if(str.charAt(i)=='+' ||str.charAt(i)=='*' || str.charAt(i)=='/' || str.charAt(i)=='-'){
System.out.println(str.charAt(i)+" : unary operators");
}

else if(str.charAt(i)==';'){
System.out.println(str.charAt(i)+" :delimiter");
}

else if(str.charAt(i)>=0){
    System.out.println(str.charAt(i)+" : constants");
}

else {
System.out.println("Enter the correct values for string as mention above");
}
}
}

public static void main(String[] args) {

// TODO code application logic here
Scanner in= new Scanner(System.in);
System.out.println("Enter your string");
String str= in.nextLine();
cheakingcharectors(str.toLowerCase());
}
}