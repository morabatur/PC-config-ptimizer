package db.pojo;


public class Storage {

  private long id;
  private String name;
  private long size;
  private String type;
  private long powerUsage;
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


  public long getSize() {
    return size;
  }

  public void setSize(long size) {
    this.size = size;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public long getPowerUsage() {
    return powerUsage;
  }

  public void setPowerUsage(long powerUsage) {
    this.powerUsage = powerUsage;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

}
