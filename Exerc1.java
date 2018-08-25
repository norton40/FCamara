/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc1;


import java.text.NumberFormat;
import java.util.Calendar;


/**
 *
 * @author Marcelo
 */
public class Exerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //Abaixo utilizo a biblioteca Calendar para capturar o ano do SISTEMA LOCAL
        int AnoAtual = cal.get(Calendar.YEAR);
        double sal,i=1.5;
        int ano;
        sal=1000;
        
        
        for(ano=2006;ano<=AnoAtual;ano++){     
            sal=sal+(1000*(i/100));   
            i*=2;  
        }
        // Abaixo utilizo o NumberFormat para adequar o numero na forma monetária
        System.out.println("O salário final vale: "+NumberFormat.getCurrencyInstance().format(sal));
        
        
    }
    
}

