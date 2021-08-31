package rest;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import rest.APITest1;

@RunWith(JUnitPlatform.class)
@SelectClasses(APITest1.class)
public class TestRunner1 {
}