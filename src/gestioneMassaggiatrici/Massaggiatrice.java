package gestioneMassaggiatrici;

import java.time.LocalDateTime;
import java.util.Vector;

public class Massaggiatrice {
	
	private String nome;
	private Vector<Prenotazione>prenotazioni;
	private CentroBenessere centroBenessere;
	
	
	public Massaggiatrice(String nome) {
		if(nome != null){
		   this.nome = nome;
		}
		else{
			throw new IllegalArgumentException("nome non può essere null");
		}
		
		prenotazioni = new Vector<Prenotazione>();
	}


	public String getNome() {
		return nome;
	}


	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}


	@Override
	public String toString() {
		return "Massaggiatrice [nome=" + nome + ", prenotazioni="
				+ prenotazioni + "]";
	}
	
	public boolean isDisponibile(LocalDateTime da, LocalDateTime a) { 
		boolean disponibile = true; 
	
	 		for(Prenotazione p : prenotazioni) { 
	 
	 			if ( !da.isAfter(p.getA()) && !a.isBefore(p.getDa())) 
	 			{ 
	 				disponibile = false;  
	 			} 
	 		} 
	 		return disponibile; 
	 	} 
	 	 
	 	public void addPrenotazione(Prenotazione p)  { 
	 		
	 			if (this.isDisponibile(p.getDa(), p.getA())) {  
	 				prenotazioni.addElement(p); 
	 			} 
	 			else {
	 				throw new IllegalArgumentException("la massaggiatrice non è disponibile per la prenotazione"); 
	 		} 
	 	}


		public CentroBenessere getCentroBenessere() {
			return centroBenessere;
		}


		public void setCentroBenessere(CentroBenessere centroBenessere) {
			if(centroBenessere != null){
			    this.centroBenessere = centroBenessere;
			}
			else{
				throw new IllegalArgumentException("centro benessere non può essere null");
			}
		}
	 		
 	 

	

}
