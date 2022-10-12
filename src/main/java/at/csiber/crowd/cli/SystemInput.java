package at.csiber.crowd.cli;

import java.util.Scanner;

public class SystemInput {
    private static Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }
}
