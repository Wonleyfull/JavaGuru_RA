package com.javaguru.lessons.lesson4.homework;

class PhraseAnalyser {
    public String analyse(String text){
        if(text.startsWith(" ") || text.endsWith(" ")) {
            return "Incorrect data provided";
        } else if ((text.startsWith("Make") && text.endsWith("great again")) || (text.startsWith("Make") && text.endsWith("great again") && text.endsWith("."))) {
            return "It stands no chance";
        } else if (text.startsWith("Make") || (text.endsWith("great again") && text.endsWith(".")) || (text.endsWith("great again"))) {
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }
}
