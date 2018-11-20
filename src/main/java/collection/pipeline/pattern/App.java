package collection.pipeline.pattern;

import java.util.List;

public class App {

    public static void main(String[] args) {
        CarCreator c=new CarCreator();
        List<Car> cars=CarCreator.createCars();
        System.out.println(CollectionPipeline.getModelMakeOver2000(cars));
    }
}
