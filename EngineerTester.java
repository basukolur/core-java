class EngineerTester {

public static void main(String a[]) {
	
	Engineer engg = new Engineer();
	engg.duration = "4Years";
	engg.college = "Jain Engg College";
	System.out.println(engg.duration+"  "+engg.college);
	engg.problemSolving();
	
	CivilEngg civil = new CivilEngg();
	civil.solvingCivilProblems();
	
	MechEngg mech = new MechEngg();
	mech.solvingMechProblems();
	
	ECEngg ec =  new ECEngg();
	ec.solvingECProblems();
	
	EEEngg ee = new EEEngg();
	ee.solvingEEProblems();
	
	CSEngg cs = new CSEngg();
	cs.solvingCSProblems();
}
}