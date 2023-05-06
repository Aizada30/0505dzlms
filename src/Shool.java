class School {

   private String $nameofSchool;
    private String adresse;
    private int numberofSchool;


    public School(String nameofSchool,String adresse,int numberofSchool){
        this.$nameofSchool=nameofSchool;
        this.adresse=adresse;
        this.numberofSchool=numberofSchool;
    }
    public String getNameofSchool(){
        return $nameofSchool;
    }

    public String getAdresse(){
        return adresse;
    }

    public int getNumberofSchool(){
        return numberofSchool;
    }

    public String toString(){
       return  "School{"+"\n NameofSchool"+$nameofSchool+"\n Adresse: "+adresse+"\n Number of school: "+numberofSchool+"}";
    }
}

