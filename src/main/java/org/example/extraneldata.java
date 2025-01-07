package org.example;

import org.testng.annotations.DataProvider;

public class extraneldata {

    @DataProvider(name="dp1o")
    Object[][] loginData()
    {
        Object[][] getdata={    {"jub@gmail.com","test12"},
                {"hu@gmail.com","test23"},
                {"jubayerhu3@gmail.com","12345ju@"} };
        return getdata;
    }
}
