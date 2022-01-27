package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread = new Thread(numberGenerator);
        thread.start();
    }
}
