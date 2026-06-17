import java.util.*;

class FootballTeamHeights {
    public int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    public int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    public int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int h : heights) {
            if (h < shortest) {
                shortest = h;
            }
        }
        return shortest;
    }

    public int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int h : heights) {
            if (h > tallest) {
                tallest = h;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        FootballTeamHeights team = new FootballTeamHeights();
        int[] heights = team.generateHeights();
        System.out.println("Team Heights: " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + team.findShortest(heights) + " cms");
        System.out.println("Tallest Height: " + team.findTallest(heights) + " cms");
        System.out.printf("Mean Height: %.2f cms\n", team.calculateMean(heights));
    }
}