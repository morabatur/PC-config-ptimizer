package db.pojo;

import java.util.List;

public class GeneralSet {
    private List<Videocards> videocardsList;
    private List<PowerSupply> powerSupplyList;

    public GeneralSet(List<Videocards> videocardsList, List<PowerSupply> powerSupplyList) {
        this.videocardsList = videocardsList;
        this.powerSupplyList = powerSupplyList;
    }

    public List<Videocards> getVideocardsList() {
        return videocardsList;
    }

    public void setVideocardsList(List<Videocards> videocardsList) {
        this.videocardsList = videocardsList;
    }

    public List<PowerSupply> getPowerSupplyList() {
        return powerSupplyList;
    }

    public void setPowerSupplyList(List<PowerSupply> powerSupplyList) {
        this.powerSupplyList = powerSupplyList;
    }
}
