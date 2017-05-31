
public class Revue extends Document {
	
	private int mois;
	private int année;
   
	public Revue(int num,String titre,int mois, int année)
	{
		super(num,titre);
		this.mois=mois;
		this.année=année;
	}
   
	public String ToString(){
		
		return super.ToString() + "\n mois : " +mois + "\n année : " +année ;
	}

}
