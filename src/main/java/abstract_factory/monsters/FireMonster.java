package abstract_factory.monsters;

import abstract_factory.model.MonsterModel;
import abstract_factory.monsters.interfaces.Monster;

import java.util.Random;

public class FireMonster implements Monster {

    private MonsterModel monsterModel;

    public FireMonster(MonsterModel monsterModel) {
        this.monsterModel = monsterModel;

        Random defenseIncrease = new Random();
        monsterModel.setDefenseValue(
                monsterModel.getDefenseValue() + defenseIncrease.nextInt(5));
    }

    @Override
    public String attack() {
        return monsterModel.getName() +
                " is attacking with fire " +
                monsterModel.getAttackValue() +
                " of power";
    }

    @Override
    public String defense() {
        return monsterModel.getName() +
                " is defensing with fire barrier " +
                monsterModel.getDefenseValue() +
                " of power";
    }
}
