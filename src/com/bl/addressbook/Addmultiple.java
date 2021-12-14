package com.bl.addressbook;

public class Addmultiple {
	public static void addFirstPerson(String firstName, String lastName, String address, String city, String state, String zipcode, String number, String email) {
		ArrayList<String> list = new ArrayList<>();
		list.add(firstName);
		list.add(lastName);
		list.add(address);
		list.add(city);
		list.add(state);
		list.add(zipcode);
		list.add(number);
		list.add(email);
			System.out.println("\nContact got Added of first person.......\n");
			System.out.println(" Address Book of first person : " +list);
			System.out.println("---------------------------------------------------------");
	}
	public static void addSecondPerson(String firstName, String lastName, String address, String city, String state, String zipcode, String number, String email) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first name :");
		String firstName1 = scan.nextLine();
		System.out.print("Enter the last name :");
		String lastName1 = scan.nextLine();
		System.out.print("Enter the address :");
		String address1 = scan.nextLine();
		System.out.print("Enter the city :");
		String city1 = scan.nextLine();
		System.out.print("Enter the state :");
		String state1 = scan.nextLine();
		System.out.print("Enter the Zip code :");
		String zipcode1 = scan.nextLine();
		System.out.print("Enter the contact number :");
		String number1 = scan.nextLine();
		System.out.print("Enter the Email address :");
		String email1 = scan.nextLine();
		ArrayList<String> list = new ArrayList<>();
		list.add(firstName1);
		list.add(lastName1);
		list.add(address1);
		list.add(city1);
		list.add(state1);
		list.add(zipcode1);
		list.add(number1);
		list.add(email1);
			System.out.println("\nContact got Added of second person.......\n");
			System.out.println(" Address Book of second person : " +list);
				}
			
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("|| Enter the Address details ||");
			System.out.println("---------------------------------------------------------");
			System.out.print("Enter the first name :");
			String firstName = sc.nextLine();
			System.out.print("Enter the last name :");
			String lastName = sc.nextLine();
			System.out.print("Enter the address :");
			String address = sc.nextLine();
			System.out.print("Enter the city :");
			String city = sc.nextLine();
			System.out.print("Enter the state :");
			String state = sc.nextLine();
			System.out.print("Enter the Zip code :");
			String zipcode = sc.nextLine();
			System.out.print("Enter the contact number :");
			String number = sc.nextLine();
			System.out.print("Enter the Email address :");
			String email = sc.nextLine();
			addFirstPerson(firstName, lastName, address, city, state, zipcode, number, email);
			addSecondPerson(firstName, lastName, address, city, state, zipcode, number, email);
				}
}
