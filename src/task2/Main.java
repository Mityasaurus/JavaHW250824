package task2;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static task2.ConsoleColors.*;

public class Main {
    public static void main(String[] args) {
        RED.out("Red OUT");
        BLUE.out(123456);
        System.out.println(GREEN + "Green Color");
        //
        System.out.println("-".repeat(50));
        //
        String str;
        Scanner scanner = new Scanner(System.in);
        String[] colors = new String[ConsoleColors.values().length];

        int i = 0;
        for (ConsoleColors value : values()) {
            colors[i] = value.name();
            i++;
        }
        Arrays.sort(colors);

        while(!Objects.equals((str = scanner.nextLine()), "")){
            if(Arrays.binarySearch(colors, str.toUpperCase()) > -1){
                System.out.println(ConsoleColors.valueOf(str.toUpperCase()));
            }
            else{
                System.out.println(str);
            }
        }
    }
}
