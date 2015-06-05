package gestioneMassaggiatrici;
import java.util.Vector;

public class CentroBenessere {
	private String nome;
	private Vector<Massaggiatrice> massaggiatrici;
	/**
	 * @param nome
	 */
	public CentroBenessere(String nome) {
		if(nome!=null)
		{
			this.nome = nome;
		}
		else
		{
			throw new IllegalArgumentException("nome non può essere null");
		}
		massaggiatrici=new Vector<Massaggiatrice>();
		
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the massaggiatrici
	 */
	public Vector<Massaggiatrice> getMassaggiatrici() {
		return massaggiatrici;
	}
	public void addMassaggiatrice(Massaggiatrice m)
	{
		massaggiatrici.addElement(m);
		
		
	}
	@Override
	public String toString() {
		return "CentroBenessere [nome=" + nome + ", massaggiatrici="
				+ massaggiatrici + "]";
	}
	
	
	

}
