package mockboot;

import java.util.Random;

public class RandomGenerator {

	protected String getRandomString(int length) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < length) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	protected Integer getRandomInteger(int max) {
		Random random = new Random();
		int value = random.nextInt(max);
		return value;
	}
}
