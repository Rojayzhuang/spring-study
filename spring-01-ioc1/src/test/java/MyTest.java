import com.rojay.dao.UserDaoMysqlImpl;
import com.rojay.service.UserService;
import com.rojay.service.UserServiceImpl;

/**
 * @author Rojay
 * @version 1.0.0
 * @createTime 2020年12月18日  08:51:54
 */
public class MyTest {

    public static void main(String[] args) {
        //用户实际调用的是业务层，dao层不需要接触
        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        userService.getUser();

    }

}
