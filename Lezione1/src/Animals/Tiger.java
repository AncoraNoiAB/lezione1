package Animals;

import java.time.LocalDate;

public class Tiger extends AnimalsWithTails {


    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public Tiger(String nickname, String favoriteFood, int age, LocalDate dateOfEntranceToTheZoo, int weight, double height, double tailLength) {
        super(nickname, favoriteFood, age, dateOfEntranceToTheZoo, weight, height,tailLength);
    }

    public Tiger(){

    }
}
