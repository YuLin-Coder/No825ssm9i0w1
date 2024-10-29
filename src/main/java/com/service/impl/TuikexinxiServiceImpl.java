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


import com.dao.TuikexinxiDao;
import com.entity.TuikexinxiEntity;
import com.service.TuikexinxiService;
import com.entity.vo.TuikexinxiVO;
import com.entity.view.TuikexinxiView;

@Service("tuikexinxiService")
public class TuikexinxiServiceImpl extends ServiceImpl<TuikexinxiDao, TuikexinxiEntity> implements TuikexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuikexinxiEntity> page = this.selectPage(
                new Query<TuikexinxiEntity>(params).getPage(),
                new EntityWrapper<TuikexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuikexinxiEntity> wrapper) {
		  Page<TuikexinxiView> page =new Query<TuikexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuikexinxiVO> selectListVO(Wrapper<TuikexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuikexinxiVO selectVO(Wrapper<TuikexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuikexinxiView> selectListView(Wrapper<TuikexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuikexinxiView selectView(Wrapper<TuikexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
