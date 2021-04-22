package fr.wildcodeschool.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        List<Hero> heroes = new ArrayList<Hero>();
        // TODO 2 : Add those heroes to the list
        heroes.add(new Hero("Black Widow",34));
        heroes.add(new Hero("Captain America",100));
        heroes.add(new Hero("Vision",3));
        heroes.add(new Hero("Iron Man",48));
        heroes.add(new Hero("Scarlet Witch",29));
        heroes.add(new Hero("Thor",1500));
        heroes.add(new Hero("Hulk",49));
        heroes.add(new Hero("Doctor Strange",42));
        // TODO 3 : It's Thor birthday, now he's 1501
        Hero thor = heroes.get(5);
        thor.setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        // TODO 5 : Keep only the half of the list
        List<Hero> halfHeroes = heroes.subList(heroes.size()/2,heroes.size());
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : halfHeroes) {
            System.out.println("HERO nom : "+hero.getName()+" age : "+hero.getAge());
        }
    }
}
