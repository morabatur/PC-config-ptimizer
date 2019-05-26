package db.pojo;


public class Processors {

  private long id;
  private String name;
  private double clockFrequency;
  private long capacity;
  private long cacheMemory;
  private long core;
  private long price;
  private long powerUsage;


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


  public double getClockFrequency() {
    return clockFrequency;
  }

  public void setClockFrequency(double clockFrequency) {
    this.clockFrequency = clockFrequency;
  }


  public long getCapacity() {
    return capacity;
  }

  public void setCapacity(long capacity) {
    this.capacity = capacity;
  }


  public long getCacheMemory() {
    return cacheMemory;
  }

  public void setCacheMemory(long cacheMemory) {
    this.cacheMemory = cacheMemory;
  }


  public long getCore() {
    return core;
  }

  public void setCore(long core) {
    this.core = core;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }


  public long getPowerUsage() {
    return powerUsage;
  }

  public void setPowerUsage(long powerUsage) {
    this.powerUsage = powerUsage;
  }

}
