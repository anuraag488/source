package p000;

import android.app.Notification;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: uc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1214uc {
    /* JADX INFO: renamed from: a */
    public static void m11530a(Notification.Action.Builder builder) {
        builder.setEmphasisHint(0);
    }

    /* JADX INFO: renamed from: b */
    public static final void m11531b(i14 i14Var, AccessibilityEvent accessibilityEvent) {
        e14 e14Var = i14Var.f21012d;
        Object objM8132g = e14Var.f17631a.m8132g(m14.f24545L);
        if (objM8132g == null) {
            objM8132g = null;
        }
        if (objM8132g != null) {
            xy4.m12778e();
        } else {
            Object objM8132g2 = e14Var.f17631a.m8132g(m14.f24541H);
            accessibilityEvent.setTextChangeTypes((((ql4) (objM8132g2 != null ? objM8132g2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11532c(Notification.Action.Builder builder) {
        builder.setStyleHint(0);
    }
}
