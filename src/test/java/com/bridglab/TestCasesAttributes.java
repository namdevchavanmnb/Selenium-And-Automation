import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesAttributes {
    @Test(invocationCount = 0)
    public void createUser(){
        Assert.assertTrue(true,"Create user failed");

    }
    @Test()
    public void deleteuser(){
        System.out.println("deleted user suceefully..");
    }
}
