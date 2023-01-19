package Animals;

import java.time.LocalDate;


public class Lion extends AnimalsWithTails {

    public double tailLength;

    public Lion(String nickname, String favoriteFood, int age, LocalDate dateOfEntranceToTheZoo, int weight, double height, double tailLength) {
        super(nickname, favoriteFood, age, dateOfEntranceToTheZoo, weight, height,tailLength);
    }

    public Lion(){

    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
}
