package info.superalsrk.model.util;

public class LevelUtil {
	public static Integer getLevel(Integer score) {
		if(score >= 0 && score <=5) {
			return 1;
		} else if(score >= 6 && score <= 15) {
			return 2;
		} else if(score >= 16 && score <= 30) {
			return 3;
		} else if(score >= 31 && score <= 50) {
			return 4;
		} else if(score >= 51 && score <= 100) {
			return 5;
		} else if(score >= 101 && score <= 200) {
			return 6;
		} else if(score >= 201 && score <= 500) {
			return 7;
		} else if(score >= 501 && score <= 1000) {
			return 8;
		} else if(score >= 1001 && score <= 2000) {
			return 9;
		} else if(score >= 2001 && score <= 3000) {
			return 10;
		} else if(score >= 3001 && score <= 6000) {
			return 11;
		} else if(score >= 6001 && score <= 10000) {
			return 12;
		} else if(score >= 10001 && score <= 18000) {
			return 13;
		} else if(score >= 18001 && score <= 30000) {
			return 14;
		} else if(score >= 30001 && score <= 60000) {
			return 15;
		} else if(score >= 60001 && score <= 100000) {
			return 16;
		} else if(score >=100001 && score <= 300000) {
			return 17;
		} else {
			return 18;
		}
	}
}
