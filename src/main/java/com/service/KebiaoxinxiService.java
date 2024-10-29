package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KebiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KebiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KebiaoxinxiView;


/**
 * 课表信息
 *
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
public interface KebiaoxinxiService extends IService<KebiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KebiaoxinxiVO> selectListVO(Wrapper<KebiaoxinxiEntity> wrapper);
   	
   	KebiaoxinxiVO selectVO(@Param("ew") Wrapper<KebiaoxinxiEntity> wrapper);
   	
   	List<KebiaoxinxiView> selectListView(Wrapper<KebiaoxinxiEntity> wrapper);
   	
   	KebiaoxinxiView selectView(@Param("ew") Wrapper<KebiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KebiaoxinxiEntity> wrapper);
   	
}

