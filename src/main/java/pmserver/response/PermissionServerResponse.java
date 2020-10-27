package pmserver.response;

import java.util.HashMap;
import java.util.List;

public class PermissionServerResponse extends CommonResponse<HashMap<String, String>>{
	
    public PermissionServerResponse(HashMap<String, String> dataSendResult, List<String> errors) {
        this.setData(dataSendResult);
        this.setErrors(errors);
    }
}
