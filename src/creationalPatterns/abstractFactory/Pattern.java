// package creationalPatterns.abstractFactory;

// import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

// enum carType {
//     micro, mini, luxury
// }


// abstract class Car {
//     Car(carType, Location location)
//     {
//         this.model = model;
//         this.location = location;
//     }

//     abstract void construct();

//     carType model = null;
//     Location location = null;

//     carType getCarModel() {
//         return model;
//     }

//     void setCarModel (carType, model)
//     {
//         this.model = model;

//     }

//     Location getCarLocation() {
//         return location;
//     }

//     void setCarLocation(Location location) {
//         this.location = location;

//     }

//     @Override
//     public String toString() {
//         return "carModel - " + model + " located in " + location;
//     }
// }

// class luxuryCar extends Car {
//     luxuryCar(Location location) {
//         super(carType.luxury, location);
//         construct();
//     }

//     @Override
//     protected void construct() {
//         System.out.println("connecting to luxury car");
//     }

// }

// class microCar extends Car {
//     microCar(Location location) {
//         super(carType.mini, location);
//         construct();
//     }
//     @Override
//     protected void construct() {
//         System.out.println("connecting to micro car");
//     }
// }

// enum Location {
//     defualt, usa, india
// }

// class indiaCarFactory {
//     static Car buildCar(cartype, model){
//         Car car = null;
//         switch (model){
//             case micro
//         }
//     }
// }


// public class Pattern {
//     public static void main(String[] args) {

//     }
// }
