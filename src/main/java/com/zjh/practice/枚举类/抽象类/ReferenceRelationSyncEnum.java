package com.zjh.practice.枚举类.抽象类;



public enum ReferenceRelationSyncEnum {
    KEYWORDS_RULE(1,"关键字规则",KeyWords.class),

    REGULAR_EXPRESSION_RULE(2,"正则规则",RegularExperssion.class);


    private int type;

    private String ruleName;

    private Class<? extends AbstractRuleMsg> targetClass;

    public int getType() {
        return type;
    }

    public String getRuleName() {
        return ruleName;
    }

    public static Class<? extends AbstractRuleMsg> getClass(int type) {
        for (ReferenceRelationSyncEnum c : ReferenceRelationSyncEnum.values()) {
            if(c.getType() == type){
                return c.targetClass;
            }
        }
        return null;
    }

    ReferenceRelationSyncEnum(int type,String ruleName,Class<? extends AbstractRuleMsg> targetClass) {
        this.ruleName = ruleName;
        this.type = type;
        this.targetClass = targetClass;
    }

    public static String getRuleName(int type) {
        for (ReferenceRelationSyncEnum c : ReferenceRelationSyncEnum.values()) {
            if(c.getType() == type){
                return c.ruleName;
            }
        }
        return null;
    }


}
