package persona;

public class Prueba {
    String student;
    String persona;
    String school;
    int age;
    int level;

    Prueba(String student, String persona, String school, int age, int level){
        this.student=student;
        this.persona=persona;
        this.school=school;
        this.age=age;
        this.level=level;
    }

    public String getName(){
        return student;
    }

    public String getPersona(){
        return persona;
    }

    public String getSchool(){
        return school;
    }

    public int getAge(){
        return age;
    }

    public int getLevel(){
        return level;
    }
}
