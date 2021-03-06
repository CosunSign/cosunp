package com.cosun.cosunp.service;

import com.cosun.cosunp.entity.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IProjectServ {

    List<ProjectHead> totalProjectNumByEmpNo(String empNo) throws Exception;

    List<ProjectHead> totalProjectNumBy() throws Exception;

    ProjectHeadOrderItem getProjectOrderItemById(Integer id) throws Exception;

    List<DaysSet> getDaysSetNew() throws Exception;

    List<ProjectHeadOrder> getTotalProjectOrderByName(String userid,String projectName) throws Exception;

    List<ProjectHeadOrderItem> getTotalProjectOrderITEMByOrderS(String c,String userid, String orderNo) throws Exception;

    String returnNameByEmpNoStr(String empNoStr) throws Exception;

    List<Employee> findAllProjectSalorByDeptName() throws Exception;

    int findAllProjecHOICount() throws Exception;

    List<ProjectHeadOrderItem> findAllProjecHOI(ProjectHeadOrderItem item) throws Exception;

    List<ProjectHeadOrderItem> queryProjectOrderItemByCondition(ProjectHeadOrderItem item) throws Exception;

    int queryProjectOrderItemByConditionCount(ProjectHeadOrderItem item) throws Exception;

    List<String> getAllCustomerName() throws Exception;

    List<String> getAllProjectName() throws Exception;

    List<Employee> findAllProjectSalorByDeptName1() throws Exception;

    List<String> getAllOrderNoList() throws Exception;

    ProjectHeadOrderItem getTotalProjectOrderITEMMoreByOrderS(String userid,String projectName, String customer_Name,String productName) throws Exception;

    ProjectHeadOrderItem getTotalProjectOrderITEMMoreById(Integer id) throws Exception;

    int findNameRepeatOrNot(String userid, String projectName) throws Exception;

    void saveProjectByNameAndRemark(String userid, String projectName,String remark) throws Exception;

    List<China> getAllMainProvince() throws Exception;

    void translateTabletoEmployeeBeanProject(MultipartFile file) throws Exception;

    ProjectHeadOrder checkOrderNoRepeat(String projectName,String customerName,String userId,String orderNo) throws Exception;

    ProjectHead findPHbyName(String projectName,String userId) throws Exception;

    void saveProjectHeadByBean(Integer provinceId,String userId,String orderNo,String customerName,
                               String projectName,Integer id,Integer newOrOld) throws Exception;

    ProjectHeadOrderItem checkProductRepeatForOneOrder(Double hetongMoney,String orderNo,String productName) throws Exception;

    ProjectHeadOrder findPHObyOrderNo(String orderNo) throws Exception;

    void updateAlertSet(AlertSet as) throws Exception;

    ProjectHeadOrderItem saveOrderItemMor(Integer id,ProjectHeadOrderItem phoi) throws Exception;

    List<String> getNamesByEmpNos(List<String> nameStr) throws Exception;

    List<Leave> getAllLeaveDataByBeBoreDayApply(String day) throws Exception;

    List<ProjectHeadOrderItem> getProjectItemAllByCondi() throws Exception;

    List<ProjectHeadOrderItem> getProjectItemAllByCondi2() throws Exception;

    List<ProjectHeadOrderItem> getItemListByOrderStatusAndCheckAndEmpnoIn(String empNo) throws Exception;

    void saveOrderItemMorOld(Integer id,ProjectHeadOrderItem phoi) throws Exception;

    List<String> getUserIdByEmpNos(List<String> empNoList) throws Exception;

    void updateProjectItemByBeanOnlyDateAndNote(ProjectHeadOrderItem item) throws Exception;

    ProjectHeadOrder getProjectOrderByOrderNo(String projectName,String customerName,String orderNo) throws Exception;

    AlertSet getAlertSet() throws Exception;

    List<Position> getAllAlertPositions() throws Exception;

    void updateOrderNoRepeat(ProjectHeadOrder pho) throws Exception;

    void updateAlertSet1(DaysSet ds) throws Exception;

    void updateAlertSet2(DaysSet ds) throws Exception;

    void updateProjectHeadOrderItem(ProjectHeadOrderItem phoi) throws Exception;

    void saveHereMoneyBYItemId(ProjectItemMoneyRecord pho) throws Exception;

    void deleteProjectRecordById(Integer id) throws Exception;

    void updateProjectRecordByBean(ProjectItemMoneyRecord record)  throws Exception;

    String getUserNameByUserId(String userId) throws Exception;

    ProjectItemMoneyRecord getProjectRecordById(Integer id) throws Exception;

    void updatePHOIMoney(Integer itemId,Double hereMoney) throws Exception;

    List<ProjectItemMoneyRecord> getTotalProjectOrderMoneyRecordByNo(String orderNo) throws Exception;

    void saveProjectHeadItemByBean(Double hetongMoney,Integer id,String productName,String totalBao,String date) throws Exception;

    void deleteProjectDetai(String projectName,String userid) throws Exception;

    void deleteProjectDetaiItem(Integer id,String userid) throws Exception;

    int getCustomerNameByNameAndOrderNo(ProjectHeadOrder pho) throws Exception;

    ProjectHead getProjectByName(ProjectHead ph) throws Exception;

    int findNameRepeatOrNot2(ProjectHead ph) throws Exception;

    void updateProjectByNameAndRemark(ProjectHead ph) throws Exception;

    void updateProjectOrderItemByNameAndRemark(ProjectHeadOrderItem phoi) throws Exception;

    void deleteProjectDetai2(String orderNo,String userId) throws Exception;

    List<Employee> getSalorMItems() throws Exception;

    List<Employee> getSheJiItems() throws Exception;

    List<Employee> getAnzhuangList() throws Exception;

    List<ProjectHeadOrderItem> getAllItemByUserIdAndNoFinish(String userId) throws Exception;

    List<ProjectHeadOrderItem> getAllItemByUserIdAndNoFinish2(String userId) throws Exception;

    List<Employee> getYeWuList() throws Exception;

    Integer getUserActorByUserId(String userId) throws Exception;

    String getEmpNoByUserId(String userId) throws Exception;

    List<ProjectHeadOrderItem> getHistoryItemByProduct_NameAndOrderNo(String product_Name,String orderNo,String projectName,String customerName) throws Exception;

    List<Employee> getGenDanItems() throws Exception;

    List<ProjectHeadOrderItem> getTotalProjectOrderITEMByOrderSAll() throws Exception;

    List<ProjectHead> getProjectBySearch(String projectName) throws Exception;

    ProjectHeadOrderItem getProjectItemHistoryById(Integer id) throws Exception;

    List<ProjectHeadOrderItem> getAllitemList() throws Exception;

    void updateProjectItemCheckById(Integer id,int checked) throws Exception;

    ProjectHeadOrderItem getProjectOrderItemByOrderNoAndProductName(ProjectHeadOrderItem phoi) throws Exception;

    ProjectHeadOrder getProjectOrderById(Integer id) throws Exception;

    DaysSet getDaysSetByType(int type) throws Exception;

    List<String> getFaDingList() throws Exception;

}
