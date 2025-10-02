package Abstratos;

import java.util.ArrayList;

public class GameProject {
    public static void main(String[] args) {
        Game game1 = new Fisico("GoW", 200.0f, "L01");
        Game game2 = new Digital("The Witcher", 75, "62626262");

        ArrayList<Game> games = new ArrayList<>();// essa lista vai receber apenas objetos do tipo game
        games.add(game1);
        games.add(game2);

        for (Game g: games){
  
                g.printGame();

        }
    }
}
