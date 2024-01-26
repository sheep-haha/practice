package com.zjh.practice.枚举类.单个参数;

public class demo {
    public static void main(String[] args) {
        int type = ReferenceRelationSyncEnum.KEYWORDS_RULE.getType();
        System.out.println(type);

        int type2 = ReferenceRelationSyncEnum.REGULAR_EXPRESSION_RULE.getType();
        System.out.println(type2);
    }
}
