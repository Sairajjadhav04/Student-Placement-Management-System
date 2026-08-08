package com.studentplacement.dao;
import com.studentplacement.model.Placement;
public class PlacementDaoTest {
    public static void main(String[] args) {
        PlacementDao placementDao = new PlacementDao();
        System.out.println("\n\tADD PLACEMENTS");
        Placement placement1 = new Placement(
                501,
                101,
                201,
                "TCS",
                "Mumbai",
                7.5,
                "Software Developer",
                "Selected"
        );
        Placement placement2 = new Placement(
                502,
                102,
                202,
                "Infosys",
                "Pune",
                8.0,
                "Java Developer",
                "Selected"
        );
        Placement placement3 = new Placement(
                503,
                103,
                203,
                "Accenture",
                "Mumbai",
                9.0,
                "Data Analyst",
                "Selected"
        );
        placementDao.addPlacement(placement1);
        placementDao.addPlacement(placement2);
        placementDao.addPlacement(placement3);
        System.out.println("\n\tALL PLACEMENTS ");
        placementDao.DisplayAllPlacements();
        System.out.println("\nSEARCH PLACEMENT ");
        placementDao.displayPlacementById(502);
        System.out.println("\n===== UPDATE PLACEMENT =====");
        placementDao.updatePlacement(
                502,
                102,
                202,
                "Infosys",
                "10/07/2026",
                "Joined"
        );
        placementDao.displayPlacementById(502);
        System.out.println("\n===== DELETE PLACEMENT =====");
        placementDao.deletePlacement(503);
        System.out.println("\n===== PLACEMENTS AFTER DELETE =====");
        placementDao.DisplayAllPlacements();
    }
}
