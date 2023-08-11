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
	
	//

	public static Object findLongestWord(List<String> words) {
		String longer="";
		int longest = 0;
		for (int i = 0; i < words.size(); i++) {
			if(longest<words.get(i).length()) {
				longest=words.get(i).length();
				longer=words.get(i);
			}
			System.out.println(longest);
		}
		return longer;
	}

	public static Object containsSOS(List<String>message) {
	for (int i = 0; i < message.size(); i++) {
		if(message.get(i).contains("... --- ...")) {
			return true;
		}
	}
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			 
		}
		return null;
	}

	
}
