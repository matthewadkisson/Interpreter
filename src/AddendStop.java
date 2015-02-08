/**
 *
 * @author Matthew
 */
import java.io.*;
public class AddendStop extends Addend{
    Addop addop;
    Term term;
    AddendStop (Addop a, Term t){ addop = a; term = t;}
    public float eval(){
        if(addop.eval() == -1){
            //System.out.print("minus");
            float temp = -term.eval();
            //System.out.print(temp);
            return temp;
        }
        else
            return term.eval();}
    public void print() {addop.print(); term.print();}//System.out.print(")");}
}