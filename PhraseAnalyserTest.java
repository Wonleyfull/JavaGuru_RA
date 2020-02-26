package com.javaguru.lessons.lesson4.homework;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyserTest testTrigger = new PhraseAnalyserTest();
        testTrigger.isMakeAndGreatAgain();
        testTrigger.isMakeOrGreatAgain();
        testTrigger.isSpaceAtTheStart();
        testTrigger.isAllGood();
    }
    void isMakeAndGreatAgain() {
        PhraseAnalyser trigger = new PhraseAnalyser();
        String text = "Make it that way, so it could be great again.";
        String expectedResult = "It stands no chance";
        String actualResult = trigger.analyse(text);
        printTestResult(expectedResult, actualResult, "isMakeAndGreatAgain");
    }
    void isMakeOrGreatAgain() {
        PhraseAnalyser trigger = new PhraseAnalyser();
        String text = "I do everything as usual and it will be great again.";
        String expectedResult = "It could be worse";
        String actualResult = trigger.analyse(text);
        printTestResult(expectedResult, actualResult, "isMakeOrGreatAgain");
    }
    void isSpaceAtTheStart() {
        PhraseAnalyser trigger = new PhraseAnalyser();
        String text = " Just some random letters.";
        String expectedResult = "Incorrect data provided";
        String actualResult = trigger.analyse(text);
        printTestResult(expectedResult, actualResult, "isSpaceAtTheStart");
    }
    void isAllGood() {
        String text = "You reading the sentence which is ending right now.";
        PhraseAnalyser trigger = new PhraseAnalyser();
        String expectedResult = "It is fine, really";
        String actualResult = trigger.analyse(text);
        printTestResult(expectedResult, actualResult, "isAllGood");
    }
    void printTestResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(" ");
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(" ");
            System.out.println(testName + " failed.");
            System.out.println("Expected result: " + expectedResult + ". " + "Actual result: " + actualResult + ".");
        }
    }
}

