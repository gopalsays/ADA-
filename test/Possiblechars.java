package test;
import java.util.*;

class permuation {
	void method(String arr, int l) {
		char[] ch = new char[arr.length()];
		int j = l - 1;
		int k = 0;
		for (int i = 0; i < arr.length(); i++) {
			ch[i] = arr.charAt(i);
		}
		for (int i = 0; i < Math.pow(2, l); i++) {
			for (char c : ch) {
				System.out.print(c);
			}
			if (j > 0) {
				ch = swap(ch, j);
				j--;
			} else {
				j = l - 1;
			}
			System.out.println();
		}
	}

	char[] swap(char ch[], int length) {
		char a = ch[length];
		char b = ch[length - 1];
		ch[length - 1] = a;
		ch[length] = b;
		return ch;
	}
}

public class Possiblechars {
	public static void main(String[] args) {
		String arr = "123";
		int l = arr.length();
		permuation obj = new permuation();
		obj.method(arr, l);
	}
}
