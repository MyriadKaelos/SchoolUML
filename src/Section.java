public class Section {
    private Teacher teacher;
    private Student[] students;
    private String name;
    private int currentSize;
    public Section(String name) {
        this.name = name;
        this.students = new Student[0];
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher t) {
        this.teacher = t;
    }
    public Student[] getStudents() {
        return students;
    }
    public void addStudent(Student s) {
        Student[] save = students;
        students = new Student[save.length+1];
        for(int i = 0; i < save.length; i ++) {
            students[i] = save[i];
        }
        students[save.length] = s;
        currentSize++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        String names = "";
        for(int i = 0; i < students.length-1; i ++) {
            names += students[i].getName() + ", ";
        }
        names += "and " + students[students.length-1].getName() + ".";
        return "This " + name + " class is taught by " + teacher.getName() +
                " and has " + currentSize + " students: " + names;
    }
}
