package com.github.tongjisserollman.iceamusementpark.transferobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mrcopytuo
 *
 * 员工业务对象
 */

public class WorkerBusinessObject {
    //private List<WorkerTransferObject> workers;
    private Map<Integer,WorkerTransferObject> workerMap;

    /**
     * WorkerBusinessObject构造器
     */
    public WorkerBusinessObject(){
        workerMap = new HashMap<Integer, WorkerTransferObject>();
        CallStackLogger.log(
                new CallStackLogInfo(
                        "WorkerBusinessObject",
                        "WorkerBusinessObject",
                        String.valueOf(System.identityHashCode(this)),
                        "WorkerBusinessObject构造器"
                )
        );
    }

    /**
     * 添加员工
     */
    public void addWorker(String name, int id){
        WorkerTransferObject worker = new WorkerTransferObject(name,id);
        workerMap.put(id,worker);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "WorkerBusinessObject",
                        "addWorker",
                        String.valueOf(System.identityHashCode(this)),
                        "添加员工"
                )
        );
    }

    /**
     * 移除员工
     */
    public void deleteWorker(WorkerTransferObject worker){
        workerMap.remove(worker.getId());
        CallStackLogger.log(
                new CallStackLogInfo(
                        "WorkerBusinessObject",
                        "deleteWorker",
                        String.valueOf(System.identityHashCode(this)),
                        "移除员工"
                )
        );
        System.out.println(worker.getName()+" 已经被移除");
    }

    /**
     * 获取员工表
     */
    public Map<Integer,WorkerTransferObject> getAllWorkers(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "WorkerBusinessObject",
                        "getAllWorkers",
                        String.valueOf(System.identityHashCode(this)),
                        "获取员工表"
                )
        );
        return workerMap;
    }

    /**
     * 获取员工信息
     */
    public WorkerTransferObject getWorker(int id){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "WorkerBusinessObject",
                        "getWorkers",
                        String.valueOf(System.identityHashCode(this)),
                        "获取员工信息"
                )
        );
        return workerMap.get(id);
    }

    /**
     * 更新员工数据
     */
    public void updateWorker(WorkerTransferObject worker){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "WorkerBusinessObject",
                        "getWorkers",
                        String.valueOf(System.identityHashCode(this)),
                        "更新员工数据"
                )
        );
        workerMap.put(worker.getId(),worker);
        System.out.println("员工数据已更新");
    }
}
