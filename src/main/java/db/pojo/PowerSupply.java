package db.pojo;


public class PowerSupply {

  private long id;
  private String name;
  private long power;
  private long price;

  public PowerSupply() {
  }

  public PowerSupply(long id, String name, long power, long price) {
    this.id = id;
    this.name = name;
    this.power = power;
    this.price = price;
  }


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


  public long getPower() {
    return power;
  }

  public void setPower(long power) {
    this.power = power;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }


  @Override
  public String toString() {
    return "PowerSupply{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", power=" + power +
            ", price=" + price +
            '}';
  }
}
