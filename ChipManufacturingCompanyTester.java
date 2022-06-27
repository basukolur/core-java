class ChipManufacturingCompanyTester {

public static void main (String a[]) {

TSM tsm = new TSM();
tsm.founder = "Morris Chong";
tsm.founded = 1987;
tsm.headQuarter = "Hsinchu,Taiwan";
tsm.noOfEmployees = 65152;

System.out.println(tsm.founder+"  "+tsm.founded+"  "+tsm.headQuarter+"  "+tsm.noOfEmployees);
}
}