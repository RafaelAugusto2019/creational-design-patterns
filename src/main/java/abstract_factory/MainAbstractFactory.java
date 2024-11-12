package abstract_factory;

import abstract_factory.model.MonsterModel;
import abstract_factory.monsters.FireMonster;
import abstract_factory.monsters.WaterMonster;
import abstract_factory.monsters.interfaces.Monster;

public class MainAbstractFactory {

    public static void main(String [] args){

        MonsterModel waterMonsterModel = new MonsterModel();
        waterMonsterModel.setName("Water Monster");
        waterMonsterModel.setAttackValue(10);
        waterMonsterModel.setDefenseValue(30);

        Monster waterMonster = new WaterMonster(waterMonsterModel);

        MonsterModel fireMonsterModel = new MonsterModel();
        fireMonsterModel.setName("Fire Monster");
        fireMonsterModel.setAttackValue(50);
        fireMonsterModel.setDefenseValue(20);

        Monster fireMonster = new FireMonster(fireMonsterModel);


        System.out.println(waterMonster.attack());
        System.out.println(fireMonster.defense());

        System.out.println("---------------------------------");

        System.out.println(fireMonster.attack());
        System.out.println(waterMonster.defense());

    }

}
