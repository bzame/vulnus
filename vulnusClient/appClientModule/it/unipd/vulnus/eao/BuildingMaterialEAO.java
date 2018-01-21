package it.unipd.vulnus.eao;

import java.util.List;

import it.unipd.vulnus.dto.BuildingMaterialDTO;

public interface BuildingMaterialEAO {

    /**
     * Returns the list of all the available building materials.
     * @return the list of all the available building materials.
     */
    List<BuildingMaterialDTO> getBuildingMaterialList();

    /**
     * Registers a new building material if no other material with the same name exists.
     * @param buildingMaterial the material to be registered. 
     * @return <code>true</code> if no other material with the same name exists, <code>false</code> otherwise.
     */
    boolean addBuildingMaterial(BuildingMaterialDTO buildingMaterial);

    /**
     * Removes the specified building material from the catalog if it exists and if has never been used.
     * @param buildingMaterial the material to be unregistered.
     * @return <code>true</code> if the material exists and it is not used, <code>false</code> otherwise.
     */
    boolean removeBuildingMaterial(BuildingMaterialDTO buildingMaterial);

    /**
     * Update an existing building material.
     * @param buildingMaterial the material to be updated.
     * @return <code>true</code> if the material exists, <code>false</code> otherwise.
     */
    boolean updateBuildingMaterial(BuildingMaterialDTO buildingMaterial);

}
