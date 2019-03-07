package com.ax.service;
import java.util.List;

import com.ax.entity.PageResult;
import com.ax.pojo.TbComment;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CommentService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbComment> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbComment comment);
	
	
	/**
	 * 修改
	 */
	public void update(TbComment comment);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbComment findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbComment comment, int pageNum, int pageSize);
	
}
