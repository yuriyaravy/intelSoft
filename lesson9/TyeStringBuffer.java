package by.home.lesson9;

public class TyeStringBuffer {

	public static void main(String[] args) {

		String text = "мама мыла раму";
		StringBuffer tx1 = new StringBuffer(text);
		StringBuffer tx = new StringBuffer(text);
		System.out.println(tx.length());
		System.out.println(tx.charAt(3));
		tx.setCharAt(3, 'r');
		System.out.println(tx);
		tx.insert(3, "ghbdtn");
		System.out.println(tx);
		System.out.println(tx.delete(4, 7));
		System.out.println(tx.deleteCharAt(3));
		tx.append(tx1);
		System.out.println(tx.reverse());
		tx.replace(3,5,"dfhg");
		System.out.println(tx);
		System.out.println(tx.substring(4, 7));
	}

}
