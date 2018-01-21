package it.unipd.vulnus.eao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import it.unipd.vulnus.dto.BuildingMaterialDTO;
import it.unipd.vulnus.entity.BuildingMaterial;

/**
 * @author Zamengo Bruno
 *
 */
@Stateless
public class BuildingMaterialEAOImpl implements BuildingMaterialEAO {

    @PersistenceContext
    private EntityManager em;
    
    @SuppressWarnings("unchecked")
    @Override
    public List<BuildingMaterialDTO> getBuildingMaterialList() {
        Query query = em.createNamedQuery("BuildingMaterial.findAll", BuildingMaterial.class);
        return BuildingMaterial.toDTOList(query.getResultList());
    }
    
    @Override
    public boolean addBuildingMaterial(BuildingMaterialDTO buildingMaterial) {
        Query queryId = em.createNamedQuery("BuildingMaterial.findById", BuildingMaterial.class);
        Query queryName = em.createNamedQuery("BuildingMaterial.findByName", BuildingMaterial.class);
        queryId.setParameter("id", buildingMaterial.getId());
        queryId.setParameter("name", buildingMaterial.getName());
        if(queryId.getResultList().isEmpty() && queryName.getResultList().isEmpty()) {
            em.persist(new BuildingMaterial(buildingMaterial));
            return true;
        } else {
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public boolean removeBuildingMaterial(BuildingMaterialDTO buildingMaterial) {
        Query query = em.createNamedQuery("BuildingMaterial.findById", BuildingMaterial.class);
        query.setParameter("id", buildingMaterial.getId());
        if(!query.getResultList().isEmpty()) {
            for(BuildingMaterial rm : (List<BuildingMaterial>)query.getResultList()) {
                em.detach(rm);
            }
            return true;
        } else {
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public boolean updateBuildingMaterial(BuildingMaterialDTO buildingMaterial) {
        Query query = em.createNamedQuery("BuildingMaterial.findById", BuildingMaterial.class);
        query.setParameter("id", buildingMaterial.getId());
        if(!query.getResultList().isEmpty()) {
            for(BuildingMaterial upd : (List<BuildingMaterial>)query.getResultList()) {
                upd.fromDTO(buildingMaterial);
                em.merge(upd);
            }
            return true;
        } else {
            return false;
        }
    }

}
