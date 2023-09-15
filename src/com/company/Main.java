package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //regex example 1)
        //mobile number start with 8 or 9 and total digit  = 10
        String regex = "[89]\\d{9}";
        String input = "89283948982";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String matchedText = matcher.group();
            System.out.println("mobile number: " + matchedText);
        }

        //2)example
        //first character uppercase,contain lower case alphabets,
        // only one digit allowed in between

        String regex1 = "[A-Z][a-z]*[0-9][a-z]*";
        String input1 = "Adasd8dasd";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(input1);

        while (matcher1.find()) {
            String matcherText = matcher1.group();
            System.out.println("result :" + matcherText);
        }

        //3)example
        //Emil ID
        String regex2 = "[a-zA-Z0-9._-]+[@][a-zA-Z]+[.][a-zA-Z]";
        String input2 = "company@gmail.com";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(input2);

        while (matcher2.find()) {
            String matcherText = matcher2.group();
            System.out.println("email :" + matcherText);
        }


        System.out.println("-------------replaceAll---------------------");
        System.out.println("-------------replaceAll---------------------");
        String str = "hello"+'"'+"Bob";
        String s = str.replaceAll("\"", "-");
        System.out.println(s);

        String original  = "ABC-123, DGK-432";
        String s1 = original.replaceAll("(\\w{3})-(\\d{3})","$2-$1");
        System.out.println(s1);

        String numbers = "123412551999";
        Pattern pattern3 =Pattern.compile("(\\d{2})(\\d{2})",Pattern.CASE_INSENSITIVE);
        Matcher matcher3 = pattern3.matcher(numbers);

        while (matcher3.find()) {
            if (matcher3.group(1) != null){
                System.out.println(matcher3.group(1));
            }
            if (matcher3.group(2) != null){
                System.out.println(matcher3.group(2));
            }
            System.out.println(matcher3.group());
        }


    }
}
