package ch.heigvd.res.lab00;

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
   
}
