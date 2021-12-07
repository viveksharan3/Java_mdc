package test;


public class Sitar {
	public static void main(String[] args) {
	
		Sitar_run g = new Sitar_run();
		g.use();
		g.play();
		g.tuneStrings();
		Violin_run v = new Violin_run();
		v.use();
		v.play();
		v.tuneStrings();
		
	}
}

interface Instrument
{
	void use(); 
}
abstract class MusicalInstrument implements Instrument {
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument {
	abstract void tuneStrings();
}
class Sitar_run extends StringBasedMusicalInstrument {

	void play() { System.out.println("playing Sitar....."); }
	public void use() { System.out.println("using Sitar....."); }
	void tuneStrings() { System.out.println("tuning Sitar.....");}	
}
class Violin_run extends StringBasedMusicalInstrument {

	void play() { System.out.println("playing Violin....."); }
	public void use() { System.out.println("using Violin....."); }
	void tuneStrings() { System.out.println("tuning Violin.....");}	
}
