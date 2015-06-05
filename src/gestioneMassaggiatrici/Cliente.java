package gestioneMassaggiatrici;

import java.util.Vector;

public class Cliente {
	
	private String nome;
	private String cognome;
	private int età;
	private String numeroDiTelefono;
	private Vector<Prenotazione>prenotazioni;
	
	
	public Cliente(String nome, String cognome, int età, String numeroDiTelefono) {
		if(nome != null){
		   this.nome = nome;
		}
		else{
			throw new IllegalArgumentException("nome non può essere null");
		}
		if(cognome != null){
		   this.cognome = cognome;
		}
		else{
			throw new IllegalArgumentException("cognome non può essere null");
		}
		if(età >= 18){
		   this.età = età;
		}
		else{
			throw new IllegalArgumentException("il cliente deve essere maggiorenne");
		}
		if(numeroDiTelefono != null){
		   this.numeroDiTelefono = numeroDiTelefono;
		}
		else{
			throw new IllegalArgumentException("il numero di telefono non può essere null");
		}
		
		prenotazioni = new Vector<Prenotazione>();
	}


	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}


	public int getEtà() {
		return età;
	}


	public String getNumeroDiTelefono() {
		return numeroDiTelefono;
	}


	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", età="
				+ età + ", numeroDiTelefono=" + numeroDiTelefono
				+ ", prenotazioni=" + prenotazioni + "]";
	}
	
	
	public void addPrenotazione(Prenotazione p){
		
		prenotazioni.addElement(p);
		
	}
	
	

}
