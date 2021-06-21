package za.ac.tut.accountHolder;

import za.ac.tut.Address.Address;
import za.ac.tut.contactDetails.ContactDetails;

public class AccountHolder {
    private String name;
    private String surname;
    private Address address;
    private ContactDetails contactDetails;

    public AccountHolder(){
        this.name="Elienoch";
        this.surname="Mulumba";
        this.address=new Address();
        this.contactDetails=new ContactDetails();
    }
    public AccountHolder(String name,String surname,Address address,ContactDetails contactDetails){
        this.name=name;
        this.surname=surname;
        this.address=address;
        this.contactDetails=contactDetails;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
}
