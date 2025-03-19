package hexlet.code;

public class Utils {

    public static int generateRandomNumber(int maxNum) {
        return (int) (Math.random() * maxNum);
    }

    public static int generateRandomNumber(int minNum, int maxNum) {
        return (int) (Math.random() * maxNum + minNum);
    }
}
