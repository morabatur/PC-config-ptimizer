package json;


import db.dao.PowerSupplyDAO;
import db.dao.VideocardsDAO;
import db.pojo.GeneralSet;
import db.pojo.PowerSupply;
import db.pojo.Videocards;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;


public class JsonGeneratorTest {

    @Test
    public void createJson() throws SQLException {
        List<Videocards> videocards = new VideocardsDAO().selectVideocards(1,1,1,1);
        List<PowerSupply> powerSupplies = new PowerSupplyDAO().selectPowerSupplys();

        GeneralSet generalSet = new GeneralSet(videocards, powerSupplies);
        System.out.println(new JsonGenerator().createJson(generalSet));

    }
}
