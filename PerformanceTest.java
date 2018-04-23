
package javatest;

/**
 *
 * @author Meher Khan
 */

public class PerformanceTest {

	public static void main(String[] args){



	int N=999999999;
	long t;
	
	{

	StringBuffer sb = new StringBuffer();
	t=System.currentTimeMillis();
	for (int i=N; i-->0;){

	sb.append("");
	}

	System.out.println(System.currentTimeMillis()-t);

	}


	{

	StringBuilder sb = new StringBuilder();
	t=System.currentTimeMillis();
	for (int i=N; i-->0;){

	sb.append("");
	}

	System.out.println(System.currentTimeMillis()-t);

	}



}


}