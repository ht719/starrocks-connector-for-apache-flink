package com.starrocks.connector.flink.table.sink;

import com.starrocks.connector.flink.manager.StarRocksDynamicSinkManager;
import com.starrocks.connector.flink.manager.StarRocksSinkManager;
import org.apache.flink.runtime.state.FunctionInitializationContext;
import org.apache.flink.runtime.state.FunctionSnapshotContext;

public class StarRocksDynamicColumnSinkFunction<T extends StarRocksSinkDynamicRowDataWithMeta>
        extends StarRocksDynamicSinkFunction<T> {

    public StarRocksDynamicColumnSinkFunction(StarRocksSinkOptions sinkOptions, StarRocksDynamicSinkManager sinkManager) {
        super(sinkOptions, sinkManager);
    }

    @Override
    public void notifyCheckpointComplete(long l) throws Exception {

    }

    @Override
    public void snapshotState(FunctionSnapshotContext functionSnapshotContext) throws Exception {

    }

    @Override
    public void initializeState(FunctionInitializationContext functionInitializationContext) throws Exception {

    }
}
