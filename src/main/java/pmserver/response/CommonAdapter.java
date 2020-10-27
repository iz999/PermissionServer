package pmserver.response;

import java.util.HashMap;
import java.util.List;

public class CommonAdapter {

    public static PermissionServerResponse getPermissionServerResponse(HashMap<String, String> permission, List<String> errors) {
    	
    	return new PermissionServerResponse(permission, errors);
    }    
}