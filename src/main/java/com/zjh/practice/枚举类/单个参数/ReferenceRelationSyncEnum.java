package com.zjh.practice.枚举类.单个参数;

import com.zjh.practice.枚举类.DlpDocRuleReferenceRelationSync;

public enum ReferenceRelationSyncEnum {
    KEYWORDS_RULE(1),

    REGULAR_EXPRESSION_RULE(2);

    private int type;

    public int getType() {
        return type;
    }

    ReferenceRelationSyncEnum(int type) {
        this.type = type;
    }
}
