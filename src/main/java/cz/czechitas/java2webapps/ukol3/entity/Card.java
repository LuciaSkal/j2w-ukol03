package cz.czechitas.java2webapps.ukol3.entity;

public class Card {
    String fullName;
    String company;
    String streetAddress;
    String zipCode;

    String city;
    String email;
    String phone;
    String web;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Card(String fullName, String company, String streetAddress, String city, String zipCode, String email, String phone, String web) {
        this.fullName = fullName;
        this.company = company;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipCode = zipCode;
        this.email = email;
        this.phone = phone;
        this.web = web;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

   public String getFullAddress() {
        String fullAddress = (streetAddress + city + zipCode);
        return fullAddress;
    }
}
