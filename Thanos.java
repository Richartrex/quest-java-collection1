import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        // name: Black Widow, age: 34
        Hero black = new Hero("Black Widow", 34);
        // name: Captain America, age: 100
        Hero captain = new Hero("Captain America", 100);
        // name: Vision, age: 3
        Hero vision = new Hero("Vision", 3);
        // name: Iron Man, age: 48
        Hero iron = new Hero("Iron Man", 48);
        // name: Scarlet Witch, age: 29
        Hero scarlet = new Hero("Scarlet Witch", 29);
        // name: Thor, age: 1500
        Hero thor = new Hero("Thor", 1500);
        // name: Spider-Man, age: 18
        Hero spider = new Hero("Spider-Man", 18);
        // name: Hulk, age: 49
        Hero hulk = new Hero("Hulk", 49);
        // name: Doctor Strange, age: 42
        Hero doctor = new Hero("Doctor Strange", 42);

        // TODO 2 : Add those heroes to the list
        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(black);
        heroes.add(captain);
        heroes.add(vision);
        heroes.add(iron);
        heroes.add(scarlet);
        heroes.add(thor);
        heroes.add(spider);
        heroes.add(hulk);
        heroes.add(doctor);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        heroes.remove(0);
        heroes.remove(1);
        heroes.remove(2);
        heroes.remove(3);
        heroes.remove(4);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (int i = 0; i < heroes.size(); i++) {
            Hero hero = heroes.get(i);
            System.out.println(hero);
        }
    }
}