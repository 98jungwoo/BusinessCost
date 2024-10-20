package nam.cost.business;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.PropertySource;

//값이 안불러와짐 다시 확인해보기
// @PropertySource("classpath:/application.properties")
public class JdbcTest {

//    @Value("${spring.datasource.username}")
    private String databaseUsername;
//    @Value("${pring.datasource.password}")
    private String databasePassword;

    private static final Logger logger = LoggerFactory.getLogger(JdbcTest.class);

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
                    databaseUsername, //username
                    databasePassword)) {  //혹시 안되면 실제 내용 입력하기

        		logger.info("conn:" + conn);
        }catch(Exception e) {
            fail(e.getMessage());
        }
    }
}