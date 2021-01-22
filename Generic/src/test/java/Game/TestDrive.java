package Game;

public class TestDrive {
    public static void main(String[] args) {
        Team team1 = new Team("Dragons");
        Team team2 = new Team("Workers");
        Team team3 = new Team("Unique");

        Schoolar schoolar1 = new Schoolar("Sergio", 13);
        Schoolar schoolar2 = new Schoolar("Monica", 12);

        Student stud1 = new Student("John", 19);
        Student stud2 = new Student("July", 18);

        Employee emp1= new Employee("Kim", 35);
        Employee emp2= new Employee("Paul", 37);

        team1.newParticipantAdd(schoolar1);
        team1.newParticipantAdd(schoolar2);
        team2.newParticipantAdd(stud1);
        team2.newParticipantAdd(stud2);
        team3.newParticipantAdd(emp1);
        team3.newParticipantAdd(emp2);

        team2.playWith(team3);


    }
}
