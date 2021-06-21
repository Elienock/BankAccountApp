package za.ac.tut.contactDetails;

public class ContactDetails {
    private String cellNo;
    private String email;

    public ContactDetails(){
        this.cellNo="0628229088";
        this.email="lubayaelienock@gmail.com";
    }
    public ContactDetails(String cellNo,String email){
        this.cellNo=cellNo;
        this.email=email;
    }

    public String getCellNo() {
        return cellNo;
    }

    public String getEmail() {
        return email;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
