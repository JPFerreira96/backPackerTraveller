package service;

import domain.*;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BookingService {
    private final Scanner scanner = new Scanner(System.in);
    public  Customer creatingCustomer() throws InterruptedException {
        System.out.println("Type your name");
        String name = scanner.nextLine();

        Thread.sleep(1000);

        System.out.println("Type your gender\nMan = m\nWoman = w\nTransgender = t\nNon-Binary = n");
        char genderChoice = scanner.nextLine().charAt(0);
        Gender gender = Gender.genderOption(genderChoice);
        Thread.sleep(1000);

        System.out.println("Type your email");
        String email = scanner.nextLine();
        Thread.sleep(1000);

        String cep = getString();

        System.out.println("Type your street name and the house number");
        String streetInfo = scanner.nextLine();
        Thread.sleep(1000);

        System.out.println("Type your state name");
        String state = scanner.nextLine();
        Thread.sleep(1000);

        System.out.println("Type your city name");
        String cityName = scanner.nextLine();
        Thread.sleep(1000);


        System.out.println("Type a complement about your address");
        String complement = scanner.nextLine();
        Thread.sleep(1000);

        System.out.println("Type your cellphone number");
        String cellphoneNumber = scanner.nextLine();
        Thread.sleep(1000);

        Address adress = Address.AddressBuilder.anAddress().cep(cep).
                streetInfo(streetInfo).state(state).city(cityName).complement(complement).build();
        Customer customer = Customer.CustomerBuilder.aCustomer().name(name).gender(gender)
                .email(email).address(adress).cellphoneNumber(cellphoneNumber).build();
        CustomerList.customerList.add(customer);
        Thread.sleep(1000);
        return customer;
    }

    private String getString() throws InterruptedException {
        System.out.println("Type your CEP");
        Thread.sleep(1000);
        String cep = scanner.nextLine();
        return cep;
    }

    public Room booking(Customer customer) throws InterruptedException {
          Thread.sleep(1000);
          System.out.println(customer + ", these are the available rooms");
          Thread.sleep(1000);

          RoomList.printAvalaibleRoomList();
          System.out.println("\nValues according to room type:");
          Type.showValues();
          Thread.sleep(1000);
          System.out.println("Type the room number");
          int i = scanner.nextInt();
          if (i > RoomList.avalaibleRoomList.size()) {
              i = RoomList.avalaibleRoomList.size() - 1;
          }
          Thread.sleep(1000);
          System.out.println("Type how much days you will spent in that room");
          int daysSpent = scanner.nextInt();
          if (daysSpent <= 0){
              System.out.println("Looks like you do not want anymore to book a room");
              System.exit(0);
              Thread.sleep(1000);
          }
          double value = roomCalculation(daysSpent, RoomList.avalaibleRoomList.get(i).getType());
          System.out.println("You have paid $" + value);
          Thread.sleep(1000);

          Customer[] customersArray = new Customer[]{customer};
          Room roomToBeOccupied = RoomList.avalaibleRoomList.get(i);
          customer.setRoom(roomToBeOccupied);
          roomToBeOccupied.setCustomers(customersArray);
          RoomList.occupiedRooms.add(roomToBeOccupied);
          RoomList.avalaibleRoomList.remove(roomToBeOccupied);
          return roomToBeOccupied;
      }

      private double roomCalculation(int daysSpent, Type type){
        return daysSpent * type.getValue();
      }
}
