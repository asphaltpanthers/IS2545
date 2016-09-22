/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightSim.Service;

import FlightSim.Data.SqlContext;
import FlightSim.Entity.Airplane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Matchers.any;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

/**
 *
 * @author AsphaltPanthers
 */
public class FlightControllerTest {
    
    @Test
    public void GetAllAirplanesTestNoMock() throws SQLException {
        FlightController controller = new FlightController(new SqlContext());
        List<Airplane> airplanes = controller.GetAllAirplanes();
        Assert.assertTrue(!airplanes.isEmpty());
    }
    
    @Test
    public void GetAllAirplanesTestWithMock() throws SQLException {
        List<Airplane> returnValue = new ArrayList<>();
        returnValue.add(new Airplane("Boeing", 100, 25, 4));
        
        SqlContext mockContext = mock(SqlContext.class);
        when(mockContext.ExecuteQuery(any(String.class))).thenReturn(returnValue);
        
        FlightController controller = new FlightController(mockContext);
        List<Airplane> airplanes = controller.GetAllAirplanes();
        Assert.assertTrue(!airplanes.isEmpty());
        
        Mockito.verify(mockContext, times(1)).ExecuteQuery(any(String.class));
    }
}
