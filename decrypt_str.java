//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
class Solution {
    public String freqAlphabets(String s) {
    String[] b = new String[s.length()];
	String temp="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='#') {
			b[i-2]=s.charAt(i-2)+""+s.charAt(i-1);
			b[i-1]=null;
		}
		else {
			b[i]=s.charAt(i)+"";
		}
	}
	int i=0;
	while(i<b.length) {
		if(b[i]==null) {
			i++;
		}
		else if(b[i].equals("1")) {
			temp+="a";
			i++;
		}
		else if(b[i].equals("2")) {
			temp+="b";
			i++;
		}
		else if(b[i].equals("3")) {
			temp+="c";
			i++;
		}
		else if(b[i].equals("4")) {
			temp+="d";
			i++;
		}
		else if(b[i].equals("5")) {
			temp+="e";
			i++;
		}
		else if(b[i].equals("6")) {
			temp+="f";
			i++;
		}
		else if(b[i].equals("7")) {
			temp+="g";
			i++;
		}
		else if(b[i].equals("8")) {
			temp+="h";
			i++;
		}
		else if(b[i].equals("9")) {
			temp+="i";
			i++;
		}
		else if(b[i].equals("10")) {
			temp+="j";
			i++;
		}
		else if(b[i].equals("11")) {
			temp+="k";
			i++;
		}
		else if(b[i].equals("12")) {
			temp+="l";
			i++;
		}
		else if(b[i].equals("13")) {
			temp+="m";
			i++;
		}
		else if(b[i].equals("14")) {
			temp+="n";
			i++;
		}
		else if(b[i].equals("15")) {
			temp+="o";
			i++;
		}
		else if(b[i].equals("16")) {
			temp+="p";
			i++;
		}
		else if(b[i].equals("17")) {
			temp+="q";
			i++;
		}
		else if(b[i].equals("18")) {
			temp+="r";
			i++;
		}
		else if(b[i].equals("19")) {
			temp+="s";
			i++;
		}
		else if(b[i].equals("20")) {
			temp+="t";
			i++;
		}
		else if(b[i].equals("21")) {
			temp+="u";
			i++;
		}
		else if(b[i].equals("22")) {
			temp+="v";
			i++;
		}
		else if(b[i].equals("23")) {
			temp+="w";
			i++;
		}
		else if(b[i].equals("24")) {
			temp+="x";
			i++;
		}
		else if(b[i].equals("25")) {
			temp+="y";
			i++;
		}
		else{
			temp+="z";
			i++;
		}
	}
    return temp;
    }
}
