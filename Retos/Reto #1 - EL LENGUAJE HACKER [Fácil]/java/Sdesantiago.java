/*
*	Escribe un programa que reciba un texto y transforme lenguaje natural a
*	"lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
*	se caracteriza por sustituir caracteres alfanuméricos.
*		- Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
*		con el alfabeto y los números en "leet".
*		(Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
*/

import java.util.Scanner;

public class Sdesantiago {
	public static void main (String[] args) {
		String[] alphabet={	"a", "b", "c",
							"d", "e", "f",
							"g", "g", "h",
							"i", "j", "k",
							"l", "m", "n",
							"o", "p", "q",
							"r", "s", "t",
							"u", "v", "w",
							"x", "y", "z",
							"1", "2", "3",
							"4", "5", "6",
							"7", "8", "9",
							"0"};
		String[] leet={		"4", "I3", "[",
							")", "3", "|=",
							"&", "#", "1",
							",_|", ">|", "1",
							"/\\/\\", "^/",
							"0", "|*", "(_,)",
							"I2", "5", "7",
							"(_)", "\\/", "\\/\\/",
							"><", "j", "2",
							"L", "R", "E",
							"A", "S", "b",
							"T", "B", "g",
							"o"};
		Scanner sc = new Scanner(System.in);
		String[] text = sc.next();
		sc.close();
		for (int i=0;text[i]=="\0";i++)
			System.out.print(text[i]);
	}
}