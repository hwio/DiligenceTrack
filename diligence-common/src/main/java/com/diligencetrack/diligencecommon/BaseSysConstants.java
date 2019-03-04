package com.diligencetrack.diligencecommon;

/**
 * 常量
 * Created by admin on 2019/2/18.
 */
public class BaseSysConstants {
    /**
     * 审批流常量
     *
     * @author Administrator
     */
    public static final class OrderType {
        @ConstAnnotation("提交审核")
        public static final Integer submit = Integer.valueOf(0);
        @ConstAnnotation("审核中")
        public static final Integer audit = Integer.valueOf(1);
        @ConstAnnotation("审核通过")
        public static final Integer authed = Integer.valueOf(2);
        @ConstAnnotation("拒审")
        public static final Integer reject = Integer.valueOf(3);

        public OrderType() {

        }
    }

    public static final class AuthoStatic {
        @ConstAnnotation("已审核")
        public static final Integer authoed = Integer.valueOf(0);
        @ConstAnnotation("下架")
        public static final Integer lineout = Integer.valueOf(1);
        @ConstAnnotation("未发布")
        public static final Integer undisplay = Integer.valueOf(2);
        @ConstAnnotation("审核中")
        public static final Integer authoing = Integer.valueOf(4);
        @ConstAnnotation("未通过")
        public static final Integer notauthoed = Integer.valueOf(5);

        public AuthoStatic() {
        }
    }

    /**
     * 公文文档归档常量
     */
    public static final class fileArchiving{
        @ConstAnnotation("归档")
        public static final Integer fileA = Integer.valueOf(0);
        @ConstAnnotation("销毁")
        public static final Integer destruction = Integer.valueOf(1);
        public fileArchiving(){}
    }

    /**
     * 公告状态常量
     */
    public static final class noticeState{
        @ConstAnnotation("未读")
        public static final Integer Unread = Integer.valueOf(0);
        @ConstAnnotation("已读")
        public static final Integer Release = Integer.valueOf(1);
        @ConstAnnotation("已发布")
        public static final Integer Read = Integer.valueOf(2);
        @ConstAnnotation("已回复")
        public static final Integer Reply = Integer.valueOf(3);
        @ConstAnnotation("已置顶")
        public static final Integer RoofPlacement = Integer.valueOf(4);
        public noticeState(){}
    }

    /**
     * 邮箱发送类型
     */
    public static final class sendType{
        @ConstAnnotation("普通")
        public static final Integer Ordinary = Integer.valueOf(0);
        @ConstAnnotation("急件")
        public static final Integer UrgentItems = Integer.valueOf(1);
        public sendType(){}
    }

    /**
     * 邮箱类型
     */
    public static final class boxType{
        @ConstAnnotation("草稿箱")
        public static final Integer Drafts = Integer.valueOf(0);
        @ConstAnnotation("收件箱")
        public static final Integer Inbox = Integer.valueOf(1);
        @ConstAnnotation("发件箱")
        public static final Integer Outbox = Integer.valueOf(2);
        @ConstAnnotation("垃圾箱")
        public static final Integer Dustbin = Integer.valueOf(3);
        public boxType(){}
    }

    /**
     * 邮件状态
     */
    public static final class emailState{
        @ConstAnnotation("未读")
        public static final Integer Unread = Integer.valueOf(0);
        @ConstAnnotation("已读")
        public static final Integer AlreadyRead = Integer.valueOf(1);
        @ConstAnnotation("回复")
        public static final Integer Reply = Integer.valueOf(2);
        @ConstAnnotation("转发")
        public static final Integer Forward = Integer.valueOf(3);
        @ConstAnnotation("全部转发")
        public static final Integer Forwarding = Integer.valueOf(4);
        public emailState(){}
    }

    /**
     * 是否删除
     */
    public static final class DF{
        @ConstAnnotation("已删除")
        public static final Integer DELETE = Integer.valueOf(1);
        @ConstAnnotation("正常")
        public static final Integer NORMAL = Integer.valueOf(0);
        public DF(){}
    }
}
