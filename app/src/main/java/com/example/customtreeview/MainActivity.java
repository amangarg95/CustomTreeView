package com.example.customtreeview;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;

import com.unnamed.b.atv.model.TreeNode;
import com.unnamed.b.atv.view.AndroidTreeView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout containerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        containerView = findViewById(R.id.container_view);

        TreeNode root = TreeNode.root();

        HolderForParent.IconTreeItem nodeItemRoot = new HolderForParent.IconTreeItem("Parent Node");
        MyHolder.IconTreeItem nodeItem = new MyHolder.IconTreeItem("Children Node");

        TreeNode parent = new TreeNode(nodeItemRoot).setViewHolder(new HolderForParent(this));
        TreeNode child0 = new TreeNode(nodeItem).setViewHolder(new MyHolder(this));
        TreeNode child1 = new TreeNode(nodeItem).setViewHolder(new MyHolder(this));
        TreeNode child2 = new TreeNode(nodeItem).setViewHolder(new MyHolder(this));
        parent.addChildren(child0, child1, child2);
        root.addChild(parent);

        AndroidTreeView tView = new AndroidTreeView(this, root);
        containerView.addView(tView.getView());
    }
}