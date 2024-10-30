import java.time.LocalDate;

public abstract class EducationCenter {
    //полелери
    private String name;
    private String  locatedCountry;
    private LocalDate foundationYear;
//пустой конструктор.
    public EducationCenter() {
    }
//конструктор с параметрам.
    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }
//геттер жана сеттер.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "Name: " + name + "\n" +
                "LocatedCountry: " + locatedCountry + '\n' +
                "FoundationYear: " + foundationYear +
                '}';
    }
}
