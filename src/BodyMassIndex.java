public class BodyMassIndex {

    // указываем параметры которые будут получен из переменных weight & height класса Main
    public float calculate (float a, float b) {

        // Рассчитываем индекс массы тела, используя
        // значения заведённых переменных
        float result;
        float mHeight = b / 100;
        //System.out.println("mHeihht " + mHeight);
        result = a / (mHeight * mHeight);
        return result;
        //System.out.println(result);
    }
}