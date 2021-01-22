package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void newParticipantAdd(Participant p){
        participants.add(p);
        System.out.println(p.getName() + " was added in " + name +" team");
    }

    public void playWith(Team team){
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
