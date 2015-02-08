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
class TermFactor extends Term{
    private Factor factor;
    TermFactor (Factor factor) { this.factor = factor; }
    public float eval() {return factor.eval();}
    public void print() {factor.print();}
}
