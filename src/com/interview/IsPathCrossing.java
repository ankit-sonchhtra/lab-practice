package com.interview;

import java.util.HashSet;
import java.util.Set;

public class IsPathCrossing {
    public static void main(String[] args) {
        System.out.println(isPathCrossing("NESWW"));
        System.out.println(isPathCrossing("NES"));
    }
    public static boolean isPathCrossing(String path) {
        Set<String> visitedPoints = new HashSet<>();
        int currentX = 0, currentY = 0;
        visitedPoints.add(currentX + "," + currentY);
        for (Character x : path.toCharArray()) {
            if (x == 'N') currentY++;
            else if (x == 'S') currentY--;
            else if (x == 'E') currentX++;
            else currentX--;

            String point = currentX + "," + currentY;
            if (visitedPoints.contains(point)) return true;
            visitedPoints.add(point);
        }
        return false;
    }
}



