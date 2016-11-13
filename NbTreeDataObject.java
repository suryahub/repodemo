package com.miniproject.common;

import java.util.List;

//Class NbTreDataObject

public class NbTreeDataObject {

	
	private List<ClassifierStatistics> c45ClassifierList;
	
	private List<ClassifierStatistics> nBClassifierList;
	
	private List<ClassifierStatistics> nBTreeClassifierList;

	public List<ClassifierStatistics> getC45ClassifierList() {
		return c45ClassifierList;
	}

	public void setC45ClassifierList(List<ClassifierStatistics> c45ClassifierList) {
		this.c45ClassifierList = c45ClassifierList;
	}

	public List<ClassifierStatistics> getnBClassifierList() {
		return nBClassifierList;
	}

	public void setnBClassifierList(List<ClassifierStatistics> nBClassifierList) {
		this.nBClassifierList = nBClassifierList;
	}

	public List<ClassifierStatistics> getnBTreeClassifierList() {
		return nBTreeClassifierList;
	}

	public void setnBTreeClassifierList(
			List<ClassifierStatistics> nBTreeClassifierList) {
		this.nBTreeClassifierList = nBTreeClassifierList;
	} 
	
}
