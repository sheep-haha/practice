package com.zjh.practice.枚举类;

public enum ReferenceRelationSyncEnum {

    KEYWORDS_RULE(1, "关键词规则引用同步", DlpDocRuleReferenceRelationSync.class),

    REGULAR_EXPRESSION_RULE(2, "正则规则引用同步", DlpDocRuleReferenceRelationSync.class);

    private Integer type;

    private String name;

    private Class<? extends AbstractReferenceRelationSync> referenceRelationObject;

    ReferenceRelationSyncEnum(Integer type, String name, Class<? extends AbstractReferenceRelationSync> referenceRelationObject) {
        this.type = type;
        this.name = name;
        this.referenceRelationObject = referenceRelationObject;
    }


    /**
     * 获取引用关系对象,这里必须为static
     * @param type
     * @return
     */
    public static Class<? extends AbstractReferenceRelationSync> getReferenceRelationObject(int type)
    {
        for (ReferenceRelationSyncEnum c : ReferenceRelationSyncEnum.values()) {
            if (c.getType() == type) {
                return c.referenceRelationObject;
            }
        }
        return null;
    }

    public Integer getType() {
        return type;
    }

}
