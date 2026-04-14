
import java.util.*;
class Student {
      int id;
      String name;
      int age;
  //constructor
  Student(String name,int age,int id){
    this.name = name;
    this.age = age;
    this.id = id;
  }
 //methods
 public void display(){
     System.out.println("Name:" + name +",Age:" + age +",ID:" + id);
 }
}
public class manager{
    public static void main(String[] args) {


     Scanner sc = new Scanner(System.in);
     ArrayList <Student> list = new ArrayList<>();

     while (true) {
        System.out.println("\n=>>>EduTrack Student Mangagementn System=<<<<");
        System.out.println("1.Add Student ");
        System.out.println("2.Show all Students ");
        System.out.println("3.Search Student");
        System.out.println("4.Update Student");
        System.out.println("5.Delete Student ");
        System.out.println("6.exit");
        System.out.print("7.Enter your choice:");
        
        int choice = sc.nextInt();

        switch(choice){
           case 1: //ADD
        
           System.out.print("Enter Id: ");
             int id = sc.nextInt();
             sc.nextLine();
             System.out.print("Enter name: ");
             String name  = sc.nextLine();
           System.out.print("Enter age: ");
             int age =  sc.nextInt(); 
             
             list.add(new Student(name,age,id));
             System.out.println("Student Add Successfully");
             break;

          case 2: // show all students
            if (list.isEmpty()){
            System.out.println("No account found !");
           }  else {
              for(Student s:list){

               s.display();
              }
           }
            break;

        case 3: //search
        System.out.print("Enter Id to Search:");
        int Searchid = sc.nextInt();
        boolean found = false;

         for (Student s :list){
            if (s.id ==  Searchid ){
              s.display();
             found  = true;  
             
            }
         }
          if ( !found){
            System.out.println("not found");
          }
          break;

          case 4: //update
           System.out.print("Enter Id to Update:");
           int updateid = sc.nextInt();
           sc.nextLine();
           boolean updated= false;
          
          for (Student s : list){
            if (s.id == updateid){
              System.out.println("Enter new name:");
               String newname = sc.nextLine();

              System.out.println("Enter new age:");
               int newage = sc.nextInt();
               s.name =newname;
               s.age = newage;
              
             System.out.println("Update Successfully");
               updated = true;
            }
          }
          if (!updated) {
            System.out.println(" Not updated");
          }
          break;
          case 5: // delete 
          System.out.print("Enter ID to delete");
           int deleteid = sc.nextInt();
           boolean deleted = false;

           Iterator< Student> it = list.iterator();
            while (it.hasNext()){
              Student s = it.next();
              if (s.id  == deleteid ){
                it.remove();
               deleted = true; 
             System.out.println("Student deleted");  
              }
            }
              if (!deleted){
                System.out.println("student not found");
              }
            break;
           case 6 : //exit
          System.out.println("Extiting.....");
           return;

           default:
            System.out.println("Invalid choice");
         
        }

     }
        
    }
}
