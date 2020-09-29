package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(rps("rock", "rock"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "paper"));
    }
    public static String rps(String player1, String player2)
    {
        if (player1 == "rock" && player2 == "scissors" || player1 == "paper" && player2 == "rock" || player1 == "scissors" && player2 == "paper")
            return "Player 1 wins";
        if (player2 == "rock" && player1 == "scissors" || player2 == "paper" && player1 == "rock" || player2 == "scissors" && player1 == "paper")
            return "Player 2 wins";
        return "TIE";
    }
}
