package com.example.customtreeview;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;

import com.unnamed.b.atv.model.TreeNode;

public class HolderForParent extends TreeNode.BaseNodeViewHolder<HolderForParent.IconTreeItem> {

    public HolderForParent(Context context) {
        super(context);
    }

    @Override
    public View createNodeView(TreeNode node, IconTreeItem value) {
        final LayoutInflater inflater = LayoutInflater.from(context);

        final View view = inflater.inflate(R.layout.layout_profile_root, null, false);
        AppCompatTextView tvValue = view.findViewById(R.id.node_value);
        tvValue.setText(value.text);

        return view;
    }

    public static class IconTreeItem {
        public String text;

        public IconTreeItem(String text) {
            this.text = text;
        }
    }
}