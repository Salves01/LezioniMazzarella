package prova;

public class test {

	public static void main(String[] args) {
			Ghiacciolo papa = new Ghiacciolo("arancia", "rettangolare");
			Ghiacciolo regina = new Ghiacciolo("fragola", "rotondo", "rosa");
			System.out.println(regina);
			System.out.println(papa.forma);
			String coloreRegina = regina.getColore();
			System.out.println(coloreRegina);
			Persona p = new Persona("Alfonso",16);
			int etaP = p.getEta();
			System.out.println(etaP);
	}
}
 