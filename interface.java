import java.util.*;

interface Instrument{
	public void play();
	public String what();
	public void adjust();
}

class Driver{
	public static void main(String args[]){
		Instrument i1 = new Woodwind();
		Instrument i2 = new Brass();

		i1.play();
		System.out.println(i1.what());
		i1.adjust();

		System.out.println();
		
		i2.play();
		System.out.println(i2.what());
		i2.adjust();

	}
}
class Wind implements Instrument{
	public void play(){
		System.out.println("Playing WIND Instrument");
	}

	public String what(){
		return "Flute";
	}

	public void adjust(){
		System.out.println("Adjusting WIND Instrument");
	}
}

class Percussion implements Instrument{
	public void play(){
		System.out.println("Playing Percussion Instrument");
	}

	public String what(){
		return "Drums";
	}

	public void adjust(){
		System.out.println("Adjusting Percussion Instrument");
	}
}

class Stringed implements Instrument{
	public void play(){
		System.out.println("Playing Stringed Instrument");
	}

	public String what(){
		return "Violin";
	}

	public void adjust(){
		System.out.println("Adjusting Stringed Instrument");
	}
}

class Woodwind extends Wind{
	public void play(){
		System.out.println("Playing Woodwind");
	}

	public String what(){
		return ("Playing Woodwind Instrument");
	}
}

class Brass extends Wind{
	public void play(){
		System.out.println("Playing Brass");
	}

	public void adjust(){
		System.out.println("Playing Brass Instrument");
	}
}
