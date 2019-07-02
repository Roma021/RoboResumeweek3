
import java.util.ArrayList;
public class Person {


     private String myName;
            private String email;
    private ArrayList<Education> educationArrayList;
    private ArrayList<Experience>experienceArrayList;
    private ArrayList<Skill>skillsArrayList;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEducationArrayList() {
        return educationArrayList;
    }

    public void setEducationArrayList(ArrayList<Education> educationArrayList) {
        this.educationArrayList = educationArrayList;
    }

    public ArrayList<Experience> getExperienceArrayList() {
        return experienceArrayList;
    }

    public void setExperienceArrayList(ArrayList<Experience> experienceArrayList) {
        this.experienceArrayList = experienceArrayList;
    }

    public ArrayList<Skill> getSkillsArrayList() {
        return skillsArrayList;
    }

    public void setSkillsArrayList(ArrayList<Skill> skillsArrayList) {
        this.skillsArrayList = skillsArrayList;
    }

    public Person() {
       this.myName = myName;
        this.email = email;
        this.educationArrayList = new ArrayList<Education>();
        this.experienceArrayList = new ArrayList<Experience>();
        this.skillsArrayList = new ArrayList<Skill>();
    }

    public Person(String myName, String email, ArrayList<Education> educationArrayList, ArrayList<Experience> experienceArrayList, ArrayList<Skill> skillsArrayList) {
        this.myName = myName;
        this.email = email;
        this.educationArrayList = educationArrayList;
        this.experienceArrayList = experienceArrayList;
        this.skillsArrayList = skillsArrayList;
    }

    public void addEducation(Education aEducation) {educationArrayList.add(aEducation);}


    public void addExperience(Experience aExperience){experienceArrayList.add(aExperience);}

   public void addSkill(Skill aSkill){skillsArrayList.add(aSkill);}

    @Override
    public String toString() {
        return "Person{" +
                "myName='" + myName + '\'' +
                ", email='" + email + '\'' +
                ", educationArrayList=" + educationArrayList +
                ", experienceArrayList=" + experienceArrayList +
                ", skillsArrayList=" + skillsArrayList +
                '}';
   }
}

