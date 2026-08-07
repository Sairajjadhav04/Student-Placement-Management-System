package com.studentplacement.model;

public class PlacementTest {

    public static void main(String[] args) {
        Placement placement = new Placement(
                101,
                1,
                "TCS",
                "Java Developer",
                6.5,
                "Selected"
        );

        placement.display();

    }
}