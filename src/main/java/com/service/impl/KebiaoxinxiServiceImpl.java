package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KebiaoxinxiDao;
import com.entity.KebiaoxinxiEntity;
import com.service.KebiaoxinxiService;
import com.entity.vo.KebiaoxinxiVO;
import com.entity.view.KebiaoxinxiView;

@Service("kebiaoxinxiService")
public class KebiaoxinxiServiceImpl extends ServiceImpl<KebiaoxinxiDao, KebiaoxinxiEntity> implements KebiaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KebiaoxinxiEntity> page = this.selectPage(
                new Query<KebiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<KebiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KebiaoxinxiEntity> wrapper) {
		  Page<KebiaoxinxiView> page =new Query<KebiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KebiaoxinxiVO> selectListVO(Wrapper<KebiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KebiaoxinxiVO selectVO(Wrapper<KebiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KebiaoxinxiView> selectListView(Wrapper<KebiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KebiaoxinxiView selectView(Wrapper<KebiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
