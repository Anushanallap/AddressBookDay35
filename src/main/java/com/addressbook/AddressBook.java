package com.addressbook;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/*UC1 create contact in addressbook*/
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
        /*UC2 ability to add new contact to addressbook*/
        public void Addnewcontact() {

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

        /*UC3 ability to edit contact person using name*/
        private void Editperson(String firstName, String firstName1) {
            contact[] contactlist = new contact[0];
            for (contact person : contactlist) {
                if (firstName.equals(person.firstName)) {
                    person.firstName = firstName1;
                    person.print();
                }
            }
            /*UC4 ability to delete a person using person's name*/
            private void  DeletePerson(String firstName){
                for (int i = 0; i < contactlist.size(); i++) {
                    AddressBook p = contactlist.get(i);
                    if (name.equals(p.firstName)) {
                        contactlist.remove(i);
                        System.out.println("Person  name has been deleted");
                        System.out.println(contactlist);
                    } else
                        System.out.println("Person name not found");
                }

            }
            /*UC5 ability to add multiple persons to address book*/

            public void AddMultiplePersons() {
                Scanner sc = new Scanner(System.in);
                System.out.print("enter how many person you want to add :");
                int Count = sc.nextInt();
                for (int i = 1; i <= Count; i++) {
                    AddPreson();
                }
                for (contact p : contactlist) {
                    p.display();
                }
            }

            }

          private void AddPreson() {
          }

          public void DeletePerson(String chinni) {
          }
      }

    private void display() {
    }

    public class AddressBook {
    public void main(String[] args) {
        
        Addressbook A1 = new Addressbook();

        //contact contact2 = new contact("chinni", "tanangi", "SR nagar", "hyderabad", "Telangana");
        //p1.print();

        //A1.Addnewcontact();
        //A1.EditPerson("chinni", " Chinni");
        A1.DeletePerson("chinni");
    }
          private void EditPerson(String chinni, String s){
        }
      }
    }





    

   









