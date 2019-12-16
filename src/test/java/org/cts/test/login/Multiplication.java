package org.cts.test.login;

public class Multiplication {
public static void main(String[] args) {
	int i = 0, j = 0, a = 0, n=12321;
	a = n;
	while (a>0) {
		i = a%10;
		j = (j*10)+i;
		a = a/10;
	}
	System.out.println(j);
if (j!=n) {
	System.out.println("its an palindrome");
} else {
System.out.println("its not an palindrome");
}	
}
}
