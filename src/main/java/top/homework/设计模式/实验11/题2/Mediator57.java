package top.homework.设计模式.实验11.题2;
/*
 * @author  MaRui
 * @date  2024/12/25 10:23
 * @version 1.0
 */


// 抽象中介者类
abstract class Mediator57 {
    public abstract void sendMessage(String message, Country57 country);
}

// 具体中介者类：联合国
class UnitedNations57 extends Mediator57 {
    private China57 china;
    private USA57 usa;

    public void setChina(China57 china) {
        this.china = china;
    }

    public void setUSA(USA57 usa) {
        this.usa = usa;
    }

    @Override
    public void sendMessage(String message, Country57 country) {
        if (country == china) {
            usa.receiveMessage(message);
        } else if (country == usa) {
            china.receiveMessage(message);
        }
    }
}

// 抽象同事类：国家
abstract class Country57 {
    protected Mediator57 mediator;

    public Country57(Mediator57 mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}

// 具体同事类：中国
class China57 extends Country57 {
    public China57(Mediator57 mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("中国收到消息: " + message);
    }
}

// 具体同事类：美国
class USA57 extends Country57 {
    public USA57(Mediator57 mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("美国收到消息: " + message);
    }
}

// 客户端类
