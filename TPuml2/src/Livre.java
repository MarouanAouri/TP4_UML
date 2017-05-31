
public class Livre extends Document implements Imprimable{
  
	private String auteur;
	private int nb_page;
	public Livre(){
		
	}
	public Livre(int num, String titre, String auteur, int nb_page)
	{
		
	  super(num,titre);
	  this.auteur=auteur;
	  this.nb_page=nb_page;
	
	}
	
	public String getAuteur(){
		return auteur;
	}
	
	
	 public String ToString(){
	    	
	    	return super.ToString()+ "\n auteur : " +auteur+ "\n nombre de pages : "+nb_page ;
	    }
	 public void imprimer(){
		 System.out.println("imprimer le livre  : \n" +ToString());
	 }
}
