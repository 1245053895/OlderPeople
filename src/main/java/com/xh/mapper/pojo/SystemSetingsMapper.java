
package com.xh.mapper.pojo;


import com.xh.po.vo.SystemSitings;
import org.springframework.stereotype.Component;


@Component
public interface SystemSetingsMapper {
  public void insertSystem(SystemSitings systemSitings);
}
