public class Runner {
    public static void main(String[] args) {
        School bhs = new School("Berkeley High");
        Section math = new Section("Math");
        Section bio = new Section("Biology");
        Section compSci = new Section("Computer Science");
        Teacher a = new Teacher("Albinson");
        Teacher b = new Teacher("Teacher2");
        Teacher c = new Teacher("Teacher3");
        Student me = new Student("Yates");
        Student friend1 = new Student("Friend1");
        Student friend2 = new Student("Friend2");
        Student friend3 = new Student("Friend3");
        Student friend4 = new Student("Friend4");
        Student friend5 = new Student("Friend5");
        compSci.setTeacher(a);
        bio.setTeacher(b);
        math.setTeacher(c);
        math.addStudent(me);
        math.addStudent(friend2);
        bio.addStudent(friend2);
        bio.addStudent(friend3);
        bio.addStudent(friend4);
        compSci.addStudent(friend4);
        compSci.addStudent(friend5);
        compSci.addStudent(me);
        compSci.addStudent(friend1);
        bhs.addSection(math);
        bhs.addSection(bio);
        bhs.addSection(compSci);
        System.out.println(math.toString());
        System.out.println(bio.toString());
        System.out.println(compSci.toString());
    }
}
//1 new  School(“Berkeley High”)
//3 new Sections: “Math”, “Biology”, “Computer Science”
//3 new  Teachers: “Albinson”, “Teacher2”, “Teacher3”
//6 new Students: “Me”, “Friend1”, “Friend2”..