public class Teacher extends Person {
    private String subject;

        public String getSubject() {
        return subject;
    }


    public Teacher(String name, int age, String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher " + "subject" + getSubject();
    }
}
