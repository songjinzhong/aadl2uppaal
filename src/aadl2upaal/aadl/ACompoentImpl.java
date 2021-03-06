package aadl2upaal.aadl;

import java.util.ArrayList;

import aadl2upaal.visitor.NodeVisitor;

public class ACompoentImpl extends ANode {
	private ArrayList<Connection> conns;
	private ArrayList<Annex> annexs;
	private ArrayList<ACompoent> subcompoent;

	public ACompoentImpl(String name) {
		super(name);
		conns = new ArrayList<Connection>();
        annexs = new ArrayList<Annex>();
	}

	@Override
	public void accept(NodeVisitor visitor) {
        visitor.visit(this);
	}

	public ArrayList<Connection> getConns() {
		return conns;
	}

	public void setConns(ArrayList<Connection> conns) {
		this.conns = conns;
	}

	public ArrayList<Annex> getAnnexs() {
		return annexs;
	}

	public void setAnnexs(ArrayList<Annex> annexs) {
		this.annexs = annexs;
	}

	public ArrayList<ACompoent> getSubcompoent() {
		return subcompoent;
	}

	public void setSubcompoent(ArrayList<ACompoent> subcompoent) {
		this.subcompoent = subcompoent;
	}

}
