package offer.easy;

class replaceSpace2{
    public String replaceSpace(String s){
        return s.replace(" ","%20");
    }
}
public class replaceSpace {
    public String replaceSpace(String s){
        StringBuilder res=new StringBuilder();
        for (Character c:s.toCharArray()){
            if (c==' ')
                res.append("%20");
            else
                res.append(c);
        }
        return res.toString();
    }
}

