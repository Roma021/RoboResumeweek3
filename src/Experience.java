import java.util.ArrayList;

public class Experience {

    private String company;
    private String jobTitle;

    private ArrayList<String>jobDescription;

    public Experience() {
        this.jobTitle= jobTitle;
        this.company = company;
        this.jobDescription= new ArrayList<String>();
    }

    public Experience(String company, String jobTitle, ArrayList<String> jobDescription) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



    public ArrayList<String> getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(ArrayList<String> jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void addDescription(String aDescription){
        jobDescription.add(aDescription);
    }

    @Override
    public String toString() {
        return "Experience{" +
                "company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription=" + jobDescription +
                '}';
    }
}