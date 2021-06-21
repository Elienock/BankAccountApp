package za.ac.tut.Address;

public class Address {
    private int streetNum;
    private String streetName;
    private String areaName;
    private int code;

    public Address(){
        this.streetNum=180;
        this.streetName="Steve Biko";
        this.areaName="Sunnyside";
        this.code=0002;
    }
    public Address(int streetNum,String streetName,String areaName,int code){
        this.streetNum=streetNum;
        this.streetName=streetName;
        this.areaName=areaName;
        this.code=code;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAreaName() {
        return areaName;
    }

    public int getCode() {
        return code;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
