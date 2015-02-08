/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madkisson
 */
import java.io.*;
public class MultendStop extends Multend{
    Multop addop;
    Term term;
    MultendStop (Multop a, Term t){ addop = a; term = t;}
    public float eval(){
        if(addop.eval() == -1){
            float temp = 1/term.eval();
            //System.out.print(temp);
            return temp;
        }
        else
            return term.eval();}
    public void print() {addop.print();System.out.print("("); term.print();System.out.print(")");}
}