package db.pojo;


public class Motherboard {

  private long id;
  private String name;
  private String formFactor;
  private long ramSlots;
  private long price;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getFormFactor() {
    return formFactor;
  }

  public void setFormFactor(String formFactor) {
    this.formFactor = formFactor;
  }


  public long getRamSlots() {
    return ramSlots;
  }

  public void setRamSlots(long ramSlots) {
    this.ramSlots = ramSlots;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

}
