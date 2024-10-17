package woo.cost.mgmt;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.extern.log4j.Log4j;

@Log4j
@PropertySource("classpath:/application.properties")
public class JDBCTest {

//    @Value("${spring.datasource.username}")
    private String databaseUsername;
//    @Value("${pring.datasource.password}")
    private String databasePassword;


    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection(){
        try(
            Connection conn = 
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/new_project", //url
                    "admin", //username
                    "dong1999!@")){

                System.out.println("conn:" + conn);
        }catch(Exception e) {
            fail(e.getMessage());
        }
    }
}
