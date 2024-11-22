/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class GameManager {
    private List<Question> questions;
    private String message;
    private int grade;
    


    public GameManager() {
        questions = new ArrayList<>();
        loadQuestions();

    }
    
    public void loadQuestions(){
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            fStream = new FileInputStream("QuestionData.dat");
            oStream = new ObjectInputStream(fStream);
            
            questions = (ArrayList<Question>)oStream.readObject();
            oStream.close();
            System.out.println("Questions were fetched by the Game manager correctly");
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Unable to fetch questions, error:"+ e);
        }
    }
    
    public void setGrade(int score) {
        this.grade = score;
    }
    
    public void computeGrade() {
        if (grade >= 8) {
            message = "Excellent! You scored " + grade + " out of 10.";
        } else if (grade >= 5) {
            message = "Good effort! You scored " + grade + " out of 10.";
        } else {
            message = "Keep trying! You scored " + grade + " out of 10.";
        }
    }
    
        public String getMessage() {
        return message;
    }

    public int getSize(){
        return questions.size();
    }

    
    public Question getQuestion(int currentIndex){
        return questions.get(currentIndex);
    }
    
}
