package basicTool;

import org.DriverFactory.Factory.DriverFactory;

import dataBean.app.login.UserBean;
import dataTool.DataFactory;
import page.app.borrowAndLend.BorrowAndLendPage;
import page.app.setup.FristSwipePage;
import page.app.setup.LoginPage;

public class appLoginTool {

    /**
     * User any account login is ok
     * 
     * @return
     * @throws Exception
     */
    public static BorrowAndLendPage appSimpleAccountLogin() throws Exception {
        UserBean userBean = DataFactory.GetData(UserBean.class);
        FristSwipePage fristSwipePage = new FristSwipePage(DriverFactory.createAppiumDriver());
        LoginPage loginPage = fristSwipePage.finishSwipe();
        return loginPage.login(userBean);
    }

    /**
     * 
     * Need use special account to login
     * 
     * @param userBean
     *            you want to login user
     * @return
     * @throws Exception
     */
    public static BorrowAndLendPage appSpecialAccountLogin(UserBean userBean) throws Exception {
        FristSwipePage fristSwipePage = new FristSwipePage(DriverFactory.createAppiumDriver());
        LoginPage loginPage = fristSwipePage.finishSwipe();
        return loginPage.login(userBean);
    }

}
