
public class Document {

   private int num;
   private String titre;
   public Document(){
	   
   }
   public Document(int num , String titre )
   
   {
	   this.num=num;
	   this.titre=titre;	
   }
   
   public String getTitre(){
	   return titre;
   }
   
   public String ToString(){
	   return " num�ro : " +num+ "\n titre : " +titre  ;
   }

}

