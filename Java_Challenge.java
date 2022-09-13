package week2.day2;

public class Java_Challenge {

	public static void main(String[] args) {

		String str1 = "Hello World";
		String[] split1 = str1.split(" ");
		String Str1=split1[split1.length-1];

		String str2="   fly me   to   the moon  ";
		String[] split2 = str2.split("\\s+");
		String Str2=split2[split2.length-1];


		String str3= "luffy is still joyboy";
		String[] split3 = str3.split(" ");
		String Str3=split3[split3.length-1];


		System.out.println("The last word is " +Str1 + " with length " +Str1.length());
		System.out.println("The last word is " +Str2 + " with length " +Str2.length());
		System.out.println("The last word is " +Str3 + " with length " +Str3.length());

	}

}
