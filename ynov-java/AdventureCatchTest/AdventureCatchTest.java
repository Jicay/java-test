import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Fail.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import org.junit.jupiter.api.Test;

class AdventureExceptionTest {

    @Test
    void class_shouldBePublic() {
        assertThat(Character.class)
                .withFailMessage("Character should be public")
                .isPublic();
        assertThat(Character.class)
                .withFailMessage("Character should be abstract")
                .isAbstract();
    }

    @Test
    void class_shouldHaveFullParameterConstructor() {
        try {
            Constructor<Character> constructor = Character.class.getDeclaredConstructor(String.class, int.class, Weapon.class);
            assertThat(Modifier.isPublic(constructor.getModifiers()))
                    .withFailMessage("Full parameters constructor should be public")
                    .isTrue();
        } catch (NoSuchMethodException e) {
            fail("Character should have a String, int and Weapon parameters constructor");
        }
    }

    @Test
    void class_shouldHaveCorrectProperties() {
        try {
            Field field = Character.class.getDeclaredField("name");
            assertThat(Modifier.isPrivate(field.getModifiers()))
                    .withFailMessage("name property should be private")
                    .isTrue();
            assertThat(Modifier.isFinal(field.getModifiers()))
                    .withFailMessage("name property should be final")
                    .isTrue();
            assertThat(field.getType())
                    .withFailMessage("name property should be a String, but was %s", field.getType())
                    .isEqualTo(String.class);
        } catch (NoSuchFieldException e) {
            fail("Character should have a name property");
        }
        try {
            Field field = Character.class.getDeclaredField("currentHealth");
            assertThat(Modifier.isProtected(field.getModifiers()))
                    .withFailMessage("currentHealth property should be protected")
                    .isTrue();
            assertThat(Modifier.isFinal(field.getModifiers()))
                    .withFailMessage("currentHealth property should not be final")
                    .isFalse();
            assertThat(field.getType())
                    .withFailMessage("currentHealth property should be a int, but was %s", field.getType())
                    .isEqualTo(int.class);
        } catch (NoSuchFieldException e) {
            fail("Character should have a currentHealth property");
        }
        try {
            Field field = Character.class.getDeclaredField("maxHealth");
            assertThat(Modifier.isPrivate(field.getModifiers()))
                    .withFailMessage("maxHealth property should be private")
                    .isTrue();
            assertThat(Modifier.isFinal(field.getModifiers()))
                    .withFailMessage("maxHealth property should be final")
                    .isTrue();
            assertThat(field.getType())
                    .withFailMessage("maxHealth property should be a int, but was %s", field.getType())
                    .isEqualTo(int.class);
        } catch (NoSuchFieldException e) {
            fail("Character should have a maxHealth property");
        }
        try {
            Field field = Character.class.getDeclaredField("allCharacters");
            assertThat(Modifier.isPrivate(field.getModifiers()))
                    .withFailMessage("allCharacters property should be private")
                    .isTrue();
            assertThat(Modifier.isFinal(field.getModifiers()))
                    .withFailMessage("allCharacters property should not be final")
                    .isFalse();
            assertThat(Modifier.isStatic(field.getModifiers()))
                    .withFailMessage("allCharacters property should be static")
                    .isTrue();
            assertThat(field.getType())
                    .withFailMessage("allCharacters property should be a List, but was %s", field.getType())
                    .isEqualTo(List.class);
        } catch (NoSuchFieldException e) {
            fail("Character should have a allCharacters property");
        }
        try {
            Field field = Character.class.getDeclaredField("weapon");
            assertThat(Modifier.isPrivate(field.getModifiers()))
                    .withFailMessage("weapon property should be private")
                    .isTrue();
            assertThat(Modifier.isStatic(field.getModifiers()))
                    .withFailMessage("weapon property should not be static")
                    .isFalse();
            assertThat(field.getType())
                    .withFailMessage("weapon property should be a Weapon, but was %s", field.getType())
                    .isEqualTo(Weapon.class);
        } catch (NoSuchFieldException e) {
            fail("Character should have a weapon property");
        }
    }

    @Test
    void class_shouldHaveGetters() {
        try {
            Method getter = Character.class.getDeclaredMethod("getName");
            assertThat(Modifier.isPublic(getter.getModifiers()))
                    .withFailMessage("getName method should be public")
                    .isTrue();
            assertThat(getter.getReturnType())
                    .withFailMessage("getName method should return String")
                    .isEqualTo(String.class);
        } catch (NoSuchMethodException e) {
            fail("Character should have getName method");
        }
        try {
            Method getter = Character.class.getDeclaredMethod("getCurrentHealth");
            assertThat(Modifier.isPublic(getter.getModifiers()))
                    .withFailMessage("getCurrentHealth method should be public")
                    .isTrue();
            assertThat(getter.getReturnType())
                    .withFailMessage("getCurrentHealth method should return int")
                    .isEqualTo(int.class);
        } catch (NoSuchMethodException e) {
            fail("Character should have getCurrentHealth method");
        }
        try {
            Method getter = Character.class.getDeclaredMethod("getMaxHealth");
            assertThat(Modifier.isPublic(getter.getModifiers()))
                    .withFailMessage("getMaxHealth method should be public")
                    .isTrue();
            assertThat(getter.getReturnType())
                    .withFailMessage("getMaxHealth method should return int")
                    .isEqualTo(int.class);
        } catch (NoSuchMethodException e) {
            fail("Character should have getMaxHealth method");
        }
        try {
            Method getter = Character.class.getDeclaredMethod("getWeapon");
            assertThat(Modifier.isPublic(getter.getModifiers()))
                    .withFailMessage("getWeapon method should be public")
                    .isTrue();
            assertThat(getter.getReturnType())
                    .withFailMessage("getWeapon method should return Weapon")
                    .isEqualTo(Weapon.class);
        } catch (NoSuchMethodException e) {
            fail("Character should have getWeapon method");
        }
    }

    @Test
    void class_shouldHaveAttackMethod() {
        try {
            Method getter = Character.class.getDeclaredMethod("attack", Character.class);
            assertThat(Modifier.isPublic(getter.getModifiers()))
                    .withFailMessage("attack method should be public")
                    .isTrue();
            assertThat(Modifier.isAbstract(getter.getModifiers()))
                    .withFailMessage("attack method should be abstract")
                    .isTrue();
            assertThat(getter.getReturnType())
                    .withFailMessage("attack method should return nothing")
                    .isEqualTo(void.class);
        } catch (NoSuchMethodException e) {
            fail("Character should have attack method");
        }
        try {
            Method getter = Character.class.getDeclaredMethod("takeDamage", int.class);
            assertThat(Modifier.isPublic(getter.getModifiers()))
                    .withFailMessage("takeDamage method should be public")
                    .isTrue();
            assertThat(Modifier.isAbstract(getter.getModifiers()))
                    .withFailMessage("takeDamage method should be abstract")
                    .isTrue();
            assertThat(getter.getReturnType())
                    .withFailMessage("takeDamage method should return nothing")
                    .isEqualTo(void.class);
        } catch (NoSuchMethodException e) {
            fail("Character should have takeDamage method");
        }
    }

    @Test
    void class_shouldHaveStaticMethod() {
        try {
            Method printStatus = Character.class.getDeclaredMethod("printStatus");
            assertThat(Modifier.isPublic(printStatus.getModifiers()))
                    .withFailMessage("printStatus method should be public")
                    .isTrue();
            assertThat(Modifier.isStatic(printStatus.getModifiers()))
                    .withFailMessage("printStatus method should be static")
                    .isTrue();
            assertThat(printStatus.getReturnType())
                    .withFailMessage("printStatus method should return nothing")
                    .isEqualTo(String.class);
        } catch (NoSuchMethodException e) {
            fail("Character should have printStatus method");
        }
        try {
            Method fight = Character.class.getDeclaredMethod("fight", Character.class, Character.class);
            assertThat(Modifier.isPublic(fight.getModifiers()))
                    .withFailMessage("fight method should be public")
                    .isTrue();
            assertThat(Modifier.isStatic(fight.getModifiers()))
                    .withFailMessage("fight method should be public")
                    .isTrue();
            assertThat(fight.getReturnType())
                    .withFailMessage("fight method should return Character")
                    .isEqualTo(Character.class);
        } catch (NoSuchMethodException e) {
            fail("Character should have fight method");
        }
    }

    @Test
    void classMonster_shouldBePublic() {
        assertThat(Monster.class)
                .withFailMessage("Monster should be public")
                .isPublic();
        assertThat(Monster.class.getSuperclass())
                .withFailMessage("Monster should inherit Character")
                .isEqualTo(Character.class);
    }

    @Test
    void classMonster_shouldHaveFullParameterConstructor() {
        try {
            Constructor<Monster> constructor = Monster.class.getDeclaredConstructor(String.class, int.class, Weapon.class);
            assertThat(Modifier.isPublic(constructor.getModifiers()))
                    .withFailMessage("Full parameters constructor should be public")
                    .isTrue();
        } catch (NoSuchMethodException e) {
            fail("Monster should have a String, int and Weapon parameters constructor");
        }
    }

    @Test
    void interfaceHealer_shouldBePublic() {
        assertThat(Healer.class)
                .withFailMessage("Healer should be public")
                .isPublic();
        assertThat(Healer.class)
                .withFailMessage("Healer should be an interface")
                .isInterface();
    }

    @Test
    void interfaceHealer_shouldHaveMethods() {
        try {
            Method getHealCapacity = Healer.class.getDeclaredMethod("getHealCapacity");
            assertThat(Modifier.isPublic(getHealCapacity.getModifiers()))
                    .withFailMessage("getHealCapacity method should be public")
                    .isTrue();
            assertThat(getHealCapacity.getReturnType())
                    .withFailMessage("getHealCapacity method should return int")
                    .isEqualTo(int.class);
        } catch (NoSuchMethodException e) {
            fail("Healer should have a getHealCapacity method");
        }
        try {
            Method heal = Healer.class.getDeclaredMethod("heal", Character.class);
            assertThat(Modifier.isPublic(heal.getModifiers()))
                    .withFailMessage("heal method should be public")
                    .isTrue();
            assertThat(heal.getReturnType())
                    .withFailMessage("heal method should return nothing")
                    .isEqualTo(void.class);
        } catch (NoSuchMethodException e) {
            fail("Healer should have a getHealCapacity method");
        }
    }

    @Test
    void interfaceTank_shouldBePublic() {
        assertThat(Tank.class)
                .withFailMessage("Tank should be public")
                .isPublic();
        assertThat(Tank.class)
                .withFailMessage("Tank should be an interface")
                .isInterface();
    }

    @Test
    void interfaceTank_shouldHaveMethods() {
        try {
            Method getShield = Tank.class.getDeclaredMethod("getShield");
            assertThat(Modifier.isPublic(getShield.getModifiers()))
                    .withFailMessage("getShield method should be public")
                    .isTrue();
            assertThat(getShield.getReturnType())
                    .withFailMessage("getShield method should return int")
                    .isEqualTo(int.class);
        } catch (NoSuchMethodException e) {
            fail("Tank should have a getHealCapacity method");
        }
    }

    @Test
    void classSorcerer_shouldBePublic() {
        assertThat(Sorcerer.class)
                .withFailMessage("Sorcerer should be public")
                .isPublic();
        assertThat(Sorcerer.class.getSuperclass())
                .withFailMessage("Sorcerer should inherit Character")
                .isEqualTo(Character.class);
        assertThat(Sorcerer.class.getInterfaces())
                .withFailMessage("Sorcerer should implements Healer")
                .containsExactly(Healer.class);
    }

    @Test
    void classSorcerer_shouldHaveConstructor() {
        try {
            Constructor<Sorcerer> constructor = Sorcerer.class.getConstructor(String.class, int.class, int.class, Weapon.class);
            assertThat(Modifier.isPublic(constructor.getModifiers()))
                    .withFailMessage("Full parameters constructor should be public")
                    .isTrue();
        } catch (NoSuchMethodException e) {
            fail("Sorcerer should have a String, int, int and Weapon parameters constructor");
        }
    }

    @Test
    void classSorcerer_shouldHaveCorrectProperties() {
        try {
            Field field = Sorcerer.class.getDeclaredField("healCapacity");
            assertThat(Modifier.isPrivate(field.getModifiers()))
                    .withFailMessage("healCapacity property should be private")
                    .isTrue();
            assertThat(Modifier.isFinal(field.getModifiers()))
                    .withFailMessage("healCapacity property should be final")
                    .isTrue();
            assertThat(field.getType())
                    .withFailMessage("healCapacity property should be a int, but was %s", field.getType())
                    .isEqualTo(int.class);
        } catch (NoSuchFieldException e) {
            fail("Sorcerer should have a healCapacity property");
        }
    }

    @Test
    void classTemplar_shouldBePublic() {
        assertThat(Templar.class)
                .withFailMessage("Templar should be public")
                .isPublic();
        assertThat(Templar.class.getSuperclass())
                .withFailMessage("Templar should inherit Character")
                .isEqualTo(Character.class);
        assertThat(Templar.class.getInterfaces())
                .withFailMessage("Templar should implements Healer and Tank")
                .containsExactlyInAnyOrder(Healer.class, Tank.class);
    }

    @Test
    void classTemplar_shouldHaveConstructor() {
        try {
            Constructor<Templar> constructor = Templar.class.getConstructor(String.class, int.class, int.class, int.class, Weapon.class);
            assertThat(Modifier.isPublic(constructor.getModifiers()))
                    .withFailMessage("Full parameters constructor should be public")
                    .isTrue();
        } catch (NoSuchMethodException e) {
            fail("Templar should have a String, int, int, int and Weapon parameters constructor");
        }
    }

    @Test
    void classTemplar_shouldHaveCorrectProperties() {
        try {
            Field field = Templar.class.getDeclaredField("healCapacity");
            assertThat(Modifier.isPrivate(field.getModifiers()))
                    .withFailMessage("healCapacity property should be private")
                    .isTrue();
            assertThat(Modifier.isFinal(field.getModifiers()))
                    .withFailMessage("healCapacity property should be final")
                    .isTrue();
            assertThat(field.getType())
                    .withFailMessage("healCapacity property should be a int, but was %s", field.getType())
                    .isEqualTo(int.class);
        } catch (NoSuchFieldException e) {
            fail("Templar should have a healCapacity property");
        }
        try {
            Field field = Templar.class.getDeclaredField("shield");
            assertThat(Modifier.isPrivate(field.getModifiers()))
                    .withFailMessage("shield property should be private")
                    .isTrue();
            assertThat(Modifier.isFinal(field.getModifiers()))
                    .withFailMessage("shield property should be final")
                    .isTrue();
            assertThat(field.getType())
                    .withFailMessage("shield property should be a int, but was %s", field.getType())
                    .isEqualTo(int.class);
        } catch (NoSuchFieldException e) {
            fail("Templar should have a shield property");
        }
    }

    @Test
    void classWeapon_shouldBePublic() {
        assertThat(Weapon.class)
                .withFailMessage("Weapon should be public")
                .isPublic();
    }

    @Test
    void classWeapon_shouldHaveConstructor() {
        try {
            Constructor<Weapon> constructor = Weapon.class.getConstructor(String.class, int.class);
            assertThat(Modifier.isPublic(constructor.getModifiers()))
                    .withFailMessage("Full parameters constructor should be public")
                    .isTrue();
        } catch (NoSuchMethodException e) {
            fail("Weapon should have a String and int parameters constructor");
        }
    }

    @Test
    void classWeapon_shouldHaveCorrectProperties() {
        try {
            Field field = Weapon.class.getDeclaredField("name");
            assertThat(Modifier.isPrivate(field.getModifiers()))
                    .withFailMessage("name property should be private")
                    .isTrue();
            assertThat(Modifier.isFinal(field.getModifiers()))
                    .withFailMessage("name property should be final")
                    .isTrue();
            assertThat(field.getType())
                    .withFailMessage("name property should be a String, but was %s", field.getType())
                    .isEqualTo(String.class);
        } catch (NoSuchFieldException e) {
            fail("Weapon should have a name property");
        }
        try {
            Field field = Weapon.class.getDeclaredField("damage");
            assertThat(Modifier.isPrivate(field.getModifiers()))
                    .withFailMessage("damage property should be private")
                    .isTrue();
            assertThat(Modifier.isFinal(field.getModifiers()))
                    .withFailMessage("damage property should be final")
                    .isTrue();
            assertThat(field.getType())
                    .withFailMessage("damage property should be a int, but was %s", field.getType())
                    .isEqualTo(int.class);
        } catch (NoSuchFieldException e) {
            fail("Weapon should have a damage property");
        }
    }

    @Test
    void classWeapon_shouldHaveGetters() {
        try {
            Method getter = Weapon.class.getDeclaredMethod("getName");
            assertThat(Modifier.isPublic(getter.getModifiers()))
                    .withFailMessage("getName method should be public")
                    .isTrue();
            assertThat(getter.getReturnType())
                    .withFailMessage("getName method should return String")
                    .isEqualTo(String.class);
        } catch (NoSuchMethodException e) {
            fail("Weapon should have getName method");
        }
        try {
            Method getter = Weapon.class.getDeclaredMethod("getDamage");
            assertThat(Modifier.isPublic(getter.getModifiers()))
                    .withFailMessage("getDamage method should be public")
                    .isTrue();
            assertThat(getter.getReturnType())
                    .withFailMessage("getDamage method should return int")
                    .isEqualTo(int.class);
        } catch (NoSuchMethodException e) {
            fail("Weapon should have getDamage method");
        }
    }

    @Test
    void classException_shouldBePublic() {
        assertThat(DeadCharacterException.class)
                .withFailMessage("DeadCharacterException should be public")
                .isPublic();
        assertThat(DeadCharacterException.class.getSuperclass())
                .withFailMessage("DeadCharacterException should inherit Exception")
                .isEqualTo(Exception.class);
    }

    @Test
    void classException_shouldHaveConstructor() {
        try {
            Constructor<DeadCharacterException> constructor = DeadCharacterException.class.getConstructor(Character.class);
            assertThat(Modifier.isPublic(constructor.getModifiers()))
                    .withFailMessage("Full parameters constructor should be public")
                    .isTrue();
        } catch (NoSuchMethodException e) {
            fail("DeadCharacterException should have a Character parameter constructor");
        }
    }

    @Test
    void objectException_monster() {
        try {
            Method getMessage = DeadCharacterException.class.getDeclaredMethod("getMessage");

            Constructor<Monster> constructorMonster = Monster.class.getConstructor(String.class, int.class, Weapon.class);
            Constructor<DeadCharacterException> constructor = DeadCharacterException.class.getConstructor(Character.class);

            Monster troll = constructorMonster.newInstance("Troll", 20, null);
            DeadCharacterException exception = constructor.newInstance(troll);

            assertThat(getMessage.invoke(exception)).isEqualTo("The monster Troll is dead.");

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            fail("Monster is not correctly defined", e);
        }
    }

    @Test
    void objectSorcerer_attackAndTakeDamage() {
        try {
            Method getMessage = DeadCharacterException.class.getDeclaredMethod("getMessage");

            Constructor<Sorcerer> constructorSorcerer = Sorcerer.class.getConstructor(String.class, int.class, int.class, Weapon.class);
            Constructor<DeadCharacterException> constructor = DeadCharacterException.class.getConstructor(Character.class);

            Sorcerer saroumane = constructorSorcerer.newInstance("Saroumane", 20, 4, null);
            DeadCharacterException exception = constructor.newInstance(saroumane);

            assertThat(getMessage.invoke(exception)).isEqualTo("The sorcerer Saroumane is dead.");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            fail("Sorcerer is not correctly defined", e);
        }
    }

    @Test
    void objectTemplar_attackAndTakeDamage() {
        try {
            Method getMessage = DeadCharacterException.class.getDeclaredMethod("getMessage");

            Constructor<Templar> constructorTemplar = Templar.class.getConstructor(String.class, int.class, int.class, int.class, Weapon.class);
            Constructor<DeadCharacterException> constructor = DeadCharacterException.class.getConstructor(Character.class);

            Templar lancelot = constructorTemplar.newInstance("Lacelot", 20, 4, 2, null);
            DeadCharacterException exception = constructor.newInstance(lancelot);

            assertThat(getMessage.invoke(exception)).isEqualTo("The templar Lacelot is dead.");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            fail("Templar is not correctly defined", e);
        }
    }
}