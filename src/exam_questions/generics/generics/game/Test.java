package exam_questions.generics.generics.game;

public class Test {

    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);

        Student student1 = new Student("Nikolai", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam1 = new Team("dragons");
        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Up");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Workers");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);


        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olga", 14);

        Team<Schoolar> schoolarTeam2 = new Team("children");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam1.playWith(schoolarTeam2);
//        schoolarTeam1.playWith(employeeTeam);

    }
}


