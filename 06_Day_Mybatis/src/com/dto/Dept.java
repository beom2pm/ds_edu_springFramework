package com.dto;

//Dept 테이블의 컬럼데이터 저장용도 ==> 하나의 행 저장
public class Dept {

	//Dept테이블의 컬럼명과 동일하게 지정 권장한다. 만약 다르면  별칭으로  변수명과 일치시킨다.
	/*
	 *   select deptnum as deptno
	 *   select to_char(deptno)  as deptno
	 * 
	 */
	int deptno;
	String dname;
	String loc;
	
	public Dept() {
	}

	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
}
