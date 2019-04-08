public class Student extends Person {
    private Section[] sections;
    private int grade;
    private int sectionCount;
    public Student(String name) {
        super(name);
        this.sections = new Section[0];
    }
    public int getGrade() {
        return grade;
    }
    public Section[] getSections() {
        return sections;
    }
    public void addSection(Section s) {
        Section[] save = sections;
        sections = new Section[sectionCount+1];
        for(int i = 0; i < sectionCount; i ++) {
            sections[i] = save[i];
        }
        sections[sectionCount] = s;
        sectionCount++;
    }
}
