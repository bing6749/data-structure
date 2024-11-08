package top.homework.设计模式.题目二;
/*
 * @author  MaRui
 * @date  2024/11/7 10:08
 * @version 1.0
 */


/**
 * @author MaRui
 */
class WarriorBuilder57 extends CharacterBuilder57 {

    @Override
    public WarriorBuilder57 setGender() {
        this.gender = "男";
        return this;
    }

    @Override
    public WarriorBuilder57 setOutfit() {
        this.outfit = "战士服";
        return this;
    }

    @Override
    public WarriorBuilder57 setHairstyle() {
        this.hairstyle = "短发";
        return this;
    }
}
