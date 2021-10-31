package offer.easy;

//左旋转字符串
class Solution1{
    String reverseLeftWords(String s,int n){
        StringBuilder res=new StringBuilder();
        for(int i=n;i<s.length();i++)
            res.append(s.charAt(i));
        for (int i=0;i<n;i++)
            res.append(s.charAt(i));
        return res.toString();
    }
}

//取余法
class Solution2{
    String reverseLeftWords(String s,int n){
        StringBuilder res=new StringBuilder();
            for(int i=n;i<s.length()+n;i++)
                res.append(s.charAt(i%s.length()));
        return res.toString();
    }
}
public class reverseLeftWords {
    public static void main(String[] args) {
        String ss="abcdefg";
        Solution2 s=new Solution2();
        ss=s.reverseLeftWords(ss,2);
        System.out.println(ss);
    }
}
