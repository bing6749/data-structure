package top.homework.设计模式.题目二;
/*
 * @author  MaRui
 * @date  2024/11/7 10:08
 * @version 1.0
 */


/**
 * @author MaRui
 */
class MageBuilder57 extends CharacterBuilder57 {

    @Override
    public MageBuilder57 setGender() {
        this.gender = "女";
        return this;
    }

    @Override
    public MageBuilder57 setOutfit() {
        this.outfit = "法师袍";
        return this;
    }

    @Override
    public MageBuilder57 setHairstyle() {
        this.hairstyle = "长发";
        return this;
    }
}

