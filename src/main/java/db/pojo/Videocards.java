package db.pojo;


public class Videocards {

  private long id;
  private String name;
  private long graphicsCoreFrequency;
  private long videoMemory_Size;
  private long memoryBusCapacity;
  private long videoMemoryOperatingFrequency;
  private long powerUsage;
  private long price;


  public Videocards() {
  }

  public Videocards(long id, String name, long graphicsCoreFrequency, long videoMemory_Size, long memoryBusCapacity, long videoMemoryOperatingFrequency, long powerUsage, long price) {
        this.id = id;
        this.name = name;
        this.graphicsCoreFrequency = graphicsCoreFrequency;
        this.videoMemory_Size = videoMemory_Size;
        this.memoryBusCapacity = memoryBusCapacity;
        this.videoMemoryOperatingFrequency = videoMemoryOperatingFrequency;
        this.powerUsage = powerUsage;
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


  public long getGraphicsCoreFrequency() {
    return graphicsCoreFrequency;
  }

  public void setGraphicsCoreFrequency(long graphicsCoreFrequency) {
    this.graphicsCoreFrequency = graphicsCoreFrequency;
  }


  public long getVideoMemory_Size() {
    return videoMemory_Size;
  }

  public void setVideoMemory_Size(long videoMemory_Size) {
    this.videoMemory_Size = videoMemory_Size;
  }


  public long getMemoryBusCapacity() {
    return memoryBusCapacity;
  }

  public void setMemoryBusCapacity(long memoryBusCapacity) {
    this.memoryBusCapacity = memoryBusCapacity;
  }


  public long getVideoMemoryOperatingFrequency() {
    return videoMemoryOperatingFrequency;
  }

  public void setVideoMemoryOperatingFrequency(long videoMemoryOperatingFrequency) {
    this.videoMemoryOperatingFrequency = videoMemoryOperatingFrequency;
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


  @Override
  public String toString() {
    return "Videocards{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", graphicsCoreFrequency=" + graphicsCoreFrequency +
            ", videoMemory_Size=" + videoMemory_Size +
            ", memoryBusCapacity=" + memoryBusCapacity +
            ", videoMemoryOperatingFrequency=" + videoMemoryOperatingFrequency +
            ", powerUsage=" + powerUsage +
            ", price=" + price +
            '}';
  }
}
