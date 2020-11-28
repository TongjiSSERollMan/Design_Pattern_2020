package com.github.tongjisserollman.iceamusementpark.base.bus.objectpool;

public class ExportingProcess {
    private long processNo;

    public ExportingProcess(long processNo) {
        this.processNo = processNo;
        System.out.println("编号为" + processNo + "的观光车已经准备好了。");
    }

    public long getProcessNo() {
        return processNo;
    }
}// End of the ExportingProcess class.