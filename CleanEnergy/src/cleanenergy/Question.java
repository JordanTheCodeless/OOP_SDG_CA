/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;

import java.io.Serializable;

/**
 *
 * @author andre
 */


public class Question implements Serializable{
    protected String questionText;
    protected boolean correctAnswer;
    protected String correctMessage;
    protected String incorrectMessage;
    
    //The question object is used to store the data of all the "Levels" on the game
    
    //Constructor
    public Question(String questionText, boolean correctAnswer, String correctMessage, String incorrectMessage) {
        this.questionText = questionText;//This is the question itself
        this.correctAnswer = correctAnswer;//This is the correct int of the question
        this.correctMessage = correctMessage;//This message is returned if the question was correct
        this.incorrectMessage = incorrectMessage;//This message is returned if the question was wrong
    }
    
    //Compute
    public boolean computeInfo(boolean answer) {
        return answer == correctAnswer;
    }
    
    //Geters
    public String getFeedback(boolean result) {
        if (result){
            return correctMessage;
        }else{
            return incorrectMessage;
        }            
    }

    public String getQuestionText() {
        return questionText;
    }
    
    
    //Function used for debbuging porpuses
    @Override
    public String toString() {
        return "Question{" + "questionText=" + questionText + ", correctAnswer=" + correctAnswer + ", correctMessage=" + correctMessage + ", incorrectMessage=" + incorrectMessage + '}';
    }
    
    
}
