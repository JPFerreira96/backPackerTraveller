package application;

import domain.Customer;
import domain.Room;
import domain.Type;
import service.BookingService;
import service.HotelService;
import service.RoomList;

import java.util.Scanner;

public class HotelApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelService hotelService = new HotelService();
        BookingService bookingService = new BookingService();
        RoomList roomList =  new RoomList();

        roomList.addRoomsToAvailableRoomList();

        Customer customer = null;
        try {
            customer = bookingService.creatingCustomer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Room booking = null;
        try {
            booking = bookingService.booking(customer);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        RoomList.printOccupiedRoomList();

        try {
            hotelService.HotelOptions(booking);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

