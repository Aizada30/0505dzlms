public class Person {

    private String $nameofPerson;
    private String work;
    private int age;


    public Person(String nameofPerson,String work,int age){
        this.$nameofPerson=nameofPerson;
        this.work=work;
        this.age=age;
    }
    public String getNameofPerson(){
        return $nameofPerson;
    }
    public String getWork(){
        return work;
    }
   public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameofPerson='" + $nameofPerson + '\'' +
                ", work='" + work + '\'' +
                ", age=" + age +
                '}';
    }
}
