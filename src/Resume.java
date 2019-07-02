import java.util.Scanner;
import java.util.ArrayList;

public class Resume {

    public static void main (String [] args) {
        Scanner reader = new Scanner (System.in);
        Skill skills = new Skill();
        Person person = new Person();
        Experience experience = new Experience();
        Education education = new Education();

        String answer ;

        ArrayList<Person> personArrayList = new ArrayList<Person>();

        System.out.println("Welcome to RoboResume.com! ");
        System.out.println("We can help you build your own personalized resume! ");

        System.out.println("Enter your full name: ");
        person.setMyName(reader.nextLine());
        System.out.println("Enter your email: ");
        person.setEmail(reader.nextLine());
        personArrayList.add(person);



        System.out.println("Enter the name of the University you attended: ");
        education.setMyUniversity(reader.nextLine());
        System.out.println("Enter Degree Type (Associate, Bachelors, Masters): ");
        education.setDegreeType(reader.nextLine());
        System.out.println("Enter your Major: ");
        education.setMajor(reader.nextLine());
        System.out.println("Enter the year you graduated form university: ");
        education.setGraduationYear(reader.nextInt());

        person.addEducation(education);

        System.out.println("Enter the name of the Company you worked for: ");
       experience.setCompany(reader.nextLine());
        System.out.println("Enter your job title: ");
        experience.setJobTitle(reader.nextLine());
        System.out.println("Enter the name of the Company you worked for: ");
        experience.setCompany(reader.nextLine());
        System.out.println("Describe your job at the company: ");
        experience.addDescription(reader.nextLine());

        person.addExperience(experience);

        System.out.println("Enter your skill: ");
        skills.setMySkills(reader.nextLine());
        System.out.println("Skill proficiency (Fundamental, Novice, Intermediate, Advanced, Expert");
        skills.setProficiency(reader.nextLine());

        person.addSkill(skills);

        for (Person eachperson : personArrayList) {
            System.out.println("-----------------------------------------");
            System.out.println("-----------------------------------------");
            System.out.println(eachperson.getMyName() );
            System.out.println(eachperson.getEmail());
        } for (Education newed : person.getEducationArrayList()) {
            System.out.println("Education");
            System.out.println(newed.getDegreeType() + " in " + newed.getMajor() + " , ");
            System.out.print(newed.getMyUniversity() + " ,");
            System.out.print(newed.getGraduationYear());
        }


        for (Experience newexp : person.getExperienceArrayList() ) {
            System.out.println("Experience ");
            System.out.println(newexp.getCompany() );
            System.out.println(newexp.getJobTitle());



            for (Object description : experience.getJobDescription()) {
                System.out.println(description);
                System.out.println("\n");
            }



            for (Skill eachSkill : person.getSkillsArrayList()) {
                System.out.println("Skills");
                System.out.print(eachSkill.getMySkills() + " , ");
                System.out.print(eachSkill.getProficiency());

            }

        }

    }
}