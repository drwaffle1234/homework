import java.util.Random;

public class data {
	static Random gen = new Random();
	boolean fastPW=false;
	public String getSfastPW(){
		String truefalse;
		if(fastPW==true)
			truefalse="True";
		else
			truefalse="False";
		
		return truefalse;
	}
	
	public boolean getfastPW(){
		return fastPW;
	}
	public boolean setfastPW(boolean fastPPW){
		return fastPW=fastPPW;
	}
	public String F1234(int value) {
		String Password="";
		
		String case1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F134(int value) {
		String Password="";
		
		String case1 = "abcdefghijklmnopqrstuvwxyz1234567890!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F123(int value) {
		String Password="";
		
		String case1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F234(int value) {
		String Password="";
		
		String case1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F34(int value) {
		String Password="";
		
		String case1 = "1234567890!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F4(int value) {
		String Password="";
		
		String case1 = "!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F12(int value) {
		String Password="";
		
		String case1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F23(int value) {
		String Password="";
		
		String case1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F13(int value) {
		String Password="";
		
		String case1 = "abcdefghijklmnopqrstuvwxyz1234567890";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F14(int value) {
		String Password="";
		
		String case1 = "abcdefghijklmnopqrstuvwxyz!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F24(int value) {
		String Password="";
		
		String case1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			return Password;
	}
	public String F1(int value) {
		String Password="";
		
		String case1 = "abcdefghijklmnopqrstuvwxyz";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			
			if(fastPW==false){
				PasswordGen.sleep(100*value);
			}
			
			return Password;
			
	}
	public String F2(int value) {
		String Password="";
		
		String case1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			PasswordGen.sleep(100*value);
			return Password;
	}
	public String F3(int value) {
		String Password="";
		
		String case1 = "1234567890";
			for(int i =0; i<value; i++){
			int randomInt = gen.nextInt(case1.length());
			if (randomInt - 1 == -1) {
				Password+=case1.charAt(randomInt);
	        } else {
	        	Password+=case1.charAt(randomInt-1);
	        }
		}
			PasswordGen.sleep(100*value);
			return Password;
	}

}	