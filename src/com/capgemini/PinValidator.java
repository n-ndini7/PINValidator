package com.capgemini;

import java.util.regex.*;
import java.util.*;

//PIN uc1 - restrict the PIN from taking alphabet or special characters at the end
public class PinValidator {

	public static String pin;
	public static Scanner sc;

	public void PinCheck(String pin) {
		boolean flag = true;
		while (flag) {
			Pattern p = Pattern.compile("^([1-9])(\\S){4}[0-9]$");
			Matcher m = p.matcher(pin);
			if (m.matches()) {
				System.out.println("PIN is valid!!");
				flag = false;
				break;
			} else {
				System.out.println("PIN is invalid !! Try another pin code:");
				pin = sc.nextLine();

			}
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		PinValidator user = new PinValidator();
		System.out.println("Enter the user PIN:");
		pin = sc.nextLine();
		user.PinCheck(pin);

	}
}
