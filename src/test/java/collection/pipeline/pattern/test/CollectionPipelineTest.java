package collection.pipeline.pattern.test;

import collection.pipeline.pattern.Car;
import collection.pipeline.pattern.CollectionPipeline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionPipelineTest {

    @Test
    public void shouldReturnMakeGreaterThan2000()
    {
        //givem

        List<Car> newCar= Arrays.asList(
                new Car("Jeep", "Wrangler", 2011),
                new Car("Dodge", "Avenger", 2010),
                new Car("Buick", "Cascada", 2016),
                new Car("Ford", "Focus", 2012)

        );



        //when

           List<String> carList= CollectionPipeline.getModelMakeOver2000(newCar);


        //then

                   assertEquals(4,carList.size());
    }

}
