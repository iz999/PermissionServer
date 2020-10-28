package pmserver.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pmserver.mapper.CommonMapper;

@Service //���� ������ ���
public class PermissionServerServiceImpl implements PermissionServerService { //���� �������̽��� �����ϰ� �����ϴ� ������ ���Ѵ�.
	
	@Autowired
	private CommonMapper commonDAO;
	
	public String getPlatfromPermission(HashMap<String, String> requestParam) {
		return commonDAO.selectPlatformPermission(requestParam);
	}
}
