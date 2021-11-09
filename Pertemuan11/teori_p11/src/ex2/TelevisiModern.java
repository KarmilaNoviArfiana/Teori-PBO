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
public class TelevisiModern extends Elektronik{
    private String modeInput;

    public TelevisiModern(int voltase, String modeInput) {
        super(voltase);
        this.modeInput = modeInput;
    }

    public String getModeInput() {
        return modeInput;
    }
    
}
