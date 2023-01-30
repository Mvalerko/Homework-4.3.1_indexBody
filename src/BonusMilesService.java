public class BonusMilesService {

    // указываем параметр cost, который будет получен из переменной price класса Main
    public int calculate (int cost) {
        // Объявляем переменную в которой указываем за какое количество рублей в чеке будет подарена одна бонусная
        // миля
        int conditionForOoneMmile = 20;
        // Рассчитываем количество бонусных миль, используя
        // значения заведённых переменных.
        int bonus;
        bonus = cost / conditionForOoneMmile;
        return bonus;
    }
}
