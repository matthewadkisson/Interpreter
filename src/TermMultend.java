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
public class TermMultend extends Term{
    private Factor Factor;
    private Multend Multend;
    
    TermMultend (Factor f, Multend a){ Factor = f; Multend = a;}
    public float eval() {
        //if(addend.eval() < 0){
         //   return term.eval() - addend.eval();
        //}
       // else 
            return Factor.eval() * Multend.eval();
    }
    public void print() {System.out.print("(");Factor.print();Multend.print();System.out.print(")");}
}