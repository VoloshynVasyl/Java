package block04.model;

/**
 * Created by Vasyl_Voloshyn on 4/20/2017.
 */
public class PhoneBook {
    private String name;
    private String surname;
    private String patronymic;
    private String surnameAndInitials;
    private String nickname;
    private String comment;
    private String group;
    private String homePhone;
    private String cellPhone;
    private String secondCellPhone;
    private String email;
    private String skype;
    private String[] address;
    private String fullAddress;
    private String registrationDate;
    private String lastEditDate;

    public PhoneBook() {
        address = new String[5];
        setRegistrationDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public void setSurnameAndInitials() {
        this.surnameAndInitials = surname +" "+ name.substring(0, 1) +".";
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getSecondCellPhone() {
        return secondCellPhone;
    }

    public void setSecondCellPhone(String secondCellPhone) {
        this.secondCellPhone = secondCellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(int index, String address) {
        this.address[index] = address;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress() {
        for(int i = 0; i < 4; i++){
            fullAddress += address[i] + ", ";
        }
        fullAddress += address[4] +".";
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate() {
        registrationDate = new java.util.Date ().toString ();
    }

    public String getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate() {
        lastEditDate = new java.util.Date ().toString ();
    }
}
