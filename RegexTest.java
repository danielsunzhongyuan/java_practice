import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexTest
{
    public static void main(String[] args)
    {
        String s = "hdfs://localhost:54330/data/transactions/2015/01/07/00/2015010700-38;9;2147483648.gz.parquet";
        Pattern p = Pattern.compile(":\\d+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println("matcher.group() :" + m.group() + " starting at index \"" + m.start() + "\" and ending at index \"" + m.end() + "\"");
            //System.out.println("matcher.group(1) :" + m.group(1));
            //System.out.println("matcher.group(2) :" + m.group(2));
            System.out.println("matcher.groupCount():" + m.groupCount());
        }
        String r = s.replaceAll(":\\d+", "");
        System.out.println(r);
    }
}
