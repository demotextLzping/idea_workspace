package com.lzp.mapper;

import com.lzp.pojo.Emp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EmpMapper {

    List<Emp> selectEmpBySaleName (Emp emp)throws  Exception;
    List<Emp>  LikeSelectEmpBySaleName (Emp emp)throws  Exception;
    List<Emp>  LikeSelectEmpBySaleName2 (Emp emp)throws  Exception;
    List<Emp>  LikeSelectEmpBySaleName3 (Emp emp)throws  Exception;
    List<Emp>  LikeSelectEmpBySaleName4 (Emp emp)throws  Exception;
    List<Emp>  LikeSelectEmpByInfo (Emp emp)throws  Exception;

    List<Emp>  LikeSelectEmpByInfo2 (Emp emp)throws  Exception;

    int insertEmp(Emp emo) throws  Exception;

    int  updateEmp(Emp emp )throws Exception;

    List<Emp>  selectEmpByForeach (List<Integer> list)throws  Exception;
    List<Emp>  selectEmpByForeach2 (int[]array)throws  Exception;

    List<Emp>  selectEmpByForeach3 (Map<String,List<Integer>> map)throws  Exception;
    List<Emp>  selectEmpByMapInfo(Map<String,Object> map)throws  Exception;


}