package ro.sci.carrental;

import ro.sci.carrental.dao.CarDAO;
import ro.sci.carrental.reader.*;

/**
 * <h1>RentACar Model</h1>
 * RentACar simulates a car rental business.
 * <p>
 * <h>
 * This is the main method which makes use of SimulateCars and SimulateCustomer classes to do search queries.
 *
 * @author Flaviu Lupoian
 * @version 1.2
 * @since 1.8
 */
public class Main {

    public static void main(String[] args) throws InvalidEntityException, InterruptedException {
        //citire date sql si printare din CarRepository
        CarDAO carDAO = new CarDAO();
        carDAO.read();
        carDAO.printRepository();

        carDAO.writeToSql(); //merge doar dupa ce se intoduc datele de access la sql

//aici sunt restul cerintelor

//        File carsFile = new File("cars.txt");
//        EntityReader entityReader = new EntityReader();
//        List<String> carLines = entityReader.readLines(carsFile);
//        Convertor<Car> carConvertor = new CarConvertor();
//        CarRepository<Car> carRepository = new CarRepositoryImpl();
//        CarService<Car> carService = new CarServiceImpl(carRepository);

//        for (String line : carLines) {
//            carService.add(carConvertor.convert(line));
//        }
//
//        File customerFile = new File("customers.txt");
//        List<String> customerLines = entityReader.readLines(customerFile);
//        Convertor<Customer> customerConvertor = new CustomerConvertor();
//        CustomerRepository<Customer> customerRepository = new CustomerRepositoryImpl();
//        CustomerService<Customer> customerService = new CustomerServiceImpl(customerRepository);
//
//        for (String line : customerLines) {
//            customerService.add(customerConvertor.convert(line));
//        }
////
//        //efectuam cautari masini
//        SimulateCars<Car> simulateCars = new SimulateCars<>();
//        simulateCars.searches(carRepository);
////
//        //efectuam cautari clienti
//        SimulateCustomer simulateCustomer = new SimulateCustomer();
//        simulateCustomer.searches(customerRepository);
//
//        File outCars = new File("outcars.txt");
//        CarWriter carWriter = new CarWriter();
//        carWriter.writeObjects(carRepository.getAll(), outCars);
//
//        File outCustomers = new File("outcustomers.txt");
//        CustomerWriter customerWriter = new CustomerWriter();
//        customerWriter.writeObjects(customerRepository.getAll(), outCustomers);

        //Threads for renting and returning cars
//        SimulateThreads simulateThreads = new SimulateThreads();
//        simulateThreads.simulate(carService);
    }
}
