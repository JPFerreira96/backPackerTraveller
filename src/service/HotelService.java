package service;

import domain.Room;
import util.DateUtil;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class HotelService {


    Scanner scanner = new Scanner(System.in);
    DateUtil dateUtil = new DateUtil();

    public void HotelOptions(Room room) throws InterruptedException {
        System.out.println(Arrays.stream(room.getCustomers()).findAny().get());
        System.out.println("Choose between these options to operate a designed service.");
        System.out.println("1 - Check-in/Check-out");
        System.out.println("2 - Room Service");
        System.out.println("3 - Show value to be paid");
        System.out.println("4 - Leave the hotel");
        int answer = scanner.nextInt();
        int leaveChoice = 0;
        while (leaveChoice == 0) {
            Thread.sleep(1000);
            switch (answer) {
                case 1 -> {
                    Thread.sleep(1000);
                    System.out.println("Do you want to check-in or check-out?" +
                            " \n1 - Check-in\n2 - Check-out\n 3 - Back to Hotel Options");
                    int checkAnswer = scanner.nextInt();
                    if (checkAnswer == 1) {
                        System.out.println("You entered your room at " +
                                dateUtil.DateTimeFormatterToDataBaseStyle(LocalDateTime.now()));
                    } else if (checkAnswer == 2) {
                        System.out.println("You leaved your room at " +
                                dateUtil.DateTimeFormatterToDataBaseStyle(LocalDateTime.now()));
                    } else HotelOptions(room);

                }
                case 2 -> {
                    Thread.sleep(1000);
                    System.out.println(1 + "- Drinks");
                    System.out.println(2 + "- Food");
                    System.out.println(3 + "- Room Cleaning Service");
                    System.out.println(4 + "- Back to Hotel Service Options");
                    int serviceAnswer = scanner.nextInt();
                    if (serviceAnswer == 1) {
                        Thread.sleep(1000);
                        double beer = 5;
                        double soda = 2.5;
                        double orangeJuice = 3;
                        double lemonJuice = 3;
                        double tea = 2;
                        double coffe = 2;
                        System.out.println("1: Beer - $" + beer);
                        System.out.println("2: Soda - $" + soda);
                        System.out.println("3:Orange Juice - $" + orangeJuice);
                        System.out.println("4: Lemon Juice - $" + lemonJuice);
                        System.out.println("5: Tea - $" + tea);
                        System.out.println("6: Coffe - $" + coffe);
                        int optionChoice = scanner.nextInt();
                        switch (optionChoice) {
                            case 1 -> {
                                room.setAmountToBePaid(beer);
                            }
                            case 2 -> {
                                room.setAmountToBePaid(soda);
                            }
                            case 3 -> {
                                room.setAmountToBePaid(orangeJuice);
                            }
                            case 4 -> {
                                room.setAmountToBePaid(lemonJuice);
                            }
                            case 5 -> {
                                room.setAmountToBePaid(tea);
                            }
                            case 6 -> {
                                room.setAmountToBePaid(coffe);
                            }
                        }
                    } else if (serviceAnswer == 2) {
                        Thread.sleep(1000);
                        double burguer = 8;
                        double cheeseBurguer = 10.5;
                        double pizza = 14;
                        double rumpSteak = 13;
                        double cake = 20;
                        double bread = 2;
                        System.out.println("1: Burguer - $" + burguer);
                        System.out.println("2: Cheese Burguer - $" + cheeseBurguer);
                        System.out.println("3: Pizza - $" + pizza);
                        System.out.println("4: Rump Steak - $" + rumpSteak);
                        System.out.println("5: Cake - $" + cake);
                        System.out.println("6: Bread - $" + bread);
                        int optionChoice = scanner.nextInt();
                        switch (optionChoice) {
                            case 1 -> {
                                room.setAmountToBePaid(burguer);
                            }
                            case 2 -> {
                                room.setAmountToBePaid(cheeseBurguer);
                            }
                            case 3 -> {
                                room.setAmountToBePaid(pizza);
                            }
                            case 4 -> {
                                room.setAmountToBePaid(rumpSteak);
                            }
                            case 5 -> {
                                room.setAmountToBePaid(cake);
                            }
                            case 6 -> {
                                room.setAmountToBePaid(bread);
                            }
                        }
                    } else if (serviceAnswer == 3) {
                        Thread.sleep(1000);
                        System.out.println("Cleaning service is free, a worker is coming to clean your room");
                        HotelOptions(room);
                    }else HotelOptions(room);

                }


                case 3 -> {
                    Thread.sleep(1000);
                    System.out.println("$"+room.getAmountToBePaid()+" is the amount to be payed.");
                    HotelOptions(room);
                }

                case 4 -> {
                    Thread.sleep(1000);
                    return;
                }
                default -> {
                    HotelOptions(room);
                }

            }
        }
    }
}
