package com.studentplacement.dao;
import com.studentplacement.model.Placement;

import java.util.ArrayList;
import java.util.Arrays;
public class PlacementDao {
    private ArrayList <Placement> PlacementList = new ArrayList<>();
    public void addPlacement(Placement p)
    {
        PlacementList.add(p);
        System.out.println("Placement added successfully !");
    }
    public void DisplayAllPlacements ()
    {
        if (PlacementList.isEmpty())
        {
            System.out.println("No Placement records");
            return;
        }
        else
        {
           for (Placement placement : PlacementList)
           {
            System.out.println(placement);
           }
        }
    }
    // Display Particular Placement
    public void displayPlacementById(int placementId) {
        for (Placement placement : PlacementList) {
            if (placement.getPlacement_id() == placementId) {
                System.out.println(placement);
                return;
            }
        }
        System.out.println("Placement not found.");
    }
    // Update Placement
    public void updatePlacement(int placementId,
                                int studentId,
                                int companyId,
                                String companyName,
                                String jobrole,
                                double salary,
                                String placementDate,
                                String status) {
        for (Placement placement : PlacementList) {
            if (placement.getPlacement_id() == placementId) {
                placement.setStudent_id(studentId);
                placement.setCompany_id(companyId);
                placement.setCompanyName(companyName);
                placement.setJobRole(jobrole);
                placement.setSalary(salary);
                placement.setPlacementDate(placementDate);
                placement.setPlacement_status(status);
                System.out.println("Placement updated successfully.");
                return;
            }
        }
        System.out.println("Placement not found.");
    }
    // Delete Placement
    public void deletePlacement(int placementId) {
        for (Placement placement : PlacementList) {
            if (placement.getPlacement_id() == placementId) {
                PlacementList.remove(placement);
                System.out.println("Placement deleted successfully.");
                return;
            }
        }
        System.out.println("Placement not found.");
    }
}