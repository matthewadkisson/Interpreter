/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
public class Multendcont extends Multend{
    Multop addop;
    Term term;
    Multend multend;
    Multendcont (Multop a, Term t, Multend m){ addop = a; term = t; multend = m;}
    public float eval(){
        if(addop.eval() == -1){
            //float temp = 1/(term.eval()+multend.eval());
            float temp = 1/((term.eval())*(multend.eval())); //System.out.println("Multendcont: "+temp);
            return temp;
        }
        else
            return term.eval()*multend.eval();}
    public void print() {addop.print(); System.out.print("(");term.print();multend.print();System.out.print(")");}
}