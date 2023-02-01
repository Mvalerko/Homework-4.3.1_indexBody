public class Main {
    public static void main(String[] args) {
        //Объявляем переменную с типом данных класса BodyMassIndex и назначаем в качестве нее класс BodyMassIndex
        BodyMassIndex service = new BodyMassIndex();
        // Объявляем переменные, в которых указываем вес и рост человека
        float weight = 48.0f;
        float height = 165.0f;

        // Объявляем переменную, значением котрой будет результат работы вызванного метода
        // calculate, который живет в классе BodyMassIndex, с указанным в качестве параметров значение переменных
        // weight & height
        float index = service.calculate(weight, height);
        //Получаем возврат в виде результата работы метода calculate и выводим его вместе с текстом для пользователя

        System.out.println("Ваш индекс массы тела: " + index);
    }
}