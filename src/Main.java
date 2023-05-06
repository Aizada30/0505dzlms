import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static <Massiv> void main(String[] args) {


        Car[] cars = {new Car("Bugaty","red","Enshteyn\n"),
                new Car("Ferary","Grou","Pixsel\n"),
                new Car("Jiguly","Yellow" ,"Om\n")
        };

        School[]  schools = {new School("\nBokonbaeva", "\nhightr street",52),
                new School("\nOxfort","\nAmerican street" ,97),
                new School("\nHarward","\nBritish street" ,36)
        };


        Person[] persons = { new Person("Alex", "Student",18 ),
                new Person("\nBob","  Teacher" ,25),
                new Person("\nJessy","Srudent" ,23),
                new Person ("\nNiko","Professor" ,21),
        };

        University[] universities={new University("Hogwards","Biton street" ,94),
                new University("\nAlfeya","Magix street" ,65),
                new University("\nPolyner","Uyti street" ,26),
        };
        //int[][]mas={{persons.length},{schools.length},{cars.length},{universities.length}};

        for (int i = 0; i <=70; i++) {
            System.out.println("Choose one: \n"+
                    "car <-1\n"+"scool <-2\n"+"person <-3\n"+"unyk <-4\n"+
                    "If you want to stop then write 'x'  ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write here: ");
            String word=scanner.nextLine();
            switch (word){
                case "1" : {
                    System.out.println(Arrays.toString(cars));
                }break;
                case "2" : {
                    System.out.println(Arrays.toString(schools));
                }break;
                case "3" : {
                    System.out.println(Arrays.toString(persons));
                }break;
                case "4" : {
                    System.out.println(Arrays.toString(universities));
                }break;
                case "x" : {

                }default:
                    System.out.println("Write please a right number!!!");
            }
        }


//        if (word.equals("car")){
//            System.out.println(Arrays.toString(cars));
//        } else if (word.equals("school")) {
//            System.out.println(Arrays.toString(schools));
//        } else if (word.equals("person")) {
//            System.out.println(Arrays.toString(persons));
//        } else if (word.equals("unyk")) {
//            System.out.println(Arrays.toString(universities));
//        }
//

    }
}