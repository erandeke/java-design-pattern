package collection.pipeline.pattern;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionPipeline {


    public static List<String> getModelMakeOver2000(List<Car> cars)
    {
     //get the car model having the make greater than 2000 year
        //sort the response
        //collect in the list and send for display

        return cars.stream()
                   .filter(carYear->carYear.getYear()>2000)
                   .sorted(Comparator.comparing(Car::getYear))
                   .map(Car::getModel)
                   .collect(Collectors.toList());



    }



}
