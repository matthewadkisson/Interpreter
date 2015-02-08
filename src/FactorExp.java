
/**
 *
 * @author madkisson
 */
import java.io.*;
public class FactorExp extends Factor {
   Exp exp;
   FactorExp(Exp e) {exp = e;}
   public float eval() {return exp.eval(); }
   public void print () {System.out.print("(");exp.print();System.out.print(")");}

}