public class Education {

    private String degreeType, major, myUniversity;
      private int  graduationYear;

    public Education() {
        degreeType = degreeType;
        myUniversity = myUniversity;
        major = major;
        graduationYear = graduationYear;
    }

    public Education(String degreeType, String major, String myUniversity, int graduationYear) {
        this.degreeType = degreeType;
        this.major = major;
        this.myUniversity = myUniversity;
        this.graduationYear = graduationYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degree) {
        this.degreeType = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMyUniversity() {
        return myUniversity;
    }

    public void setMyUniversity(String myUniversity) {
        this.myUniversity = myUniversity;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationyear) {
        this.graduationYear = graduationyear;
    }

    @Override
    public String toString() {
        return "Education{" +
                "degreeType='" + degreeType + '\'' +
                ", major='" + major + '\'' +
                ", myUniversity='" + myUniversity + '\'' +
                ", graduationYear=" + graduationYear +
                '}';
    }
}

