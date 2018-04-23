package cn.licoy.wdog.core.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permission implements Serializable  {

    @TableId
    private Long id;
    private String name;
    private String permission;
    private String type;
    private String url;
    private Long fid;
    private Long sort;

    private static final long serialVersionUID = 1L;

}