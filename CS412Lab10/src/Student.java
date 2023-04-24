public class Student implements java.io.Serializable {   
   private int id, score;   
   private String firstname, lastname, branch, email;    
  
   public int getId() { 
      return id; 
   } 
   public String getfName() { 
      return firstname; 
   } 
   public String getlName() { 
      return lastname; 
   }
   public String getBranch() { 
      return branch; 
   } 
   public int getScore() { 
      return score; 
   } 
   public String getEmail() { 
      return email; 
   } 
   public void setID(int id) { 
      this.id = id; 
   } 
   public void setfName(String name) { 
      this.firstname = name; 
   } 
   public void setlName(String name) { 
      this.lastname = name; 
   } 
   public void setBranch(String branch) { 
      this.branch = branch; 
   } 
   public void setScore(int score) { 
      this.score = score; 
   } 
   public void setEmail(String email) { 
      this.email = email; 
   } 
}
