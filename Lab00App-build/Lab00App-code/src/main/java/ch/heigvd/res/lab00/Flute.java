/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author rossier
 */
class Flute implements IInstrument{

    public Flute() {
    }

    @Override
    public String play() {
	return "pfiouut";
    }

    @Override
    public int getSoundVolume() {
	return 5;
    }

    @Override
    public String getColor() {
	return "silver";
    }
    
}
