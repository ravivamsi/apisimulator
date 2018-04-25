/**
 * 
 */
package com.api.mock.simulator.databaseModel;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author vamsiravi
 *
 */
@Repository
public interface MockMasterRepository extends JpaRepository<MockMaster, UUID>{

	List<MockMaster> findByPath(String path);
	
	MockMaster findByUuid(UUID uuid);
	
}
