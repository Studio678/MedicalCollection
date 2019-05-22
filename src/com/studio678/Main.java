/**
    This program should create LIST of Medical items, push items to it and print all items from LIST with command LIST

    author studio678 22.05.2019
 */

package com.studio678;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

    private static String readBlock() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 'LIST' for print all items in List");
        System.out.println("Input item or command: ");
        String str = reader.readLine().trim();
        System.out.println();

        return str;
    }


    public static void main(String[] args) throws IOException {
        TreeSet<String> medicalList = new TreeSet<>();
        while(true) {
            String command = readBlock();
            if (command.equals("LIST")) {
                for (String item : medicalList) {
                    System.out.println(item);
                }
                break;
            } else {
                medicalList.add(command);
            }
        }
    }
}
