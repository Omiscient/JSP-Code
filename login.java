
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/omniscient?zeroDateTimeBehavior=convertToNull","aronee2008","scom94gm!@#");
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        String login_mode = request.getParameter("login_mode");
        if(login_mode.equalsIgnoreCase("student")){
            String USN = request.getParameter("USN");
            String Passwd_stud = request.getParameter("Passwd_stud");
        
    }
        else if(login_mode.equalsIgnoreCase("staff")){
            String SID = request.getParameter("SID");
            String Passwd_staff = request.getParameter("Passwd_staff");
                
                }
     
        
        
        
    }
}
