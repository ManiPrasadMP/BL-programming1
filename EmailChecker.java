package com;

public class EmailChecker {

	public static boolean isValid(String email) {
        if (email == null || email.isEmpty()) return false;
        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');

        return at > 0 && dot > at && dot < email.length() - 1 && !email.contains(" ");
    }

    public static void main(String[] args) {
        System.out.println(isValid("test@gmail.com"));  // true
        System.out.println(isValid("invalid@com"));      // false
    }
}
