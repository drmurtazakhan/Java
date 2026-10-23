/**
 * COS450 - Computer Security
 * Zeina Kassis, 309
 * This program applies the Vigenere Cipher.
 *
 */
import java.util.Scanner;
import java.lang.*;

public class Vigenere {


	//Initializing the alphabet array, the code of each character is the index of the element
   private final static char[] CHARS = {
    'a', 'b', 'c', 'd', 'e', 'f', 'g',
    'h', 'i', 'j', 'k', 'l', 'm', 'n',
    'o', 'p', 'q', 'r', 's', 't', 'u',
    'v', 'w', 'x', 'y', 'z'};


    public static void main(String[] args) {
        //Display welcome message.
        System.out.println("Welcome to Vigenere Cipher encoder and decoder.\n"
        					+ "Enter the number for your desired choice: \n"
        					+ "1. Encryption.\n"
        					+ "2. Decryption.\n"
        					+ "3. Exit.");



		int flag = 0;

		while (flag == 0)
		{
			Scanner scanner = new Scanner(System.in);

			System.out.print("\n\nPlease enter your choice here:\t");
			String read = scanner.nextLine();
			int choice = Integer.parseInt(read);

			if (choice == 1)
			{
				encryption();
			}
			else if (choice == 2)
			{
				decryption();
			}
			else if (choice == 3)
			{
				flag = 1;
				System.out.println("Thank you");
			}
			else
				System.out.println("Please enter a correct value.\n");
			}

    	}



	//Encryption method
    public static void encryption()
    {
    	Scanner scanner = new Scanner(System.in);

		System.out.print("\nPlease enter the desired key:\t");

		//Getting the key
 		String key = scanner.nextLine().toLowerCase();

		//getting the length of the key
		int m = key.length();


		System.out.print("Please enter your plain text:\t");

		//Getting the plain text.
 		String text = scanner.nextLine().toLowerCase();

		//Remove spaces if any
 		text = text.replaceAll(" ", "");


		//Getting the codes of the key letter anf saving them into an array.
 		int keyCode[] = new int[m];
 		for (int i=0; i<m; i++)
 		{
 			char a = key.charAt(i);

 			for (int j=0; j<26; j++)
 			{
 				if( a == CHARS[j])
 				{
 					keyCode[i] = j;
 					break;
 				}
 			}
 		}

	//encrytion using the vigenere cipher encryption formula
		int count = text.length();
		for(int i=0; i<count; i++)
		{
			for(int j=0; j<26; j++)
			{
				if( text.charAt(i)== CHARS[j])
				{
					char a = CHARS[(j+keyCode[i % m ]) % 26];
					System.out.print(Character.toUpperCase(a));
					break;
				}
			}
		}
    }


    public static void decryption()
    {
    	Scanner scanner = new Scanner(System.in);

		System.out.print("\nPlease enter the desired key:\t");

		//Getting the key
 		String key = scanner.nextLine().toLowerCase();

		//Getting the key length
		int m = key.length();


		System.out.print("Please enter your ciphered text:\t");

		//Getting the ciphered text
 		String text = scanner.nextLine().toLowerCase();

		//Removing the space if any.
 		text = text.replaceAll(" ", "");


		//Getting the codes of the key letter anf saving them into an array.
 		int keyCode[] = new int[m];
 		for (int i=0; i<m; i++)
 		{
 			char a = key.charAt(i);

 			for (int j=0; j<26; j++)
 			{
 				if( a == CHARS[j])
 				{
 					keyCode[i] = j;
 					break;
 				}
 			}
 		}



		//decrytion using the vigenere cipher decryption formula

		int count = text.length();
		for(int i=0; i<count; i++)
		{
			for(int j=0; j<26; j++)
			{
				if( text.charAt(i)== CHARS[j])
				{
					char a;
					int value;

					value = j - keyCode[i%m ];
						if (value<0)
						{
							a = CHARS[(value + 26) % 26];
						}
						else
						{
							a = CHARS[value % 26];
						}

					System.out.print(a);
					break;
				}
			}
		}
    }

}
