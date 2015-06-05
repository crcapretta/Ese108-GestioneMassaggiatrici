package gestioneMassaggiatrici;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Vector;

public class Prenotazione {
	
	private LocalDateTime da;
	private LocalDateTime a;
	private Cliente cliente;
	private Vector<Massaggiatrice>massaggiatrici;
	private Vector<Servizio>servizi;
	private int numeroMassaggiatrici;
	
	
	public Prenotazione(LocalDateTime da, LocalDateTime a, Cliente cliente,int numeroMassaggiatrici) {
		if(da != null){
		  this.da = da;
		}
		else{
			throw new IllegalArgumentException("da non può essere null");
		}
		if(a != null){
		   this.a = a;
		}
		else{
			throw new IllegalArgumentException("a non può essere null");
		}
		if(cliente != null){
		  this.cliente = cliente;
		}
		else{
			throw new IllegalArgumentException("cliente non può essere null");
		}
		if(numeroMassaggiatrici>0){
			
			this.numeroMassaggiatrici = numeroMassaggiatrici;
			
		}
		else{
			
			throw new IllegalArgumentException("Il numero delle massaggiatrici deve essere maggiore di 0");
		}
		
	     massaggiatrici = new Vector<Massaggiatrice>();
		 servizi = new Vector<Servizio>();
	}


	public int getNumeroMassaggiatrici() {
		return numeroMassaggiatrici;
	}


	public LocalDateTime getDa() {
		return da;
	}


	public LocalDateTime getA() {
		return a;
	}


	public Cliente getCliente() {
		return cliente;
	}


	


	public Vector<Massaggiatrice> getMassaggiatrici() {
		return massaggiatrici;
	}


	public Vector<Servizio> getServizzi() {
		return servizi;
	}


	@Override
	public String toString() {
		return "Prenotazione [da=" + da + ", a=" + a + ", cliente=" + cliente
				+ ", massaggiatrici=" + massaggiatrici + ", servizi=" + servizi
				+ "]";
	}
	
	public void addMassaggiatrice(Massaggiatrice m) {
		
		if(massaggiatrici.size() < numeroMassaggiatrici){
		
          massaggiatrici.addElement(m);		
		}
		else{
			throw new IllegalArgumentException("il numero di massaggiatrici per questa prenotazione è stato raggiunto");
		}
	}
	
	public void addServizio(Servizio s){
		
		if(servizi.size() < massaggiatrici.size()){
			
			servizi.addElement(s);
		}
		else{
			throw new IllegalArgumentException("una massaggiatrice può eseguire un solo servizio");
		}
		
		
	}
	
	
	public double getCostoTotale(){
		double costo=0;
        if(servizi.size() == numeroMassaggiatrici){
		    for(Servizio s:servizi){
			
			     costo=costo + s.getCosto();
			
		     }
		    costo = (double) (Duration.between(da,a).getSeconds()/3600) * costo;
        }
        else{
        	throw new IllegalArgumentException("senza l'elenco di tutti i servizi non si può determinare il costo totale");
        }
		
		
		return costo;
	}
	
	

}
