package wyz.jingangHotel02.ssm.autoMapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wyz.jingangHotel02.ssm.autoPo.Comments;
import wyz.jingangHotel02.ssm.autoPo.CommentsExample;
import wyz.jingangHotel02.ssm.autoPo.CommentsWithBLOBs;

public interface CommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int countByExample(CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int deleteByExample(CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int insert(CommentsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int insertSelective(CommentsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    List<CommentsWithBLOBs> selectByExampleWithBLOBs(CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    List<Comments> selectByExample(CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    CommentsWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByExampleSelective(@Param("record") CommentsWithBLOBs record, @Param("example") CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByExampleWithBLOBs(@Param("record") CommentsWithBLOBs record, @Param("example") CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByExample(@Param("record") Comments record, @Param("example") CommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByPrimaryKeySelective(CommentsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByPrimaryKeyWithBLOBs(CommentsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    int updateByPrimaryKey(Comments record);
}