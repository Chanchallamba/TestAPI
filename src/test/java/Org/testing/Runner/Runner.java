package Org.testing.Runner;

import java.io.IOException;

import Org.testing.testscript.TC1_PostRequest;
import Org.testing.testscript.TC2_GetRequest;
import Org.testing.testscript.TC3_GetAll;
import Org.testing.testscript.TC4_Putrequest;
import Org.testing.testscript.TC5_DeleteRequest;
import Org.testing.testscript.TC6_GetEmployeeData;
import Org.testing.testscript.TC7_PostEmployeeRecords;
import Org.testing.testscript.TC8_GetAllid;
import Org.testing.testscript.TC9_Get_a_Record;

public class Runner
{
	public static void main(String[] args) throws IOException 
	{
		TC1_PostRequest tc1= new TC1_PostRequest();
		tc1.Testcase1();
		
		TC2_GetRequest tc2 = new TC2_GetRequest();
		tc2.Testcase2();
		
		TC3_GetAll tc3 = new TC3_GetAll();
		tc3.Testcase3();
		
		TC4_Putrequest tc4 = new TC4_Putrequest();
		tc4.Testcase4();
		
		TC5_DeleteRequest tc5 = new TC5_DeleteRequest();
		tc5.Testcase5();
		
		TC6_GetEmployeeData tc6 = new TC6_GetEmployeeData();
		tc6.Testcase6();
		
		TC7_PostEmployeeRecords tc7 = new TC7_PostEmployeeRecords();
		tc7.Testcase7();
		
		TC8_GetAllid tc8 = new TC8_GetAllid();
		tc8.Testcase8();
		
		TC9_Get_a_Record tc9 = new TC9_Get_a_Record();
		tc9.Testcase9();
	}

}
