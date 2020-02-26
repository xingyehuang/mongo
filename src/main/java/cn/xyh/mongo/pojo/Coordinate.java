package cn.xyh.mongo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 坐标信息
 *
 * @author hatim
 */
@Data
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Coordinate {

    /**
     * 经度
     */
    @ApiModelProperty(value = "经度")
    private Double longitude;
    /**
     * 纬度
     */
    @ApiModelProperty(value = "纬度")
    private Double latitude;
    /**
     * 地点名称
     */
    @ApiModelProperty(value = "地点名称")
    private String name;
    /**
     * 坐标时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "坐标时间")
    private Date time;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

}
