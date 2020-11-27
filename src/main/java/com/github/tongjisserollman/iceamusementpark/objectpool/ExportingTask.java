package com.github.tongjisserollman.iceamusementpark.objectpool;

public class ExportingTask implements Runnable {
    private BusPool<ExportingProcess> pool;
    private int threadNo;

    public ExportingTask(BusPool<ExportingProcess> pool, int threadNo) {
        this.pool = pool;
        this.threadNo = threadNo;
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("游览线路" + threadNo + ": 编号为 "
                + exportingProcess.getProcessNo() + " 的观光车出发。");

        // return ExportingProcess instance back to the pool
        pool.returnObject(exportingProcess);

        System.out.println("游览线路" + threadNo + ": 编号为 "
                + exportingProcess.getProcessNo() + " 的观光车已归还。");
    }
}
