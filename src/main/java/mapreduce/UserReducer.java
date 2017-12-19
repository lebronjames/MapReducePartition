package mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * 计算用户的年收数据信息
* 
* 
 */
public class UserReducer extends Reducer<UserEntity, NullWritable, UserEntity, NullWritable>{

	@Override
	protected void reduce(UserEntity userEntity, Iterable<NullWritable> values,
			Reducer<UserEntity, NullWritable, UserEntity, NullWritable>.Context context)
			throws IOException, InterruptedException {
		
		// 年收入 = 月收入 * 12  四舍五入  
        String yearIncome = String.format("%.2f", userEntity.getMonthIncome() * 12); 
        userEntity.setYearIncome(Double.parseDouble(yearIncome));  
        context.write(userEntity, NullWritable.get());  
	}

}
