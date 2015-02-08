/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
import java.io.*;
public class ExpAddend extends Exp{
    private Term term;
    private Addend addend;
    
    ExpAddend (Term t, Addend a){ term = t; addend = a;}
    public float eval() {
        //if(addend.eval() < 0){
         //   return term.eval() - addend.eval();
        //}
       // else 
            return term.eval() + addend.eval();
    }
    public void print() {System.out.print("(");term.print();addend.print();System.out.print(")");}
}