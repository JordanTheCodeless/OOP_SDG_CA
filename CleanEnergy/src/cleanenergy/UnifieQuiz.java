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
public class UnifieQuiz extends Quiz {
    private final ArrayList<String> allQ;
    private final ArrayList<ArrayList<String>> allCh;//this allows me to store the questions and have those questions have the answers stores within.
    private final ArrayList<Integer> allAns;

    public UnifieQuiz() { //methods to store all questions from all three classes SolarQuiz, HydroQuiz and Windquiz // allows for easier execution in the GUI class later on
        allQ = new ArrayList<>();
        allCh = new ArrayList<>();
        allAns = new ArrayList<>();
        
        //adding questions and choices from each quizz class
        SolarQuiz solar = new SolarQuiz();
        for(int i = 0; i <solar.getNumQ(); i++){ //cycles through each classes methods and retrieves questions, choices and answers
            allQ.add(solar.getQ(i));
            allCh.add(solar.getCh(i));
            allAns.add(solar.getCorrectAnsI(i));
        }
        
        HydroQuiz hydro = new HydroQuiz();
        for(int i = 0; i <hydro.getNumQ(); i++){
            allQ.add(hydro.getQ(i));
            allCh.add(hydro.getCh(i));
            allAns.add(hydro.getCorrectAnsI(i));
        }
        
        WindQuiz wind = new WindQuiz();
        for(int i = 0; i <wind.getNumQ(); i++){
            allQ.add(wind.getQ(i));
            allCh.add(wind.getCh(i));
            allAns.add(wind.getCorrectAnsI(i));
        }
    }
    @Override
    public int getNumQ(){ //uses the methods from Quiz class to be used in the GUI class
        return allQ.size();
    }
    @Override
    public String getQ(int questionI){
        return allQ.get(questionI);
    }
    @Override
    public ArrayList<String> getCh(int questionI){
        return allCh.get(questionI);
    }
    @Override
    public int getCorrectAnsI(int questionI){
        return allAns.get(questionI);
    }
    
}
