package gestioneMassaggiatrici;

import java.util.Vector;

public class Servizio {
	
	
	private String tipo;
	private double costo;
	private Vector<Prenotazione>prenotazioni;
	
	
	public Servizio(String tipo, double costo) {
		if(tipo != null){
		   this.tipo = tipo;
		}
		else{
			throw new IllegalArgumentException("tipo non può essere null");
		}
		if(costo > 0){
		   this.costo = costo;
		}
		else{
			throw new IllegalArgumentException("il costo deve essere maggiore di 0");
		}
		prenotazioni = new Vector<Prenotazione>();
		
		
	}


	public String getTipo() {
		return tipo;
	}


	public double getCosto() {
		return costo;
	}


	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}


	@Override
	public String toString() {
		return "Servizio [tipo=" + tipo + ", costo=" + costo
				+ ", prenotazioni=" + prenotazioni + "]";
	}



	public void addPrenotazione(Prenotazione p){
		
		
		prenotazioni.addElement(p);
		
	}


	
	
	
	

}
