package check;

/**
 *
 * @author sunwei
 */
public class Check {
    public static boolean checkreturn(String account,String password){
        boolean checkbool = false;
        if("sunwei".equals(account)&&"123456".equals(password)){
            checkbool = true;
        }
        return checkbool;
    }
}