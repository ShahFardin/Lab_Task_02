package fardin;

public class Student {
       String name;
       int id;
       static String UniversityName="Leading University";
       Student()
       {
        System.out.println("default constructor");
       }
       Student (int id)
       {
        this.id=id;
        System.out.println(" Student Name and id :"+id);
        }
        Student(String name, int id){
        this.name=name;
        this.id=id;
        System.out.println(" Student Name and ID:"+name+"
        "+id);
        }
       void display(){
         system.out.println(UniversityNmae);
        }

}

/*   Name: Fardin shah
     ID: 2012020126
     Section : C
     email: cse_2012020126@lus.ac.bd
     Date:8/8/2021
*/
        