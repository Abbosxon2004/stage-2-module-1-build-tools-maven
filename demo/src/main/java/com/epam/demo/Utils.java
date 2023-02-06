package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        int counter = 0;
        try {
            for (String arg : args) {
                if (Double.parseDouble(arg) > 0)
                    counter++;
            }
            if (args.size() == counter)
                return true;
            else return false;
        }catch (NumberFormatException e){
            return false;
        }

        //magic happens here
    }
}