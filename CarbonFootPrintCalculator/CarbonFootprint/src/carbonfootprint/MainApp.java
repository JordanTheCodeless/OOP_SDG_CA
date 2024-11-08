///* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package carbonfootprint;
//
///**
// *
// * @author jordancarthy
// */
//
//
//import java.util.Scanner;
//
//public class MainApp {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Getting user input for CarbonBills
//        System.out.println("Enter your monthly electric bill: ");
//        double electricBill = scanner.nextDouble();
//        System.out.println("Enter your monthly gas bill: ");
//        double gasBill = scanner.nextDouble();
//        System.out.println("Enter your monthly oil bill: ");
//        double oilBill = scanner.nextDouble();
//
//        CarbonBills bills = new CarbonBills(electricBill, gasBill, oilBill, 0);
//        double billCarbonFootprint = bills.carbonFootCalc();
//
//        // Getting user input for CarbonRecycle
//        System.out.println("Do you recycle aluminum? (1 for yes, 0 for no): ");
//        int recycleAlum = scanner.nextInt() == 0 ? 166 : 0;
//        System.out.println("Do you recycle newspaper? (1 for yes, 0 for no): ");
//        int recycleNewsPaper = scanner.nextInt() == 0 ? 184 : 0;
//
//        CarbonRecycle recycle = new CarbonRecycle(recycleAlum, recycleNewsPaper,0);
//        double recycleCarbonFootprint = recycle.carbonFootCalc();
//
//        // Getting user input for CarbonTransport
//        System.out.println("Enter your total yearly car mileage: ");
//        int carMileage = scanner.nextInt();
//        System.out.println("Enter the number of flights you've taken (4 hours or less): ");
//        int flightLessFour = scanner.nextInt();
//        System.out.println("Enter the number of flights you've taken (more than 4 hours): ");
//        int flightMoreFour = scanner.nextInt();
//
//        CarbonTransport transport = new CarbonTransport(flightLessFour, flightMoreFour, carMileage, 0);
//        double transportCarbonFootprint = transport.carbonFootCalc();
//
//        // Totaling carbon footprint
//        double totalCarbonFootprint = billCarbonFootprint + recycleCarbonFootprint + transportCarbonFootprint;
//
//        System.out.printf("Your total carbon footprint is: %.2f pounds of CO2\n", totalCarbonFootprint);
//
//        scanner.close();
//    }
//}
