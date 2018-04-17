/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 * Demo class for StringCount. 
 * @author Meher Khan
 * 
 * 
 
 */
public class StringCountDemo {

    /**
     * Creates an instance of StringCount class and creates an array of Strings in-line 
     * and then iterates through them passing each to the StringCount.
     * Finally the summary information for the StringCount class is output by toString method.
     * @param args is not using
     */
    public static void main(String[] args) {
        StringCount srtingCounter = new StringCount();
        String[] stringHolder = {
            "yellow","White", "blue", "RED", "Green", "Red", "BLUE"};
        for (String s: stringHolder){
            
            
            srtingCounter.addString(s);
        }

        System.out.println(srtingCounter);

    }
}
