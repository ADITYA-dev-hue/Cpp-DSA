class PrimitiveDT{
	public static void main(String args[]){
		byte byteVar = 100;  // -127 to 128 // 1byte

		short shortVar = 32762;  // -32768 to 32767  // 2byte

		char charVar = 'A'; //2 byte
		
		int intVar = 345; //  -2^31 to (2^31)-1 // 4byte
		
		long longVar = 12333363493l;	// -2^63 TO (2^63)-1 // 8 byte
	
		float floatVar = 34.56f; // 4 byte

		double doubleVar = 34.32332; // 8 byte

		boolean boolVar = false;

		System.out.println("Byte = " + byteVar + "Short = " + shortVar + "Char = " + charVar);
		System.out.println("Int = " + intVar + "long = " + longVar + "Float = " + floatVar + "Double = " + doubleVar + "Bool = " + boolVar);
	}
}