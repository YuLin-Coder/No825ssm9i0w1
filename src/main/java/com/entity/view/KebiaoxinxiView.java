package com.entity.view;

import com.entity.KebiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课表信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
@TableName("kebiaoxinxi")
public class KebiaoxinxiView  extends KebiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KebiaoxinxiView(){
	}
 
 	public KebiaoxinxiView(KebiaoxinxiEntity kebiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kebiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
