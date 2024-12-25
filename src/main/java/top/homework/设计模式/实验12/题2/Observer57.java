package top.homework.设计模式.实验12.题2;

import java.util.ArrayList;
import java.util.List;


interface Observer57 {
    void update(String message);
}


abstract class Subject57 {
    private List<Observer57> observers = new ArrayList<>();

    public void addObserver(Observer57 observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer57 observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer57 observer : observers) {
            observer.update(message);
        }
    }
}


class Team57 extends Subject57 {
    private String teamName;

    public Team57(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void memberAttacked(String memberName) {
        String message = "战队 " + teamName + " 的成员 " + memberName + " 正在被攻击！";
        notifyObservers(message);
    }
}


class Player57 implements Observer57 {
    private String playerName;

    public Player57(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void update(String message) {
        System.out.println("玩家 " + playerName + " 收到通知：" + message);
    }
}

