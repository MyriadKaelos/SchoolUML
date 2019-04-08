public class Teacher extends Person {
    private Section[] sections;
    private String subject;
    private int sectionCount;
    public Teacher(String name) {
        super(name);
        this.sections = new Section[0];
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String n) {
        subject = n;
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
