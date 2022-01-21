package com.addressbook;

import jdk.internal.access.JavaSecurityAccess;

import javax.naming.Name;
import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

/*UC1 create contact in addressbook*/
  class contact<AddressHashMap> {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    int phone;
    int zip;
    private Integer contactname;


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
          private Object map;

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
          private int Editperson(String firstName, String firstName1) {
              contact[] contactlist = new contact[0];
              for (contact person : contactlist) {
                  if (firstName.equals(person.firstName)) {
                      person.firstName = firstName1;
                      person.print();
                  }
              }
              /*UC4 ability to delete a person using person's name*/
              private void DeletePerson (String firstName){
                  for (int i = 0; i < contactlist.size(); i++) {
                      contact p = contactlist.get(i);
                      if (name.equals(p.firstName)) {
                          contactlist.remove(i);
                          System.out.println("Person  name has been deleted");
                          System.out.println(contactlist);
                      } else
                          System.out.println("Person name not found");
                  }

              }
              /*UC5 ability to add multiple persons to address book*/

              public void AddMultiplePersons () {
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
              /*UC6 add multiple addressbook to the system*/

              public void addMultipleAddressBook () {
                  int AddressBook = 2;
                  for (int i = 0; i < AddressBook; i++) {
                      AddressBook addressBook = new AddressBook();
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the name for addressbook");
                      String AddressBook_A = sc.next();
                  }
                  return AddressBook;
              }
              /* UC7 ability to ensure there is no duplicate entry of the same person*/
              public void NoDuplicateEntry () {

                  if (map.equals(firstName.concat(lastName))) {
                      System.out.println("no duplicate entries");
                  }
                  map.put(firstName.contactdata(lastName).contactdata);
              }
          }

          class AddressHashMap<case3> {
              Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();

              public void print(HashMap<String, contact> map) {
                  for (String map1 : map.keySet()) {
                      System.out.println("key:" + map1 + "value:" + map.get(map1));
                  }

              }

              /*UC8* ability to search person in a city or state accross multiple address*/
              public void searchPersonByCityorstate() {
                  ArrayList<contact> contactlist = new ArrayList<>();
                  Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
                  String Cityorstate, contactname;
                  contactname = JOptionPane.showInputDialog("select cityorstate , contactnme");
                  String cityorstate = "Khammam";
                  switch (cityorstate) {
                      case 1:
                          cityorstate = JOptionPane
                                  .showInputDialog("Enter the city you want to search ,khammam:");
                          for (int i = 0; i < contactlist.size(); i++) {
                              contact p = contactlist.get(i);
                              if (city.equals(p.city)) {
                                  hashtable.put(String.valueOf(i + 1), p.contactname);
                              } else
                                  continue;
                          }
                          System.out.println(contactname + "found in" + hashtable);
                          break;

                  }
                  /*UC9 ability to view person by city or state*/
                  case2:
                  contactname = JOptionPane.showInputDialog("enter the contact name");
                  for (int i = 0; i < contactlist.size(); i++) {
                      contact p = contactlist.get(i);
                      if (city.equals(p.city)) {
                          hashtable.put(String.valueOf(i + 1), p.contactname);
                      } else
                          continue;
                  }
                  System.out.println(contactname + "found in" + hashtable);
                  break;


                  /*UC10 ability to get number of contact peron i.e count by city or state*/
                  case3:
                  cityorstate = JOptionPane.showInputDialog("Enter the city or state name");
                  for (int i = 0; i < contactlist.size(); i++) {
                      contact p = contactlist.get(i);
                      if ((cityorstate.equals(p.city)) || cityorstate.equals(p.state)) {
                          System.out.println(p.firstName.concat(p.lastName));
                          hashTable.put(i + 1, p.phone);
                      } else
                          continue;
                  }
                  System.out.println("In " + cityorstate + " we found " + hashTable);
                  break;
                  default:
                  System.out.println("Invalid user input");
                  break;
              }
             
              
              }

              private void AddPreson() {
              }

              public void DeletePerson(String chinni) {
              }

              public void AddMultipleAddressBook() {
              }
          }


    private void display() {
    }

    public class AddressBook {
    public void main(String[] args) {
        
        Addressbook A1 = new Addressbook();

        //contact contact2 = new contact("chinni", "tanangi", "SR nagar", "hyderabad", "Telangana");
        //p1.print();

        //A1.Addnewcontact();/*UC2*/
        //A1.EditPerson("chinni", " Chinni");/*UC3*/
        //A1.DeletePerson("chinni");/*UC4*/
        // A1.AddMultiplePersons();/*UC5*/
        // A1.AddMultipleAddressBook();/*UC6*/
        AddressHashMap h =new AddressHashMap();
       // A1.NoDuplicatentries();/*UC7*/
        //A1.searchPersonByCityorstate();/*UC8*/
        A1.searchpersonbycity();/*UC9*/
    }
          private void EditPerson(String chinni, String s){
        }
      }
    }





    

   









