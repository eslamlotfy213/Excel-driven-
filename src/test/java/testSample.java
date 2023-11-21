import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Values ;

		dataDriven d=new dataDriven();
	ArrayList data=d.getData("Logout","TestCases","sample", "src/test/resources/demodata.xlsx");


	for (int i = 0; i< data.size();i++){

		Values =  data.get(i).toString();

		System.out.println(Values);

	}
//
//		System.out.println(data.get(0));
//		System.out.println(data.get(1));
//		System.out.println(data.get(2));



	}

}
