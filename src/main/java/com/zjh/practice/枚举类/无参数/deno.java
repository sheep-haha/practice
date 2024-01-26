package com.zjh.practice.枚举类.无参数;

public class deno {
    public static void main(String[] args) {
        // 第一种方式输出
        ReferenceRelationSyncEnum keywordsRule = ReferenceRelationSyncEnum.KEYWORDS_RULE;
        System.out.println(keywordsRule);

        // 第二种方式输出
        String s = ReferenceRelationSyncEnum.REGULAR_EXPRESSION_RULE.toString();
        System.out.println(s);

    }
}
