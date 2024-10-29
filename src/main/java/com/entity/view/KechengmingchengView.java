package com.entity.view;

import com.entity.KechengmingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程名称
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
@TableName("kechengmingcheng")
public class KechengmingchengView  extends KechengmingchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengmingchengView(){
	}
 
 	public KechengmingchengView(KechengmingchengEntity kechengmingchengEntity){
 	try {
			BeanUtils.copyProperties(this, kechengmingchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
