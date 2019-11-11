package prova;

public class Ghiacciolo 
{
	String gusto;
	String forma;
	String colore;
	
	public Ghiacciolo(String gusto, String forma, String colore) {
		this.setColore(colore);
		this.setGusto(gusto);
		this.setForma(forma);
	}
	
	public Ghiacciolo(String gusto, String forma) {
		this.gusto = gusto;
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Ghiacciolo [gusto=" + gusto + ", forma=" + forma + ", colore=" + colore + "]";
	}
	
	public void etichetta(String nomeGhiacciolo) {
		System.out.println("Il gusto di" + nomeGhiacciolo + "è" + gusto + "\n La forma è" + forma + "\n Il colore è" + colore);
	}
	
	public String getGhiacciolo() {
		return "Ghiacciolo [gusto=" + gusto + ", forma=" + forma + ", colore=" + colore + "]";
	}

	public String getGusto() {
		return gusto;
	}
	

	private void setGusto(String gusto) {
		this.gusto = "arancione";
	}

	public String getForma() {
		return forma;
	}

	private void setForma(String forma) {
		this.forma = forma;
	}

	public String getColore() {
		return colore;
	}

	private void setColore(String colore) {
		this.colore = colore;
	}
		
	
	
}
