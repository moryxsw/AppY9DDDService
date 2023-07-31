package network.y9.demo.DDDdemo.iface;

import network.y9.demo.DDDdemo.demo.model.DemoIface;
import network.y9.demo.DDDdemo.demo.model.request.DemoRequest;
import network.y9.demo.DDDdemo.dto.Result;
import org.springframework.stereotype.Service;

/**
 * DemoIfaceImpl
 *
 * @author moryxsw
 * @since 2023/2/21
 */
@Service
public class DemoIfaceImpl implements DemoIface {

    @Override
    public Result<String> getString(DemoRequest request) {
        return null;
    }
}
