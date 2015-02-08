/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
public class AddendedCont extends Addend{
    private Addop addop;
    private Term term;
    private Addend addend;
    
    AddendedCont (Addop ao, Term t, Addend a){ addop= ao; term = t; addend = a;}
    public float eval() {
        if(addop.eval() == -1){
            float temp = -term.eval();
            return temp+addend.eval();
        }
        else
            return term.eval()+addend.eval();
        }
    
    public void print() {addop.print(); System.out.print("(");term.print();addend.print();System.out.print(")");}
}