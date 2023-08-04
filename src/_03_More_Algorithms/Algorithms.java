package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for (int i = 0; i < eggs.size(); i++) {
        if(eggs.get(i).equals("cracked")) {
            return i;
        }
        }
return 0;
    }

	public static Object countPearls(List<Boolean> oysters) {
int pearls=0;
for (int i = 0; i < oysters.size(); i++) {
	if (oysters.get(i).equals(true)) {
		pearls++;

	}
	
}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
double tallest=peeps.get(0);
for (double height:peeps) {
	if(height>tallest) {
		tallest=height;
	}
}
return tallest;
}

	public static Object findLongestWord(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			int longest= words.get(i).length();
			if(longest<words.get(i+1).length()) {
				longest=words.get(i+1).length();
				String longer=words.get(i+1);
			}
		}
		return longer;
	}

	
}
