package Animals;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class AnimalsWithWings {
    public String nickname;
    public String favoriteFood;
    public int age;
    public LocalDate dateOfEntranceToTheZoo;
    public int weight;
    public double height;
    public double wingSpan;


    public AnimalsWithWings() {

    }

    public AnimalsWithWings(String nickname, String favoriteFood, int age, LocalDate dateOfEntranceToTheZoo, int weight, double height, double wingSpan) {
        this.nickname = nickname;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.dateOfEntranceToTheZoo = dateOfEntranceToTheZoo;
        this.weight = weight;
        this.height = height;
        this.wingSpan = wingSpan;
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
                ", wingSpan=" + wingSpan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalsWithWings that = (AnimalsWithWings) o;
        return age == that.age && weight == that.weight && Double.compare(that.height, height) == 0 && Double.compare(that.wingSpan, wingSpan) == 0 && nickname.equals(that.nickname) && favoriteFood.equals(that.favoriteFood) && dateOfEntranceToTheZoo.equals(that.dateOfEntranceToTheZoo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, favoriteFood, age, dateOfEntranceToTheZoo, weight, height, wingSpan);
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

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double tailLength) {
        this.wingSpan = tailLength;
    }


    public static AnimalsWithWings getTaller(List<AnimalsWithWings> listAnimals) {
        AnimalsWithWings animalTaller;
        return animalTaller = listAnimals.stream().max(Comparator.comparingDouble(AnimalsWithWings::getHeight)).get();
    }

    public static AnimalsWithWings getLower(List<AnimalsWithWings> listAnimals) {
        AnimalsWithWings animalLower;
        return animalLower = listAnimals.stream().min(Comparator.comparingDouble(AnimalsWithWings::getHeight)).get();
    }

    public static AnimalsWithWings getHeavier(List<AnimalsWithWings> listAnimals) {
        AnimalsWithWings animalHavier;
        return animalHavier = listAnimals.stream().max(Comparator.comparingDouble(AnimalsWithWings::getHeight)).get();
    }

    public static AnimalsWithWings getLightier(List<AnimalsWithWings> listAnimals) {
        AnimalsWithWings animalLightier;
        return animalLightier = listAnimals.stream().min(Comparator.comparingDouble(AnimalsWithWings::getHeight)).get();
    }

    public static AnimalsWithWings getLargestWingSpan(List<AnimalsWithWings> listAnimals){
        AnimalsWithWings animalsWithWings;
        return animalsWithWings = listAnimals.stream().max(Comparator.comparingDouble(AnimalsWithWings::getWingSpan)).get();
    }
}
