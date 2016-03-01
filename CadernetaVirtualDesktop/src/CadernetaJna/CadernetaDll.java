/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadernetaJna;

/**
 *
 * @author helen
 */
public class CadernetaDll implements CadernetaDllJna{

    @Override
    public double soma(double a, double b) {
        return CadernetaDllJna.INSTANCE.soma(a, b);
    }

    @Override
    public double mult(double a, double b) {
        return CadernetaDllJna.INSTANCE.mult(a, b);
    }

    @Override
    public double divi(double a, double b) {
        return CadernetaDllJna.INSTANCE.divi(a, b);
    }

    @Override
    public double subt(double a, double b) {
        return CadernetaDllJna.INSTANCE.subt(a, b);
    }
    
}
