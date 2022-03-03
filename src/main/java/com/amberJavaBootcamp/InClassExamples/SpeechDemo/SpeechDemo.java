package com.amberJavaBootcamp.InClassExamples.SpeechDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class SpeechDemo {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String,Integer> hashMap = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File("/Users/videocomputer1/Documents/myfirstjava/src/main/java/src/test/java/com/amberdavidson/speechdemo/IHaveADream.txt"));
            while(scanner.hasNext()) {
                String word = scanner.next();
                if(hashMap.containsKey(word)) {
                    hashMap.replace(word,hashMap.get(word)+1);

                }
                else {
                    hashMap.put(word, 1);
                }
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(hashMap);
    }
}
