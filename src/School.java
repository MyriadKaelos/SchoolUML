public class School {
    private String name;
    private Section[] sections;
    private int sectionCount;
    public School(String name) {
        this.name = name;
        this.sections = new Section[0];
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
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
    public Section[] getSections() {
        return sections;
    }
}
