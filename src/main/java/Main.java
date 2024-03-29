import com.sultan.dataStructure.CustomizedListOfArrays;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String... arg){
        //Fetch item using datastructure List
        {
            List<String> list = new LinkedList<>();

            //Populate data
            for (int i = 0; i < 4_000_000_0; i++) {
                list.add("Hi test number: " + i);
            }

            //Fetch item number 2_000_000_0 and  calc the duration
            var startTime = LocalDateTime.now();
            list.get(2_000_000_0);
            var endTime = LocalDateTime.now();
            Duration duration = Duration.between(startTime, endTime);

            //Print the  duration to get item in second
            System.out.println("LinkedList takes in second: " + duration + "\n");
        }


        //Fetch item using datastructure CustomizedListOfArrays
        {
            CustomizedListOfArrays<String> customizedListOfArrays = new CustomizedListOfArrays<>(1000);

            //Populate data
            for (int i = 0; i < 4_000_000_0; i++) {
                customizedListOfArrays.addItem("Hi test number: " + i);
            }

            //Fetch item number 2_000_000_0 and  calc the duration
            var startTime = LocalDateTime.now();
            customizedListOfArrays.getItem(2_000_000_0);
            var endTime = LocalDateTime.now();
            Duration duration = Duration.between(startTime, endTime);

            //Print the  duration to get item in second
            System.out.println("CustomizedListOfArrays takes in second: " + duration);
        }
    }
}
