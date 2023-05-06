public class University {

   private  String $nameofUniver;
    private String Adresse;
    private int numberofUniver;


    public University(String nameofUniver,String Adresse,int numberofUniver){
        this.$nameofUniver=nameofUniver;
        this.Adresse=Adresse;
        this.numberofUniver=numberofUniver;
    }

    public String getNameofUniver(){
        return $nameofUniver;
    }
   public String getAdresse(){
        return Adresse;
    }
   public int getNumberofUniver(){
        return numberofUniver;


    }

    @Override
    public String toString() {
        return "University{" +
                "nameofUniver='" + $nameofUniver + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", numberofUniver=" + numberofUniver +
                '}';
    }
}
