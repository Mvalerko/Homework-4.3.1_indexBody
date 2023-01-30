public class Main {
    public static void main(String[] args) {
        //Объявляем переменную с типом данных класса BonusMilesService и назначаем в качестве нее класс BonusMilesService
        BonusMilesService service = new BonusMilesService();
        // Объявляем переменную, в которую указываем цену билета
        int price = 16_584;
        // Объявляем переменную, значением котрой будет результат работы вызванного метода
        // calculate, который живет в классе BonusMilesService, с указанным в качестве параметра значением переменной price
        int miles = service.calculate(price);
        //Получаем возврат в виде результата работы метода calculate и выводим его вместе с текстом для пользователя
        System.out.println("Благодарим за покупку и рассчитываем Ваш бонус...");
        System.out.println("Итоговое количство бонусных миль: " + miles + " миль(я)");
    }
}