package it.unipd.vulnus.web.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.inject.Model;

import it.unipd.vulnus.dto.BuildingMaterialDTO;
import it.unipd.vulnus.eao.BuildingMaterialEAO;


@Model
public class BuildingMaterialBean {
    
    @EJB
    private BuildingMaterialEAO registry;
    
    private List<BuildingMaterialDTO> buildingMaterialList;
    
    private BuildingMaterialDTO currentBuildingMaterial;
    
    @PostConstruct
    public void init(){
        buildingMaterialList = registry.getBuildingMaterialList();
        currentBuildingMaterial = new BuildingMaterialDTO();
    }

    public List<BuildingMaterialDTO> getBuildingMaterialList() {
        System.out.println("listing materials...");
        return buildingMaterialList;
    }

    public void setBuildingMaterialList(List<BuildingMaterialDTO> buildingMaterialList) {
        this.buildingMaterialList = buildingMaterialList;
    }

    public BuildingMaterialDTO getCurrentBuildingMaterial() {
        if(currentBuildingMaterial==null) {
            currentBuildingMaterial = new BuildingMaterialDTO();
        }
        return currentBuildingMaterial;
    }

    public void setCurrentBuildingMaterial(BuildingMaterialDTO currentBuildingMaterial) {
        this.currentBuildingMaterial = currentBuildingMaterial;
    }
    
    public void register() {
        registry.addBuildingMaterial(currentBuildingMaterial);
    }
    
}
