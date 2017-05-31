
public class Roman extends Livre{
	private String prix;
    public Roman(int num,String titre,String auteur,int nb_page , String prix)
    {
    	super(num,titre,auteur,nb_page);
    	this.prix=prix;
    }
    
    public String ToString(){
    	
    	return super.ToString()+ "\nprix littéraire : " +prix;
    }
}
