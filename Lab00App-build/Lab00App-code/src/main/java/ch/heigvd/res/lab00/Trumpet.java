<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======
>>>>>>> upstream/with-bdd
package ch.heigvd.res.lab00;

/**
 *
<<<<<<< HEAD
 * @author rossier
 */
class Trumpet implements IInstrument{

    public Trumpet() {
    }

    @Override
    public String play() {
	return "pouet";
    }

    @Override
    public int getSoundVolume() {
	return 10;
    }

    @Override
    public String getColor() {
	return "golden";
    }
    
=======
 * @author Olivier Liechti
 */
public class Trumpet implements IInstrument {

  @Override
  public String play() {
    return "pouet";
  }

  @Override
  public int getSoundVolume() {
    return 1000;
  }

  @Override
  public String getColor() {
    return "golden";
  }

>>>>>>> upstream/with-bdd
}
