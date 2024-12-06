/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;

import java.util.ArrayList;

/**
 *
 * @author Greg
 */
public class SolarQuiz extends Quiz {
    
    private final ArrayList<String> questions;
    private final ArrayList<ArrayList<String>> choice;//this allows me to store the questions and have those questions have the answers stores within.
    private final ArrayList<Integer> correctAns;
    
    public SolarQuiz() {//initializing variables//allows for easier execution later in the UnifieQuiz class
        questions = new ArrayList<>();
        choice = new ArrayList<>();
        correctAns = new ArrayList<>();
        //adding questions
        questions.add("What is the primary source of energy in the field of SolarEnergy?");
        questions.add("Which country is the largest producer of solar power in the world?");
        
        //adding choices to questions
        ArrayList<String> q1Choice = new ArrayList<>();
        q1Choice.add("Wind");
        q1Choice.add("Solar");
        q1Choice.add("Water");
        choice.add(q1Choice);//choices added
        correctAns.add(2);// answer from choices added
        
        ArrayList<String> q2Choice = new ArrayList<>();
        q2Choice.add("Germany");
        q2Choice.add("Unites States");
        q2Choice.add("China");
        choice.add(q2Choice);//choices added
        correctAns.add(3);// answer from choices added
    }
    
    @Override
    public int getNumQ(){
        return questions.size();
    }
    @Override
    public String getQ(int questionI){
        return questions.get(questionI);
    }
    @Override
    public ArrayList<String> getCh(int questionI){
        return choice.get(questionI);
    }
    @Override
    public int getCorrectAnsI(int questionI){
        return correctAns.get(questionI);
    }
}
    
    
    
    
    
