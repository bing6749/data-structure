package top.homework.设计模式.实验12.题2;
/*
 * @author  MaRui
 * @date  2024/12/25 16:04
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        Team57 team1 = new Team57("联盟一队");
        Team57 team2 = new Team57("联盟二队");

        Player57 playerA = new Player57("玩家A");
        Player57 playerB = new Player57("玩家B");
        Player57 playerC = new Player57("玩家C");

        team1.addObserver(playerA);
        team1.addObserver(playerB);
        team2.addObserver(playerC);

        team1.memberAttacked("玩家A");
        team2.memberAttacked("玩家C");
    }
}