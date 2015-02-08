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
public class Num implements Instruction{
    private float n;
    Num (float n){ this.n = n; }
    public float eval() {return n;}
    public void print() { System.out.print("(");System.out.print(n);System.out.print(")");}
}
