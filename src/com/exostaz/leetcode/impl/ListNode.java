package com.exostaz.leetcode.impl;

import com.google.common.base.Objects;

public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode listNode)) return false;
        return val == listNode.val && Objects.equal(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(val, next);
    }
}
