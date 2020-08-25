package com.funnylog.id.server.api;

/**
 * @author FangYunLong
 * on 2020/8/24
 */
public interface DistributedIdApi {

    /**
     * 号段模式获取id
     * @param key key
     * @return id
     */
    Long getSegmentId(String key);

    /**
     * 获取snowflake模式id
     *
     * 官方: 注意现在leaf使用snowflake模式的情况下 其获取ip的逻辑直接取首个网卡ip【
     *      特别对于会更换ip的服务要注意】避免浪费workId
     *
     * @param key 业务key
     * @return id
     */
    Long getSnowflakeId(String key);
}
