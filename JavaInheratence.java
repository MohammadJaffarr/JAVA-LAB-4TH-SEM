class  Teacher {
    String desig, collageName, enrol;
    Teacher(){
        desig="Teacher";
        collageName= "UOL";
    }
    Teacher(String desig){
        this.desig = desig;
    }
    Teacher(String desig, String collageName){
        this(desig);
        this.collageName = collageName;  
    }

    void work(){
        System.out.print("Teacher is Working");
    } 
}

class ComputerTeacher extends Teacher{
   String mainSubject;
   ComputerTeacher(String mainSubject,String desig, String collageName){
    super(desig,collageName);
    this.mainSubject=mainSubject;
   }

   void display(){
    System.out.println("Desig. Is "+ super.desig);
    System.out.println("Collage Name. Is "+ super.collageName);
    System.out.println("Main Subject. Is "+ mainSubject);
   }
}

public class JavaInheratence {
    public static void main(String[] args){
        // Teacher t = new Teacher("Prof.","UOl");
        // t.collageName='sdsds';
        ComputerTeacher ct = new ComputerTeacher("Java","Prof.","UoL");
        ct.display();
    }
}
