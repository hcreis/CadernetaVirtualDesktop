package comparador;

import Objetos.Bairro;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author helen
 */
public class ComparadorBairro implements Comparator<Bairro> 
{
    @Override
    public int compare(Bairro b1, Bairro b2) {
       return b1.getNomeBairro().compareTo(b2.getNomeBairro());
    }
    
}
