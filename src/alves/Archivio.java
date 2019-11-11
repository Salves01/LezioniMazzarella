package alves;

public class Archivio {

	private Persona [] archivio;

	public Archivio(int dimensione) {
		archivio = new Persona[dimensione];
	}
	
	public boolean addPersona(Persona p) {
		for(int i = 0; i < archivio.length; i++) {
			if (archivio [i] == null) {
				archivio[i] = p;
				return true;	
			}
		}
		return false;
	}
	
	
	public void stampa() {
		for(int i = 0; i < archivio.length; i++) {
			System.out.println(i + ") " + archivio[i]);
		}
	}
 
	public static void main(String[] args) {
	Archivio arc = new Archivio(5);
	Persona p = new Persona("Alfons", "m", 15);
	arc.addPersona(p);
	arc.addPersona(new Persona("lucas", "a", 22));
	arc.stampa();
	}
}
