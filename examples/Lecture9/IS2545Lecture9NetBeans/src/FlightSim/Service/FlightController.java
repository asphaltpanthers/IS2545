/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightSim.Service;

import FlightSim.Data.SqlContext;
import FlightSim.Entity.Airplane;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author AsphaltPanthers
 */
public class FlightController {
    private final SqlContext _context;
    
    public FlightController(SqlContext context) {
        _context = context;
    }
    
    public List<Airplane> GetAllAirplanes() throws SQLException {
        return _context.ExecuteQuery("select * from airplanes");
    }
}
