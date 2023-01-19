package Animals;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class AnimalsWithTails {
    public String nickname;
    public String favoriteFood;
    public int age;
    public LocalDate dateOfEntranceToTheZoo;
    public int weight;
    public double height;
    public double tailLength;


    public AnimalsWithTails() {

    }

    public AnimalsWithTails(String nickname, String favoriteFood, int age, LocalDate dateOfEntranceToTheZoo, int weight, double height, double tailLength) {
        this.nickname = nickname;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.dateOfEntranceToTheZoo = dateOfEntranceToTheZoo;
        this.weight = weight;
        this.height = height;
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "AnimalsWithTails{" +
                "nickname='" + nickname + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", age=" + age +
                ", dateOfEntranceToTheZoo=" + dateOfEntranceToTheZoo +
                ", weight=" + weight +
                ", height=" + height +
                ", tailLength=" + tailLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalsWithTails that = (AnimalsWithTails) o;
        return age == that.age && weight == that.weight && Double.compare(that.height, height) == 0 && Double.compare(that.tailLength, tailLength) == 0 && nickname.equals(that.nickname) && favoriteFood.equals(that.favoriteFood) && dateOfEntranceToTheZoo.equals(that.dateOfEntranceToTheZoo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, favoriteFood, age, dateOfEntranceToTheZoo, weight, height, tailLength);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfEntranceToTheZoo() {
        return dateOfEntranceToTheZoo;
    }

    public void setDateOfEntranceToTheZoo(LocalDate dateOfEntranceToTheZoo) {
        this.dateOfEntranceToTheZoo = dateOfEntranceToTheZoo;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }


    public static AnimalsWithTails getTaller(List<AnimalsWithTails> listAnimals) {
        AnimalsWithTails animalTaller;
        return animalTaller = listAnimals.stream().max(Comparator.comparingDouble(AnimalsWithTails::getHeight)).get();
    }

    public static AnimalsWithTails getLower(List<AnimalsWithTails> listAnimals) {
        AnimalsWithTails animalLower;
        return animalLower = listAnimals.stream().min(Comparator.comparingDouble(AnimalsWithTails::getHeight)).get();
    }

    public static AnimalsWithTails getHeavier(List<AnimalsWithTails> listAnimals) {
        AnimalsWithTails animalHavier;
        return animalHavier = listAnimals.stream().max(Comparator.comparingDouble(AnimalsWithTails::getHeight)).get();
    }

    public static AnimalsWithTails getLightier(List<AnimalsWithTails> listAnimals) {
        AnimalsWithTails animalLightier;
        return animalLightier = listAnimals.stream().min(Comparator.comparingDouble(AnimalsWithTails::getHeight)).get();
    }

    public static AnimalsWithTails getLongestTail(List<AnimalsWithTails> listAnimals){
        AnimalsWithTails animalsWithTails;
        return  animalsWithTails = listAnimals.stream().max(Comparator.comparingDouble(AnimalsWithTails::getTailLength)).get();
    }
}
