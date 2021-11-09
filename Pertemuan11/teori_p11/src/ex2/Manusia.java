/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Windows 8.1
 */
public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
        
        if(perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan Televisi Jadul Dengan Input: "+((TelevisiJadul)perangkat).getModeInput());
            System.out.println("Voltase Telivisi: "+((TelevisiJadul)perangkat).getVoltase()); 
        }
        else if(perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan Televisi modern Dengan Input: "+((TelevisiModern)perangkat).getModeInput());
            System.out.println("Voltase Telivisi: "+((TelevisiModern)perangkat).getVoltase()); 
        }
    }
}
