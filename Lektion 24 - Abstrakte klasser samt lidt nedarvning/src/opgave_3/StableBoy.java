package opgave_3;

public class StableBoy extends Ansat {
    private String jobDescription;

    public StableBoy(String name, String address, double payPerHour, int yearOfEmployement, int workWeek,
            String jobDescription) {
        super(name, address, payPerHour, yearOfEmployement, workWeek);
        this.jobDescription = jobDescription;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

}
