package top.homework.设计模式.题目二;
/*
 * @author  MaRui
 * @date  2024/11/7 10:07
 * @version 1.0
 */


/**
 * @author MaRui
 */
abstract class CharacterBuilder57 {
    protected String gender;
    protected String outfit;
    protected String hairstyle;

    public abstract CharacterBuilder57 setGender();
    public abstract CharacterBuilder57 setOutfit();
    public abstract CharacterBuilder57 setHairstyle();
    public Character57 build() {
        return new Character57(gender, outfit, hairstyle);
    }
}
