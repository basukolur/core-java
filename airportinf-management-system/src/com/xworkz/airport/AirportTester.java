package com.xworkz.airport;

import java.util.Scanner;

import com.xworkz.airport.crud.AirportInf;
import com.xworkz.airport.crud.impl.AirportImpl;
import com.xworkz.airport.dto.TerminalDTO;

public class AirportTester {
	public static void main(String a[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of terminals");
		int size = sc.nextInt();

		AirportInf airport = new AirportImpl(size);

		for (int i = 0; i < size; i++) {

			TerminalDTO terminal = new TerminalDTO();

			System.out.println("Enter the id of the terminal");
			int id = sc.nextInt();
			System.out.println("Enter the terminal name");
			String name = sc.next();
			System.out.println("Enter the no of loading bridges ");
			int noOfLoadingBridges = sc.nextInt();
			System.out.println("Enter the depature gates");
			int noOfDepartureGates = sc.nextInt();
			System.out.println("Enter the check in counters");
			int noOfCheckIncounters = sc.nextInt();

			terminal.setId(id);
			terminal.setName(name);
			terminal.setNoOfLoadingBridges(noOfLoadingBridges);
			terminal.setNoOfDepartureGates(noOfDepartureGates);
			terminal.setNoOfCheckIncounters(noOfCheckIncounters);

			airport.createTerminal(terminal);

		}

		String options = null;
		do {
			System.out.println("Enter 1 to fetch the all terminal details");
			System.out.println("Enter 2 to update Loading bridge by id");
			System.out.println("Enter 3 to update No Of checkin counter by name ");
			System.out.println("enter 4 to delete the terminals by name");
			System.out.println("enter 5 to delete the terminals by id");
			System.out.println("Enter 6 to get all terminal names");
			System.out.println("Enter 7 to get the get terminal name by id");

			System.out.println("enter the choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				airport.getTerminalDetails();
				break;

			case 2:
				System.out.println("Enter the existing id to update the loading bridges");
				int existingId = sc.nextInt();
				System.out.println("Enter no of loading bridges to be update");
				int updateLoadingBridges = sc.nextInt();
				airport.updateLoadingBridgeById(existingId, updateLoadingBridges);
				break;

			case 3:
				System.out.println("Enter the existing Name to update the no of checkin counters");
				String existingName = sc.next();
				System.out.println("Enter no of check in counters to be update");
				int updateCheckInCounters = sc.nextInt();
				airport.updateNoOfCheckInCoountersByName(existingName, updateCheckInCounters);
				break;

			case 4:
				System.out.println("Enter the name to be deleted");
				String name1 = sc.next();
				airport.deleteTerminalsByName(name1);
				break;
			case 5:
				System.out.println("enter the id to be deleted");
				int id1 = sc.nextInt();
				airport.deleteTerminalsById(id1);
				break;

			case 6:
				airport.getAllTerminalName();
				break;

			case 7:
				System.out.println("Enter the id to get terminal name");
				int id2 = sc.nextInt();
				System.out.println(airport.getTerminalNameById(id2));
				break;

			default:
				System.out.println("Enter the valid choices");
				break;
			}

			System.out.println("Do you want to continue Y/N");
			options = sc.next();
		} while (options.equalsIgnoreCase("Y"));
		sc.close();
	}

}
