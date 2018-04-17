/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;



/**
 *  
 * Count total of all vowels,  number of characters in a String,  
 * number of all string submitted, and  number of strings "red" submitted. 
 * 
 * @author Meher Khan
 * 
 */

public class StringCount {

    private int vowelCount  = 0;//Total number of vowels entered so far

    private int charCount = 0;//Total number of characters entered so far
    
    private int lineCount = 0;//Total number of line submissions so far
   
    private int blueCount = 0;//Total number of "red" entered so far

   
    /**
     * Submit a string to the StringCount class 
     * updating the total number of strings and characters are entered, 
     * the total number of "red"s  and the total number of vowels in submissions
     * ("blue" is not case sensitive)
     * @param newString are added string
     */
    public void addString(String newString){

        System.out.println("String Added : " + newString);
        
        this.lineCount++;
        this.charCount += newString.length();
        newString = newString.toLowerCase();
        if (newString.equals("blue")){
            this.blueCount++;
        }
        String vowels = "aeiou";
        for (int i = 0;i < newString.length();i ++){
            for (int j = 0; j < vowels.length(); j++){
                if (newString.charAt(i) == vowels.charAt(j)){
                   this.vowelCount++;
                }
            }
        }

    }

    /**
     * 
     * @return - concatenation of 
     * total number of characters is entered
     * total number of line submissions
     * total number of "blue"s and vowels is entered
     */
    
    @Override
    public String toString(){
        return ("Total chars : " + charCount +","+
                "Total lines : " + lineCount +","+
                "Total blues : "  + blueCount +","+
                "Total owels :" + vowelCount);
    }
}
