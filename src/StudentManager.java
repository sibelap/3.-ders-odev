public class StudentManager extends UserManager {
    public void create(Student student){

        System.out.println("Öğrenci " + student.getName()+ " " + student.getSurname() + " " + "olarak kaydedildi.");
    }
}
