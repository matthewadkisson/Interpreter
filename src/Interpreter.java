/**
 *
 * @author Matthew
 */
public class Interpreter {

    public static void main(String[] args) {
        Exp exp;
        Factor factor, factor1, factor2, factor3, factor4, factor5;
        Addend addend, addend2;
        Multend multend, multend2;
        Addop addop, addop2;
        Multop multop, multop2;
        //Multend multend;
        //Multop multop;
        Term term1, term2, term3;
        Num num, num2, num3, num4;
        
        num = new Num(-123);
        factor1 = new FactorNum(num);
        term1 = new TermFactor(factor1);
        
        num = new Num(-7);
        factor2 = new FactorNum(num);
        term2 = new TermFactor(factor2);
        addop = new AddopPlus();
        num2 = new Num(-23);
        factor3 = new FactorNum(num2);
        term3 = new TermFactor(factor3);
        addop2 = new AddopMinus();
        addend = new AddendStop(addop2, term3);
        addend2 = new AddendedCont(addop, term2, addend);
        exp = new ExpAddend(term1, addend2);
        //exp.print();System.out.print('=');
        //System.out.println(exp.eval());
        //float temp = exp.eval();
        //num3 = new Num(temp);
        factor2 = new FactorExp(exp);
        multop2 = new MultopDiv();
        term3 = new TermFactor(factor2);
        multend2 = new MultendStop(multop2, term3);//System.out.println(multend2.eval());
        num4 = new Num(-7);
        factor1 = new FactorNum(num4);
        term2 = new TermFactor(factor1);
        
        num = new Num(-123);
        factor = new FactorNum(num);
        //term1 = new TermFactor(factor);
        //exp = new ExpTerm(term);

        multop = new MultopMul();
        multend = new Multendcont(multop, term2, multend2);//System.out.println(multend.eval());
        term3 = new TermMultend(factor, multend);
        term3.print(); System.out.print('=');
        System.out.println(term3.eval());
        
        //Subtracting -123 - -7
        /*num = new Num(-123);
        factor1 = new FactorNum(num);
        term1 = new TermFactor(factor1);
        
        num = new Num(-7);
        factor2 = new FactorNum(num);
        term2 = new TermFactor(factor2);
        addop = new AddopPlus();
        num2 = new Num(-23);
        factor3 = new FactorNum(num2);
        term3 = new TermFactor(factor3);
        addop2 = new AddopMinus();
        addend = new AddendStop(addop2, term3);
        addend2 = new AddendedCont(addop, term2, addend);
        exp = new ExpAddend(term1, addend2);
        exp.print();System.out.print('=');
        System.out.println(exp.eval());*/
        
        
        /* -123 + -7 - */
        
    }
    
}
