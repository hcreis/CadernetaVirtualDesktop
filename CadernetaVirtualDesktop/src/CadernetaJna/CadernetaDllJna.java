/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadernetaJna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import java.nio.file.FileSystems;

/**
 *
 * @author helen
 */
public interface CadernetaDllJna extends Library {
    
    public class Caderneta{
        
        static String caminhoDll = "";
        
        private static String getDllPath()
        {
            try{
                String nowDirectory = System.getProperty("user.dir");
                caminhoDll = nowDirectory.replace("\\","/") + "/cadDll/caderneta.dll";
                caminhoDll.replace("//", FileSystems.getDefault().getSeparator());
                System.out.println("Bibioteca carregada do caminho: " + caminhoDll);
                return caminhoDll;
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
            return caminhoDll;
        }
        
    }
    
    public CadernetaDllJna INSTANCE = (CadernetaDllJna) Native.loadLibrary(Caderneta.getDllPath(), CadernetaDllJna.class);
    
    public double soma(double a,double b);
    public double mult(double a,double b);
    public double divi(double a,double b);
    public double subt(double a,double b);
    
}
