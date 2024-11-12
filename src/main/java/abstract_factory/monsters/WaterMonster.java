package abstract_factory.monsters;

import abstract_factory.model.MonsterModel;
import abstract_factory.monsters.interfaces.Monster;

public class WaterMonster implements Monster {

    private MonsterModel monsterModel;

    public WaterMonster(MonsterModel monsterModel) {
        this.monsterModel = monsterModel;
    }

    @Override
    public String attack() {
        return monsterModel.getName() +
                " is attacking with water cannon " +
                monsterModel.getAttackValue() +
                " of power";
    }

    @Override
    public String defense() {
        return monsterModel.getName() +
                " is defensing with water bubbles " +
                monsterModel.getDefenseValue() +
                " of power";
    }
}
