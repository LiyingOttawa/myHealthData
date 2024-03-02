package assign1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyHealthDataTest2 {

	@Test
	void testCalculateBMI() {
		MyHealthData testData = new MyHealthData("test", "test", "test", 67, 155, 1991, 2013);
		double BMI = testData.calculateBMI(testData.getHeight(), testData.getWeight());
		assertEquals(1.96, BMI,2);
	}
	
	@Test
	void testIncorrectBMI()
	{
		MyHealthData testData = new MyHealthData("test", "test", "test", 67, 155, 1991, 2013);
		double BMI = testData.incorrectBMI(testData.getHeight(), testData.getWeight());
		assertEquals(1.96, BMI,2);
	}

}
