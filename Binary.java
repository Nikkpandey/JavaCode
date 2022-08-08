
public class Binary {

	public static void main(String[] args) {
		int num= 0b0101011;
        
		System.out.printf("\nIn decimal= %d",num);
		System.out.printf("\nIn octal= %o",num);
		System.out.printf("\nIn Hexadecimal= %x",num);
		System.out.printf("\nIn Binary= %s",Integer.toBinaryString(num));
	}

}
