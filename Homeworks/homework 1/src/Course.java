/**
 * Полоса препятсвий
 *
 * @author : Хильченко А.Н
 * @project : HomeWork 1
 * @date : 28.11.2021
 * @comments : Класс описания полосы препяствий. Содержит внутренний класс
 * Trail, описывающий препятствие. А также пересление, описываюшие состояние
 * прохождения препятвия.
 *
 */


public class Course {

    public class Trial {
        private int endurance;

        // два конструктора для решения поставленных перед классом задач
        public Trial() {
            // конструктор случайного препятсвия,
            // со значениями кондиций от 0 -до 20
            Random random = new Random();
            this.endurance = random.nextInt(21);
        }

        public Trial(int endurance) {
            // конструктор «заказного» в плане сложности препятсвия
            this.endurance = endurance;
        }

        // геттер - для того, чтобы потом получать значения при прохождении
        public int getEndurance() {
            return endurance;
        }

        // вывод в строку - для теста создания, ну и так: пригодится…
        @Override
        public String toString() {
            return "Испытание {" + endurance +"}";
        }
    }


}
