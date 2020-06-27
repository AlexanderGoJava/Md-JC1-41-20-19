package lesson_4_5.domain;

public class TechPassport<RegNum extends String, Model extends String, IssueYear extends Number> {

    private RegNum registrationNumber;

    private Model model;

    private IssueYear issueYear;

    public TechPassport() {
    }

    public TechPassport(RegNum registrationNumber, Model model, IssueYear issueYear) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.issueYear = issueYear;
    }

    public RegNum getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(RegNum registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public IssueYear getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(IssueYear issueYear) {
        this.issueYear = issueYear;
    }

    @Override
    public String toString() {
        return "TechPassport{" +
                "registrationNumber=" + registrationNumber +
                ", model=" + model +
                ", issueYear=" + issueYear +
                '}';
    }
}
