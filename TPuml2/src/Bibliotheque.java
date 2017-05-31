
public class Bibliotheque {

	public static void main(String[] args) 
	
	{
         Livre l1 = new Livre(10,"7 habits of highly effective people","Stephen Covey",300);
         Livre l2 = new Livre(12,"lemondedesophie","josteingaarder",300);
         Livre l3 = new Livre(13,"lemondedesophie","josteingaarder",300);
         Livre l4 = new Livre(14,"lemondedesophie","josteingaarder",300);
		//System.out.println(l1.ToString());
		//l1.imprimer();
		Etagere E = new Etagere();
		E.ajouter_document(2, "Revue de presse Janvier");
		E.ajouter_document(3, "Revue de presse Fevrier");
		E.ajouter_document(4, "Journal");
		E.ajouter_document(5, "Java pour les nulls");
		E.lister_document();
		E.rechercher_document("Java pour les nulls");
		E.tri_document();
	}
}
