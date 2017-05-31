
public class Manuel extends Livre{
	private int niveau ;
    public Manuel(int num,String titre,String auteur,int nb_page , int niveau)
    {
    	super(num,titre,auteur,nb_page);
    	this.niveau=niveau;
    }
    
    public String ToString()
    {
    	super.ToString();
    	return "niveau scolaire : " +niveau;
    }
    
}


