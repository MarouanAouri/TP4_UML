import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/*
 * @author rihana
 */

  public class Etagere extends Document {
     
	Document doc=new Document(40,"Les fondements de reseau");
	List <Document> liste;
	
	public Etagere(){
	liste= new ArrayList<Document>();
	}
	
    public void ajouter_document(int num,String titre){
        Document doc = new Document(num,titre);
        liste.add(doc);
    }
    
    
    public void lister_document(){
    	for (int i=0 ; i<liste.size(); i++) {
    		System.out.println(liste.get(i).ToString());
    	}
    }

    public void rechercher_document(String titre)
    {
    	for (int i=0 ; i<liste.size(); i++) {
    		
    		if(liste.get(i).getTitre()==titre)
    		{
    		System.out.println("le document recherché existe :");	
    		
    		System.out.println(liste.get(i).ToString());
    		}	
    	}
    }
	Dictionnaire dic= new Dictionnaire(2,"larousse","français");
	Livre l1 = new Livre(1,"bonheur d'etre soi","MoussaNabati",200);
	Imprimable i =new Livre();
	Revue rev=new Revue(3,"psychologie",7,2017);
	
	
	public void tri_document(){

		Collections.sort(liste, new Comparator<Document>()
		{
	        public int compare( Document doc1, Document doc2)
	        {
	            return  doc1.getTitre().compareTo(doc2.getTitre());
	        }
	    });
		System.out.println("Les documents triés sont : ");
		for (int i=0 ; i<liste.size(); i++) {
			 System.out.println(liste.get(i).getTitre());
		}
		
//		 for (Document doc : liste) {
//		      System.out.println(doc.getTitre());
//		    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void Rechercher_Doc(String auteur){
//		ArrayList <Livre>  li=new ArrayList<Livre>();
//		Iterator <Livre> it = li.iterator();
//		while(it.hasNext())
//		{
//			if(it.next().getAuteur()==auteur)
//			{
//				
//		    }
//		}
//		
//	}
	
}
