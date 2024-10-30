import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Саб класстардын объектиси.
        EducationCenter school = new School("School 81", "Bishkek", LocalDate.of(2004, 8, 10));
        EducationCenter university = new University("KNU", "Bishkek", LocalDate.of(2004, 8, 10));
        EducationCenter college = new College("Peaksoft", "Bishkek", LocalDate.of(2004, 8, 10));

        //10 студунттин объуктиси.
        Student student1 = new Student("Fatima", "Altunbek ruzu", "Famale", LocalDate.of(2024, 10, 1), school);
        Student student2 = new Student("Sakina", "Altunbek ruzu", "Famale", LocalDate.of(2024, 9, 2), university);
        Student student3 = new Student("Aruke", "Nyrkamil kuzu", "Famale", LocalDate.of(2024, 8, 3), college);
        Student student4 = new Student("Aizat", "Erkinbek kuzu", "Famale", LocalDate.of(2024, 7, 4), school);
        Student student5 = new Student("Kasym", "Abdishykyrov", "Famale", LocalDate.of(2024, 6, 5), university);
        Student student6 = new Student("Karim", "Icakov", "Famale", LocalDate.of(2024, 5, 6), college);
        Student student7 = new Student("Usuf", "Kamchiev", "Famale", LocalDate.of(2024, 4, 7), school);
        Student student8 = new Student("Gylnyr", "Asanalieva", "Famale", LocalDate.of(2024, 3, 8), university);
        Student student9 = new Student("Adilet ", "Egemberdiev", "Famale", LocalDate.of(2024, 2, 9), college);
        Student student10 = new Student("Melis", "Nyrlan uulu", "Famale", LocalDate.of(2024, 1, 10), school);

//10 студенттин массиви.
        Student[] student = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        getInfo(student);

    }
//Мейиндеги бир метод.
    public static void getInfo(Student[] students) {
        for (Student student : students) {
            System.out.println("Education center: " + student.getEducationCenter() + "Date of start: " + student.getDateOfStart());
            System.out.println(student.getDateOfStart());
        }

    }

}