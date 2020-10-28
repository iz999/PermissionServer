package pmserver.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pmserver.mapper.CommonMapper;

@Service //서비스 빈으로 등록
public class PermissionServerServiceImpl implements PermissionServerService { //서비스 인터페이스를 정의하고 구현하는 패턴을 취한다.
	
	@Autowired
	private CommonMapper commonDAO;
	
	public String getPlatfromPermission(HashMap<String, String> requestParam) {
		return commonDAO.selectPlatformPermission(requestParam);
	}
}
