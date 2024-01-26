package com.zjh.practice.枚举类.两个参数;

public class demo {
    public static void main(String[] args) {
        int type = ReferenceRelationSyncEnum.KEYWORDS_RULE.getType();
        System.out.println(type);

        int type2 = ReferenceRelationSyncEnum.REGULAR_EXPRESSION_RULE.getType();
        System.out.println(type2);

        System.out.println("------------------------------------");
        // 获取规则名称：通过枚举的实例方法调用
        String ruleName = ReferenceRelationSyncEnum.KEYWORDS_RULE.getRuleName();
        System.out.println(ruleName);

        // 获取规则名称：通过枚举类直接调用方法
        String ruleName2 = ReferenceRelationSyncEnum.getRuleName(2);
        System.out.println(ruleName2);
    }
}
