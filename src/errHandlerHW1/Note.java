package errHandlerHW1;

public class Note {
    private String name;
    private String surname;
    private String patronymic;
    private String phone;
    private String birthdate;
    private String gender;

    public Note() {
    }


    public String getInfo() {
        return "<" + surname + "><" + name + "><" + patronymic + "><" + birthdate + "><" + phone + "><" + gender + ">";
    }

    public void checkNote() throws emptyLineException {
        if (this.patronymic == null | this.surname == null | this.name == null) {
            throw new emptyLineException("ФИО указанно не корректно!");
        }
        if (getGender() == null) throw new emptyLineException("Пол указан не корректно!");
        if (getPhone() == null) throw new emptyLineException("Телефон указан не корректно!");
        if (getBirthdate() == null) throw new emptyLineException("День рождения указан не корректно!");
    }



    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
