package com.buer.edusys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buer.edusys.mapper.StudentMapper;
import com.buer.edusys.pojo.entity.StudentDO;
import com.buer.edusys.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, StudentDO> implements IStudentService {

}
