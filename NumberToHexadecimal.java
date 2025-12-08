class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            int d=num&15;
            if(d<10){
                sb.append(d);
            }else{
                switch(d){
                    case 10: sb.append('a');
                    break;
                    case 11: sb.append('b');
                    break;
                    case 12: sb.append('c');
                    break;
                    case 13: sb.append('d');
                    break;
                    case 14: sb.append('e');
                    break;
                    case 15: sb.append('f');
                    
                }
            }
            num >>>= 4;
        }
        return sb.reverse().toString();

    }
}