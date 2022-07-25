package com.xworkz.airport.crud;

import com.xworkz.airport.dto.TerminalDTO;

public interface AirportInf {
	public boolean createTerminal(TerminalDTO terminal);

	public void getTerminalDetails();

	public boolean updateLoadingBridgeById(int id, int noOfLoadingBridges);

	public boolean updateNoOfCheckInCoountersByName(String name, int noOfCheckIncounters);

	public boolean deleteTerminalsByName(String name);

	public boolean deleteTerminalsById(int id);

	public String[] getAllTerminalName();

	public String getTerminalNameById(int id);

}
