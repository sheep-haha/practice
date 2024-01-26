package com.zjh.practice.枚举类.抽象类;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class demo {
    public static void main(String[] args) throws Exception {

        // AbstractRuleMsg msg = ReferenceRelationSyncEnum.getMsg(1);
//        KeyWords msg = (KeyWords) ReferenceRelationSyncEnum.getMsg(1);
//        msg.buildRuleMag(new HashMap<>());
//
//        RegularExperssion msg2 = (RegularExperssion) ReferenceRelationSyncEnum.getMsg(2);
//        msg2.buildRuleMag(new HashMap<>());

        // 实际期待的结果
        AbstractRuleMsg abstractRuleMsg = ReferenceRelationSyncEnum.getClass(1).newInstance();
        abstractRuleMsg.buildRuleMag(new HashMap<>());

        AbstractRuleMsg abstractRuleMsg2 = ReferenceRelationSyncEnum.getClass(2).newInstance();
        abstractRuleMsg.buildRuleMag(new HashMap<>());

        Object o = ReferenceRelationSyncEnum.getClass(2).newInstance();


//        Class aClass = ReferenceRelationSyncEnum.getClass(1);
//        Object o1 = aClass.newInstance();
//        Method method = aClass.getMethod("buildRuleMag",Map.class);
//        method.invoke(o, new HashMap<>());



//        Class aClass1 = ReferenceRelationSyncEnum.getClass(2);
//        Object o1 = aClass1.newInstance();


    }

    //        int type = ReferenceRelationSyncEnum.KEYWORDS_RULE.getType();
//        System.out.println(type);
//
//        int type2 = ReferenceRelationSyncEnum.REGULAR_EXPRESSION_RULE.getType();
//        System.out.println(type2);
//
//        System.out.println("------------------------------------");
//        // 获取规则名称：通过枚举的实例方法调用
//        String ruleName = ReferenceRelationSyncEnum.KEYWORDS_RULE.getRuleName();
//        System.out.println(ruleName);
//
//        // 获取规则名称：通过枚举类直接调用方法
//        String ruleName2 = ReferenceRelationSyncEnum.getRuleName(2);
//        System.out.println(ruleName2);
//
//        System.out.println("------------------------------------");
}
