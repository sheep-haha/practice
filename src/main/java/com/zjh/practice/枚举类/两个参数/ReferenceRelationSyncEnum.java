package com.zjh.practice.枚举类.两个参数;

public enum ReferenceRelationSyncEnum {
    KEYWORDS_RULE(1,"关键字规则"),

    REGULAR_EXPRESSION_RULE(2,"正则规则");

    private int type;

    private String ruleName;

    public int getType() {
        return type;
    }

    public String getRuleName() {
        return ruleName;
    }


    public static String getRuleName(int type) {
        for (ReferenceRelationSyncEnum c : ReferenceRelationSyncEnum.values()) {
            if(c.type == type){
                return c.ruleName;
            }
        }
        return null;
    }

    ReferenceRelationSyncEnum(int type,String ruleName) {
        this.ruleName = ruleName;
        this.type = type;
    }
}
