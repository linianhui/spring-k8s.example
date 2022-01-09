package example.cms.rpc.api;

import java.util.List;

import example.cms.rpc.api.dto.BlogRpcDto;

public interface BlogRpcClient {
    BlogRpcDto getById(String blogId);

    List<BlogRpcDto> getByUserId(String userId);
}
