public class Skill {
    private String mySkills,proficiency;
    public Skill() {
        this.mySkills = mySkills;
        this.proficiency = proficiency;
    }

    public Skill(String mySkills, String proficiency) {
        this.mySkills = mySkills;
        this.proficiency = proficiency;
    }

    public String getMySkills() {
        return mySkills;
    }

    public void setMySkills(String skill) {
        this.mySkills = skill;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String skillRating) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "mySkills='" + mySkills + '\'' +
                ", proficiency='" + proficiency + '\'' +
                '}';
    }
}
