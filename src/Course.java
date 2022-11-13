import java.util.List;

public class Course {
    private Department dept;
    private Professor prof1, prof2, prof3;
    private int id, maxCapacity;
    private String name;
    private boolean isFull;

    public Course(List<Professor> proflist, int maxcapacity, int id, String name, boolean isfull, Department dept) {
        this.dept = dept;
        /* Damit die Course <-> Department relation auch in department abgebildet ist : */
        dept.addCourses(this);
        this.id = id;
        this.isFull = isfull;
        this.name = name;
        this.maxCapacity = maxcapacity;
        if (proflist.isEmpty() == false){
            this.prof1 = proflist.get(1);
        } if (proflist.size()>1){
            this.prof2 = proflist.get(2);
        } if (proflist.size()>2) {
            this.prof3 = proflist.get(3);
        }
    }
    public Professor getProf1() {
        return prof1;
    }
    public Professor getProf2() {
        return prof2;
    }
    public Professor getProf3() {
        return prof3;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMaxCap (int max) {
        this.maxCapacity = max;
    }
    public void setDept(Department coursedept) {
        this.dept = coursedept;
    }
}
