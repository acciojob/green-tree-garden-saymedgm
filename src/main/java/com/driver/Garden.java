package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Garden {
	private List<Tree> trees;

	public Garden() {
		this.trees = new ArrayList<>();
	}

	public void plantTree(Tree tree) throws InvalidTreeException {
		if (tree.getName().isEmpty()) {
			throw new InvalidTreeException("Tree name cannot be empty.");
		}
		trees.add(tree);
	}

	public List<Tree> getTrees() {
		return trees;
	}
}