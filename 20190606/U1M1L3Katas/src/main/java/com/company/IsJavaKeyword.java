package com.company;

import java.util.Scanner;

public class IsJavaKeyword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        String[] javaWords = { "abstract", "continue","for","new", "switch",
        "assert","default",	"goto",	"package",	"synchronized",
        "boolean","do",	"if",	"private","this",
        "break","double", "implements",	"protected", "throw",
        "byte",	"else",	"import", "public",	"throws",
        "case",	"enum",	"instanceof", "return",	"transient",
        "catch", "extends",	"int", "short",	"try",
        "char",	"final", "interface", "static",	"void",
        "class", "finally",	"long",	"strictfp",	"volatile",
        "const", "float", "native",	"super", "while"};

        for( int i = 0; i < javaWords.length; i++) {
            if (userInput.equals(javaWords[i])) {
                System.out.println(userInput + " is a java keyword");
            } else {
                System.out.println(userInput + " is not a java keyword");
            }
        }
    }
}
