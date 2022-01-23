package com.addressbook;

/*
 * UC1 :- Ability to create a Contacts in AddressBook with first and last names, address,city, state, zip, phone number and email...
 * Every UC is in a separate Git Branch and then merged with main
 * Naming Convention, Indentation, etc Code Hygiene will be checked during
 * Review Git Check In Comments and Version History will be monitored
 *
 */ 
import javax.swing.*;
import java.util.ArrayList;

  class contact {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    int phone;
    int zip;


    public contact(String firstName, String lastName, String address, String city, String state, String email, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.zip = zip;
        this.email = email;
    }


    public void print() {
        System.out.println("\nfirstName:" + firstName + "\nlastName:" + lastName + "\naddress:" + address + "\ncity:" + city + "\nphone:" + phone + "\nstate:" + state + "\nzip:" + zip + "\nemail:" + email);
    }

      class Addressbook {
/*
	 * UC2 :- Ability to add a new Contact to Address Book - Use Console to add
	 * person details from AddressBookMain class - Use Object Oriented Concepts to
	 * manage relationship between AddressBook and Contact Person
	 */         public void Addnewcontact() {

            ArrayList<contact> contactlist = new ArrayList<>();

            String firstName1 = JOptionPane.showInputDialog("Enter First name");
            String lastName1 = JOptionPane.showInputDialog("Enter last name");
            String address1 = JOptionPane.showInputDialog("Enter address ");
            String city1 = JOptionPane.showInputDialog("Enter city name");
            String phone1 = JOptionPane.showInputDialog("Enter phone number");
            String state1 = JOptionPane.showInputDialog("Enter state name");
            String zip1 = JOptionPane.showInputDialog("Enter zip code");

            contact contactdata = new contact(firstName1, lastName1, address1, city1, phone1, state1, zip);

            contactlist.add(contactdata);
            contactlist.toArray();
            for (contact person : contactlist) {
                person.print();
            }
        }

* UC3 :- Ability to edit existing contact person using their name - Use Console
	 * to edit person details
	 *
	 * @param name,name1.
	 */   
	            private void Editperson(String firstName, String firstName1) {
            contact[] contactlist = new contact[0];
            for (contact person : contactlist) {
                if (firstName.equals(person.firstName)) {
                    person.firstName = firstName1;
                    person.print();
                }
            }

        }
public class AddressBook {
    public static void main(String[] args) {

        //contact contact2 = new contact("chinni", "tanangi", "SR nagar", "hyderabad", "Telangana");
        //p1.print();

        Addressbook A1 = new Addressbook();
        A1.Addnewcontact();
        A1.EditPerson("chinni", " Nani");
    }
}
private void EditPerson(String chinni, String s){
        }
      }
    }





    

   









