package ch.heigvd.res.lab00;


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
