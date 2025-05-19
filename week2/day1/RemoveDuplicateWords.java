package week2.day1;

public class RemoveDuplicateWords 
{

	public static void main(String[] args)
	{
		String text = "We learn Java basics as part of java sessions in java week1";
        int count = 0;

        
        String[] words = text.split(" ");

       
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
                    words[j] = ""; // remove duplicate
                    count++;
                }
            }
        }

        // Print result using a normal for loop (not for-each)
        if (count > 0) {
            System.out.println("Modified words: ");
            for (int i = 0; i < words.length; i++) {
                
                    System.out.print(words[i] + " ");
                
            }
        } else {
            System.out.println("No duplicate words found.");
        }
    }
	
}


