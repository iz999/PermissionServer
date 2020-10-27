package pmserver.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pmserver.dao.CommonDAO;

@Service
public class PermissionServerServiceImpl implements PermissionServerService {
	
	@Autowired
	private CommonDAO commonDAO;
	
	public String getPlatfromPermission(HashMap<String, String> requestParam) {
		return commonDAO.selectPlatformPermission(requestParam);
	}
}
