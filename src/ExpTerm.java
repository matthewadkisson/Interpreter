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
class ExpTerm extends Exp{
    Term term;
    ExpTerm (Term t) { term = t;}
    public float eval() {return term.eval();}
    public void print () {System.out.print("(");term.print();System.out.print(")");}
}
