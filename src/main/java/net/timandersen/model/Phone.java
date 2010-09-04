package net.timandersen.model;

public class Phone {
  
  private Long id;
  private String number;
  private String type;
  private Person person;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

