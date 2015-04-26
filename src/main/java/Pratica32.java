import static java.lang.Math.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class Pratica32 {
    
    public static double densidade(double x, double media, double desvio) {
        double d = (exp(-0.5*(pow((x - media)/desvio, 2))))/(sqrt(2*PI)*desvio);
        return d;
    }    
}
