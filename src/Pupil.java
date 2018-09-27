public class Pupil extends Person {
    private String group;


    public String getGroup() {
        return group;
    }


      public Pupil(String name, int age, String group, String subject) {
                this.group = group;
    }

    @Override
    public String toString() {
        return "Pupil " + "group" + getGroup()
                + "subject" ;
    }
}
