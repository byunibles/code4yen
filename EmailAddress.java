public class EmailAddress {
	public static void main (String[] args) {
		 String FirstName = "yen";
		 String MiddleName = "ngoc";
		 String LastName = "phan";
		 String Birthdate = "11-14-2004";
		 
		 
		 char charZeroFName = FirstName.charAt(0);
		 char charZeroMName = MiddleName.charAt(0);
		 String EmailAddress = LastName  + charZeroFName + charZeroMName;
		 
		 String tempWord = Birthdate.replace("-", "");
		 
		 System.out.println("Email: " + EmailAddress + "@sharkmail.com \n");
		 System.out.println("Temp Password: " + tempWord + "\n");
		 System.out.println("***THIS TEMPORARY PASSWWORD IS VERY INSECURE, PLEASE CHANGE IT IMMEDIATELY***");
		 
		

		
	}

}
