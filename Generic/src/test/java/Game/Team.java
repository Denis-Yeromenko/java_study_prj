package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void newParticipantAdd(T participant){
        participants.add(participant);
        System.out.println((participant).getName() + " was added in " + name +" team");
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 0){
            System.out.println("The "+this.name+" team is a winners!");
        }else {
            System.out.println("The "+team.name+" team is a winners!");
        }
    }
}
