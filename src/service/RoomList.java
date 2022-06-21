package service;

import domain.Floor;
import domain.Room;
import domain.Type;

import java.util.*;

public class RoomList {
    public static List<Room> avalaibleRoomList = new ArrayList<Room>() {};

    public static List<Room> occupiedRooms = new ArrayList<Room>(){};
    private static ListIterator<Room> listIterator = avalaibleRoomList.listIterator();
    private int roomCounter = 0;
    private int listCounter = 0;
    public void addRoomsToAvailableRoomList() {
       while (listIterator.hasNext() || listCounter < 10){
           for (int i = 0; i < Type.values().length; i++) {
               for (int j = 0; j < Floor.values().length; j++) {
               Room room = Room.RoomBuilder.aRoom().num(roomCounter++).build();
               room.setType(Type.values()[i]);
                   room.setFloor(Floor.values()[j]);
                   listIterator.add(room);
               }
           }
           listCounter++;
       }
    }
    public static void printAvalaibleRoomList(){
        for(Room room: avalaibleRoomList){
            System.out.println(room);
        }
    }
    public static void printOccupiedRoomList(){
        for (Room room: occupiedRooms){
            System.out.println(room);
        }
    }
}
