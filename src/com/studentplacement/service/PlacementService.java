package com.studentplacement.service;
import com.studentplacement.dao.PlacementDao;
import com.studentplacement.model.Placement;
public class PlacementService {
    private PlacementDao pd;
    public PlacementService() {
        pd = new PlacementDao();
    }
    public void addPlacement(Placement placement) {
        pd.addPlacement(placement);
    }
    public void displayAllPlacements() {
        pd.DisplayAllPlacements();
    }
    public void displayPlacementById(int placementId) {
        pd.displayPlacementById(placementId);
    }
    public void updatePlacement(int placementId, int companyId, int studentId,
                                String companyName, String jobRole,
                                double salary, String status, String date) {
        pd.updatePlacement(placementId, companyId, studentId,
                companyName, jobRole, salary, status, date);
    }
    public void deletePlacement(int placementId) {
        pd.deletePlacement(placementId);
    }
}