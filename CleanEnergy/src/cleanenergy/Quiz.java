/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cleanenergy;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Greg
 */
abstract class Quiz {
    //methods used to retrieve amount of questions, index, answers, and questions. used in SolarQuiz, HydroQuiz, WindQuiz and UnifiQuiz
    public abstract int getNumQ();
    public abstract String getQ(int questionI);
    
    public abstract ArrayList<String> getCh(int questionI);
    public abstract int getCorrectAnsI(int questionI);
    
}
