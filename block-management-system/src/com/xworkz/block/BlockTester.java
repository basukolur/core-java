package com.xworkz.block;

public class BlockTester {

	public BlockTester() {
		System.out.println(this.getClass().getSimpleName() + " Object is Created");
	}

	static int blockInit;
	static {
		System.out.println("Block 1 is Executed");
		blockInit = 10;
	}
	int blockInit1;

	{
		System.out.println("Block 2 is Executed");
		blockInit1 = 20;
	}

	public static void main(String[] args) {
		System.out.println("Main Method is Started");
		BlockTester blockTester = new BlockTester();
		System.out.println(BlockTester.blockInit);
		System.out.println(blockTester.blockInit1);
		System.out.println("Main Method is Ended");
	}

}
