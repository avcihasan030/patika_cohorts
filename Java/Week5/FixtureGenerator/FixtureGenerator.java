package FixtureGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {

    private List<String> teams;
    private List<List<String>> fixtureTable;

    public FixtureGenerator(List<String> teams) {
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }
        this.teams = teams;
        this.fixtureTable = new ArrayList<>();
    }

    public void generateFixture() {
        int totalWeeks = teams.size() - 1;

        for (int week = 0; week < totalWeeks * 2; week++) {
            List<String> matches = new ArrayList<>();

            for (int i = 0; i < teams.size() / 2; i++) {
                String homeTeam = teams.get(i);
                String awayTeam = teams.get(teams.size() - 1 - i);
                if (!homeTeam.equals("Bay") && !awayTeam.equals("Bay")) {
                    if (week % 2 == 0) {
                        matches.add(homeTeam + " vs " + awayTeam);
                    } else {
                        matches.add(awayTeam + " vs " + homeTeam);
                    }
                }
            }

            Collections.shuffle(matches);
            fixtureTable.add(matches);

            rotateTeams();
        }
    }

    private void rotateTeams() {
        String lastTeam = teams.remove(teams.size() - 1);
        teams.add(1, lastTeam);
    }

    public void displayFixture() {
        System.out.println("Fixture Table:");
        for (int week = 0; week < fixtureTable.size(); week++) {
            System.out.println("Week " + (week + 1) + ":");
            for (String match : fixtureTable.get(week)) {
                System.out.println(match);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Manchester City");
        teams.add("Juventus");
        teams.add("Liverpool");
        teams.add("Barcelona");
        teams.add("Paris Saint Germain");
        teams.add("Borussia Dortmund");

        FixtureGenerator fixtureGenerator = new FixtureGenerator(teams);
        fixtureGenerator.generateFixture();
        fixtureGenerator.displayFixture();
    }
}
