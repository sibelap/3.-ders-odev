public class Student extends User{
    private String name;
    private String surname;
    private String Lesson;

    
    public Student(int id, String userName, String email, String password, String name, String surname, String lesson) {
        super(id, userName, email, password);
        this.name = name;
        this.surname = surname;
        Lesson = lesson;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getLesson() {
        return Lesson;
    }
    public void setLesson(String lesson) {
        Lesson = lesson;
    }





    
}
