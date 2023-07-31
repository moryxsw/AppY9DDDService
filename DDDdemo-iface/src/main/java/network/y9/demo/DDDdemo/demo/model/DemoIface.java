package network.y9.demo.DDDdemo.demo.model;

import network.y9.demo.DDDdemo.demo.model.request.DemoRequest;
import network.y9.demo.DDDdemo.dto.Result;

/**
 * DemoIface
 *
 * @author moryxsw
 * @since 2023/2/21
 */
public interface DemoIface {


    Result<String> getString(DemoRequest request);

}
