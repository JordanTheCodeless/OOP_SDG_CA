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
    private String questionText;
    private int correctAnswer;
    private String correctMessage;
    private String incorrectMessage;

    public Question(String questionText, int correctAnswer, String correctMessage, String incorrectMessage) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.correctMessage = correctMessage;
        this.incorrectMessage = incorrectMessage;
    }

    public boolean computeInfo(int answer) {
        return (answer < correctAnswer+50 && answer > correctAnswer-50);
        //Set a small range where the user can be wrong to make the game a little easier
    }

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

    @Override
    public String toString() {
        return "Question{" + "questionText=" + questionText + ", correctAnswer=" + correctAnswer + ", correctMessage=" + correctMessage + ", incorrectMessage=" + incorrectMessage + '}';
    }
    
    
}
