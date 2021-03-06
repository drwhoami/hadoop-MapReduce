package chainmap;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MapperA extends Mapper<LongWritable, Text, Text, IntWritable>
{
    @Override
    public void map(LongWritable key, Text value, Context con)throws IOException, InterruptedException
    {
        String[] Cname = value.toString().trim().split(",");
        for(String name:Cname)
        {
            con.write(new Text(name),new IntWritable(1));
        }
    }
}
