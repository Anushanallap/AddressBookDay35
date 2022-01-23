package com.java.addressbook;

/*
 * UC1 :- Ability to create a Contacts in AddressBook with first and last names, address,city, state, zip, phone number and email...
 * Every UC is in a separate Git Branch and then merged with main
 * Naming Convention, Indentation, etc Code Hygiene will be checked during
 * Review Git Check In Comments and Version History will be monitored
 *
 */ 
public class AddressBook {

        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        String email;
        int phone;
        int zip;


        public AddressBook(String firstName, String lastName, String address, String city, String state, String email, int zip) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.phone = phone;
            this.zip = zip;
            this.email= email;
        }

        public void print() {
            System.out.println("\nfirstName:" + firstName + "\nlastName:" + lastName + "\naddress:" + address + "\ncity:" + city + "\nphone:" + phone + "\nstate:" + state + "\nzip:" + zip+ "\nemail:" +email);
        }

/*
	 * UC2 :- Ability to add a new Contact to Address Book - Use Console to add
	 * person details from AddressBookMain class - Use Object Oriented Concepts to
	 * manage relationship between AddressBook and Contact Person
	 */ 
        class AddressBook2<newcontact> {

            public AddressBook2(String firstName2, String lastName2, String address2, String city2, String state2, int zip2, int phone2) {
            }
            public void print() {
                System.out.println("\nfirstName2:" + firstName + "\nlastName2:" + lastName + "\naddress2:" + address + "\ncity2:" + city + "\nphone2:" + phone + "\nstate2:" + state + "\nzip2:" + zip+ "\nemail2:" +email);
            }
        }

    }
    class person {
        public static <addressbook> void main(String[] args) {
            AddressBook contact1 = new AddressBook("Anusha", "nallapu", "Rotary nagar", "Khammam", "Telangana",
                    "abc@gmail.com", 507001 );
            AddressBook contact2 = new AddressBook("chinni", "tanangi", "SR nagar", "hyderabad", "Telangana",
                    "xyz@gmail.com", 507002 );

           // contact1.print();
            contact2.print();
        }

    }









