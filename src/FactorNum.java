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
public class FactorNum extends Factor{
    private Num num;
    FactorNum(Num n) { num = n; }
    public float eval() {return num.eval();}
    public void print() { num.print();}
}
