package example.cms.api.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BlogDto implements Serializable {
    private static final long serialVersionUID = -3940388258933569348L;
    private String id;
    private String userId;
    private String title;
    private String content;
    private long createdAt;
    private long updatedAt;
}
