package defectprdx;

import static defectprdx.Compare.identicalFile1;
import static defectprdx.NewJFrame.added_matrix;
import static defectprdx.NewJFrame.delete_matrix;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtilExample {

    public static void main(String[] args) throws Exception {
         String userDir = System.getProperty("user.home");
        String csvFile =userDir+"/Desktop/Semester7/major-1/excel.csv";
        FileWriter writer = new FileWriter(csvFile);
    
System.out.println("CSVUTIL entered");
//        List<Developer> developers = Arrays.asList(
//                new Developer("mkyong", new BigDecimal(120500), 32),
//                new Developer("zilap", new BigDecimal(150099), 5),
//                new Developer("ultraman", new BigDecimal(99999), 99)
//        );

        //for header
        CSVUtils.writeLine(writer, Arrays.asList("FILE", "ADDED", "DELETED"));
System.out.println("CSVUTIL entered111111111");
        for (int i=0;i<identicalFile1.size();i++) {
System.out.println("CSVUTIL entered22222222222");
            List<String> list = new ArrayList<>();
            list.add(identicalFile1.get(i));
            list.add(added_matrix.get(i).toString());
            list.add(String.valueOf(delete_matrix.get(i)));

            CSVUtils.writeLine(writer, list);

			//try custom separator and quote.
			//CSVUtils.writeLine(writer, list, '|', '\"');
        }

        writer.flush();
        writer.close();

    }

}
