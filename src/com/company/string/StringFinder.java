package com.company.string;

public class StringFinder {
    public static void main(String[] args) {
        String str = "Lorem Ipsum is simply dummy text. of the printing and, typesetting industry. " +
                "Lorem Ipsum has been the industry's.standard dummy text,) ever since the 1500s." +
                " when an unknown, printer took a galley. of type and scrambled it to make. a type specimen book.";

        String[] array = str.split("[.,)] ");
        for (String s : array) {
            System.out.println(s);

        }
    }
}
