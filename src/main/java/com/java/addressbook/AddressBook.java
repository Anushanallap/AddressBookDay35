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
        int phone;
        int zip;
        String email;


        public AddressBook(String firstName, String lastName, String address, String city, String state, int zip, int phone) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.phone = phone;
            this.zip = zip;
        }

        public void print() {
            System.out.println("\nfirstName:" + firstName + "\nlastName:" + lastName + "\naddress:" + address + "\ncity:" + city + "\nphone:" + phone + "\nstate:" + state + "\nzip:" + zip);
        }

    }
    class person {
        public static <addressbook> void main(String[] args) {
            AddressBook contact1 = new AddressBook("Anusha", "nallapu", "Rotary nagar", "Khammam", "Telangana",
                    507001, 965281431);
            contact1.print();
        }
    }









