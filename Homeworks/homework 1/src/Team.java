/**
 * Команда
 *
 * @author : Хильченко А.Н
 * @project : HomeWork 1
 * @date : 28.11.2021
 * @comments : Класс описания команды. Содержит внутренний класс - Warrior,
 * описывающий члена команды.
 *
 */

import java.util.Arrays;
import java.util.Random;

public class Team {

    enum Results {ON_START, RUNING, IS_WIN, IS_FAILED}
    // это не помешало бы вынести в константы, но
    // тогда это будет единственная константа…

    protected class Warrior {
        private int endurance;
        private Results result;

        public Warrior(int endurance, int power, int health, int duration) {
            // заказной участник
            this.endurance = endurance;
            this.result = Results.ON_START;
        }

        public Warrior() {
            // случайный участник
            Random random = new Random();
            this.endurance = random.nextInt(150); // чтобы некоторые не прошли
            this.result = Results.ON_START;
        }

        // вывод параметров участника
        @Override
        public String toString() {
            return "Выносливость - " + endurance;
        }

        public void setResult(Results result) {
            this.result = result;
        }

        public int getEndurance() {
            return endurance;
        }

        public void decreaseEndurance(int i) {
            System.out.println("вычитаю "+i);
            this.endurance =this.endurance-i;
        }

    }


}
