import java.util.Arrays;
public class Student {

    private long id;

    private String name;

    private ArrayLIst<Integer> grades;

    public Student(){}

    public Student(long id, String name){
        this.id = id;
        this.name = name;
    }
    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    // returns the student's id
    public long getId(){...}

    // returns the student's name
    public String getName(){...}

    // adds the given grade to the grades list
    public void addGrade(int grade){...}

    // returns the list of grades
    public ArrayList<Integer> getGrades(){...}

    // returns the average of the students grades
    public double getGradeAverage(){...}

}
