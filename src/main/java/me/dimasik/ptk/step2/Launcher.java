package me.dimasik.ptk.step2;

import java.util.Scanner;

public final class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (isPalindrom(str, i, j)) {
                    System.out.println(str.substring(i, j + 1));
                    return;
                }
            }
        }
    }
    public static boolean isPalindrom(String base, int left, int right) {
        while (right > left) {
            if (!(base.charAt(left++) == base.charAt(right--)))
                return false;
        }
        return true;
    }
}