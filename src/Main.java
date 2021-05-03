public class Main {
    public static void main(String[] args)  {

        User user = new User(1,"Sibel", "sibel.apis@gmail.com", "password1");
        UserManager usermanager= new UserManager();
        usermanager.add(user);
        usermanager.update(user);

        Student student = new Student(1, "Sibel", "sibel.apis@gmail.com", "password1", "Sibel", "Apiş", "Java");
        StudentManager studentManager = new StudentManager();
        studentManager.create(student);

        Instructor instructor = new Instructor(1, "Eğitmen");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.choose(instructor);




        
       
    }
}
