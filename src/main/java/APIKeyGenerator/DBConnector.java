package APIKeyGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DBConnector {
    
    //Check connection status and return json value to the requestor
    @RequestMapping("/status") @ResponseBody
    public HashMap<String, Boolean> isConnect() {
        HashMap hm = new HashMap();
        boolean status = false;
        
        try{
            Connection cn = DriverManager.getConnection("#"); //# will change connection string later on.
            if(cn == null) {
                status = false;
            }
            else {
                status = true;
            }
            cn.close();
        } catch (SQLException se) { 
            System.err.println("ERRORs: There are serious errors occured in the database connector configuration. Please contact the administrator immediately.");
        }
        
        String result = (!status) ? "Database connection established." : "ERRORs: Database is currently not connect.";
        hm.put(status, result);
        
        return hm;
    }
    
}