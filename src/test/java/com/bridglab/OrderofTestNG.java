import org.testng.annotations.*;

public class OrderofTestNG {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite----");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class---");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test -----");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void test(){
        System.out.println("Test case 1");
    }
    @Test
    public void Test1(){
        System.out.println("After Method");

    }
    @Test
    public void Test2(){
        System.out.println("After Class");
    }
    @Test
    public void Test3(){
        System.out.println("After Test");
    }
    @Test
    public void Test4(){
        System.out.println("After Suite");
    }

}
