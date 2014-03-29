package com.cvsintellect.linkedinimport.model.position;

import java.io.Serializable;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class PositionInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute(required = false)
	private int total;

	@ElementList(entry = "position", inline = true, required = false)
	private List<Position> positions;

	public PositionInfo() {
		super();
	}

	public PositionInfo(int total, List<Position> positions) {
		super();
		this.total = total;
		this.positions = positions;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Position> getPositions() {
		return positions;
	}

	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
}
