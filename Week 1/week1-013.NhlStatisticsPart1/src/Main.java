import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

//        Print the top ten players based on goals
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

//        Print the top 25 players based on penalty amounts
        System.out.println("Top twenty five by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

//        Print the statistics for Sidney Crosby
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");


//        Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
        System.out.println("Statistics for the Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI"); // default sorts them by penalties


//        Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
        System.out.println("Players in Anaheim Ducks ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");




    }
}
