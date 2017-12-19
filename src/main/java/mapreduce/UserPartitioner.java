package mapreduce;

import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.lib.partition.HashPartitioner;

/**
 * 继承抽象类Partitioner，实现自定义的getPartition()方法 
 * 通过job.setPartitionerClass()来设置自定义的Partitioner； 
 * 
* Partitioner用于划分键值空间（key space）。 
 * Partitioner组件可以让Map对Key进行分区，从而可以根据不同的key来分发到不同的reduce中去处理。 
 * 分区的数量与一个作业的reduce任务的数量是一样的。 
 * 它控制将中间过程的key（也就是这条记录）应该发送给m个reduce任务中的哪一个来进行reduce操作。 
 * HashPartitioner是默认的 Partitioner。 
 */
public class UserPartitioner extends HashPartitioner<UserEntity, NullWritable> {

	// 声明providerMap，并且在static静态块中初始化  
    private static Map<String, Integer> providerMap = new HashMap<String, Integer>(); 
    
    static {  
        providerMap.put("130", 0);  
        providerMap.put("133", 0);  
        providerMap.put("134", 0);  
        providerMap.put("135", 0);  
        providerMap.put("136", 0);  
        providerMap.put("137", 0);  
        providerMap.put("138", 0);  
        providerMap.put("139", 0);  
        providerMap.put("150", 1);  
        providerMap.put("151", 1);  
        providerMap.put("153", 1);  
        providerMap.put("158", 1);  
        providerMap.put("159", 1);  
        providerMap.put("170", 2);  
        providerMap.put("180", 3);  
        providerMap.put("181", 3);  
        providerMap.put("183", 3);  
        providerMap.put("185", 3);  
        providerMap.put("186", 3);  
        providerMap.put("187", 3);  
        providerMap.put("188", 3);  
        providerMap.put("189", 3);  
    }  
    
    /** 
     * 实现自定义的getPartition()方法,自定义分区规则 
     */  
    @Override  
    public int getPartition(UserEntity key, NullWritable value, int numPartitions) {  
        String prefix = key.getTelphone().substring(0, 3);  
        return providerMap.get(prefix);  
    } 
}
