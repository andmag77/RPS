package rps.controller;

import java.util.Scanner;

public class RPSController
{
	private Scanner RPS;
	public int UP;
	public int CP;
	public int MV;

	public RPSController()
	{
		RPS = new Scanner(System.in);

	}

	public void start() throws InterruptedException
	{
		RPSLogic();
	}

	private void RPSLogic() throws InterruptedException
	{

		System.out.println("Welcome to RPS. You are going to lose all your monyes");
		System.out.println("Ready? Plaace your bets. if you need help at any time type RPS -h");
		String answer = RPS.next();
		RPS.nextLine();
		answer = RPS.nextLine();

		if (answer.contains("-h"))
		{
			System.out.println("RPS (or Rock paper scissors) where you will play agenst a ai of sorts. this will take all your money any your first born child.");
			System.out.println("The comands you may use are as follows: rock, paper, scissors, RPS -h, and restart");
			System.out.println("Type restart when you have finished in this help menu");
			answer = RPS.next();
			RPS.nextLine();
			answer = RPS.nextLine();
			if (answer.contains("restart"))
			{
				RPSLogic();
			}
			else
			{
				System.out.println("You misspeld restart... but we will give it to you any way");
				RPSLogic();
			}

		}
		if (answer.contains("rock"))
		{
			System.out.println("3");
			Thread.sleep(1000);
			System.out.println("2");
			Thread.sleep(1000);
			System.out.println("1");
			Thread.sleep(1000);

			MV = (int) (Math.random() * 3);
			if (MV == 1)
			{
				System.out.println("You chose:    rock");
				System.out.println("I have chose: rock");
				System.out.println("This was a draw...");
				System.out.println("Your Points:" + UP + "");
				System.out.println("My points:  " + CP + "");
				Thread.sleep(2500);
				RPSLogic();
			}
			if (MV == 2)
			{
				System.out.println("You chose:     rock");
				System.out.println("I have chose: paper");
				System.out.println("I WIN");
				CP++;
				System.out.println("Your Points:" + UP + "");
				System.out.println("My points:  " + CP + "");
				Thread.sleep(2500);
				RPSLogic();
			}
			if (MV == 3)
			{
				System.out.println("You chose:        rock");
				System.out.println("I have chose: scissors");
				System.out.println("you win. This time");
				UP++;
				System.out.println("Your Points:" + UP + "");
				System.out.println("My points:  " + CP + "");
				Thread.sleep(2500);
				RPSLogic();
			}
		}
		if (answer.contains("paper"))
		{
			System.out.println("3");
			Thread.sleep(1000);
			System.out.println("2");
			Thread.sleep(1000);
			System.out.println("1");
			Thread.sleep(1000);

			MV = (int) (Math.random() * 3);
			if (MV == 1)
			{
				System.out.println("You chose:   paper");
				System.out.println("I have chose: rock");
				System.out.println("you win... this time");
				UP ++;
				System.out.println("Your Points:" + UP + "");
				System.out.println("My points:  " + CP + "");
				Thread.sleep(2500);
				RPSLogic();
			}
			if (MV == 2)
			{
				System.out.println("You chose:    paper");
				System.out.println("I have chose: paper");
				System.out.println("it was a draw...");
				System.out.println("Your Points:" + UP + "");
				System.out.println("My points:  " + CP + "");
				Thread.sleep(2500);
				RPSLogic();
			}
			if (MV == 3)
			{
				System.out.println("You chose:       paper");
				System.out.println("I have chose: scissors");
				System.out.println("I WIN");
				CP++;
				System.out.println("Your Points:" + UP + "");
				System.out.println("My points:  " + CP + "");
				Thread.sleep(2500);
				RPSLogic();
			}
		}
		if (answer.contains("scissors"))
		{
			System.out.println("3");
			Thread.sleep(1000);
			System.out.println("2");
			Thread.sleep(1000);
			System.out.println("1");
			Thread.sleep(1000);

			MV = (int) (Math.random() * 3);
			if (MV == 1)
			{
				System.out.println("You chose: scissors");
				System.out.println("I have chose:  rock");
				System.out.println("I WIN");
				CP ++;
				System.out.println("Your Points:" + UP + "");
				System.out.println("My points:  " + CP + "");
				Thread.sleep(2500);
				RPSLogic();
			}
			if (MV == 2)
			{
				System.out.println("You chose:  scissors");
				System.out.println("I have chose: paper");
				System.out.println("you win this time");
				UP ++;
				System.out.println("Your Points:" + UP + "");
				System.out.println("My points:  " + CP + "");
				Thread.sleep(2500);
				RPSLogic();
			}
			if (MV == 3)
			{
				System.out.println("You chose:    scissors");
				System.out.println("I have chose: scissors");
				System.out.println("it was a draw...");
				System.out.println("Your Points:" + UP + "");
				System.out.println("My points:  " + CP + "");
				Thread.sleep(2500);
				RPSLogic();
			}
		}
		if (answer.contains("restart"))
		{
			if(CP > UP)
			{
				System.out.println("you only did that because I am winning");
				Thread.sleep(2500);
				CP = 0;
				UP = 0;
				RPSLogic();
			}
			if(UP > CP)
			{
				System.out.println("Okay I am fine with that  ps you where beeting me by" + (UP - CP) + " but it to late now to change you mind");
				Thread.sleep(2500);
				CP = 0;
				UP = 0;
				RPSLogic();

			}
			else 
			{
				System.out.println("I couldent understand that so as punishment I am going to restart");
				RPSLogic();
			}
		}
			
	}

}