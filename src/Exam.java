import java.util.List;

public class Exam {
    /* I implemented the class "question" inside "exam" because this is a composition relationship
    and therefore question cant be used in any other class anyway */
    public class Question {
        private String task;
        private int id, maxValue;

        public Question(int id, int value, String task) {
            this.task = task;
            this.id = id;
            this.maxValue = value;
        }

    }
    private List<Question> questions;
    private int maxValue;
    private List<Student> registered;

    public List<Student> getRegisteredStudents() {
        return this.registered;
    }
    public boolean register(Student student) {
        if (student.exams.contains(this)) {
            return true;
        } else return false;
    }
    public void addQuestion(int id, String task, int value) {
        questions.add(new Question(id, value, task));
    }
    public void setMaxValue(int max) {
        this.maxValue = max;
    }

}
