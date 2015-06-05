package test;

import java.time.LocalDateTime;

import gestioneMassaggiatrici.*;

public class Ese108
{
	public static void main(String[] args)
	{
		CentroBenessere centroBenessere = new CentroBenessere("SPA");
		try
		{
			centroBenessere = new CentroBenessere(null);
			System.err.println("Eccezione 1 non lanciata");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Eccezione 1 lanciata: " + e.getMessage());
		}
		
		Massaggiatrice Laura = new Massaggiatrice("Laura");
		centroBenessere.addMassaggiatrice(Laura);
		Massaggiatrice Chiara = new Massaggiatrice("Chiara");
		centroBenessere.addMassaggiatrice(Chiara);
		Massaggiatrice Anastasya = new Massaggiatrice("Anastasiya");
		centroBenessere.addMassaggiatrice(Anastasya);
		Massaggiatrice Harumi = new Massaggiatrice("Harumi");
		centroBenessere.addMassaggiatrice(Harumi);
		Massaggiatrice Sasha = new Massaggiatrice("Sasha");
		centroBenessere.addMassaggiatrice(Sasha);
		
		Cliente buigi = new Cliente("Gabriele", "Quirini", 18, "3491234567");
		
		Prenotazione abituale = new Prenotazione(LocalDateTime.of(2015, 06, 04, 12, 30), LocalDateTime.of(2015, 06, 04, 16, 30), buigi, 4);
		
		buigi.addPrenotazione(abituale);
		
		abituale.addMassaggiatrice(Laura);
		Laura.addPrenotazione(abituale);
		abituale.addMassaggiatrice(Chiara);
		Chiara.addPrenotazione(abituale);
		abituale.addMassaggiatrice(Anastasya);
		Anastasya.addPrenotazione(abituale);
		abituale.addMassaggiatrice(Harumi);
		Harumi.addPrenotazione(abituale);
		
		try
		{
			abituale.addMassaggiatrice(Sasha);
			System.err.println("Eccezione 2 non lanciata");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Eccezione 2 lanciata: " + e.getMessage());
		}
		
		Servizio completo = new Servizio("completo",30);
		abituale.addServizio(completo);
		completo.addPrenotazione(abituale);
		
		abituale.addServizio(completo);
		
		abituale.addServizio(completo);
		
		abituale.addServizio(completo);
		
		
		
		try{
			
			abituale.addServizio(completo);
			System.err.println("Eccezione 3 non lanciata");
		}
		catch(IllegalArgumentException e){
			
			System.out.println("Eccezione 3  lanciata: "+ e.getMessage());
			
			
		}
		
		System.out.println(" "+abituale.getCostoTotale());
		try{
		
		     Cliente Simone = new Cliente("Simone","Ficola",17,"123456789");
		     System.err.println("Eccezione 4 non lanciata");
		}
		catch(IllegalArgumentException e){
			
			System.out.println("Eccezione 4 lanciata: "+ e.getMessage());
		}
		
		Cliente Francesco = new Cliente("Francesco","Trotta",37,"987654321");
		try{
			
			Prenotazione prima = new Prenotazione(LocalDateTime.of(2015,06,04,13,00),LocalDateTime.of(2015,06,04,14,30),Francesco,0);
			System.err.println("Eccezione 5 non lanciata");
			
		}
		catch(IllegalArgumentException e){
			
			System.out.println("Eccezione 5 lanciata: "+ e.getMessage());
			
		}
		
		Prenotazione seconda = new Prenotazione(LocalDateTime.of(2015,06,04,13,00),LocalDateTime.of(2015,06,04,14,30),Francesco,2);
		seconda.addMassaggiatrice(Sasha);
		Sasha.addPrenotazione(seconda);
		Laura.isDisponibile(LocalDateTime.of(2015,06,04,13,00),LocalDateTime.of(2015,06,04,14,30));
		try{
			
		    Laura.addPrenotazione(seconda);
			System.err.println("Eccezione 6 non lanciata");
			
		}
		catch(IllegalArgumentException e){
			
			System.out.println("Eccezione 6 lanciata: "+ e.getMessage());
			
		}
		
		seconda.addServizio(completo);
		try{
			
			seconda.getCostoTotale();
			System.err.println("Eccezione 7 non lanciata");
			
		}
		catch(IllegalArgumentException e){
			
			
			System.out.println("Eccezione 7 lanciata: "+ e.getMessage());
		}
		
		
	}
}