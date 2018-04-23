/**
 * 
 */
package com.api.mock.simulator.databaseModel;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author vamsiravi
 *
 */
public interface MockMasterRepository extends JpaRepository<MockMaster, Long>{

	List<MockMaster> findByPath(String path);
	
	MockMaster findByUuid(UUID uuid);
	
}
