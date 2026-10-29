package p000;

import ads_mobile_sdk.my3;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dm4 {

    /* JADX INFO: renamed from: a */
    public static final C0641f8 f17189a = new C0641f8("NO_THREAD_ELEMENTS", (byte) 8);

    /* JADX INFO: renamed from: b */
    public static final n14 f17190b = new n14(12);

    /* JADX INFO: renamed from: c */
    public static final n14 f17191c = new n14(13);

    /* JADX INFO: renamed from: d */
    public static final n14 f17192d = new n14(14);

    /* JADX INFO: renamed from: a */
    public static final void m4554a(ro0 ro0Var, Object obj) {
        if (obj == f17189a) {
            return;
        }
        if (!(obj instanceof hm4)) {
            ((my3) ro0Var.fold(f17191c, null)).restoreThreadContext(ro0Var, obj);
            return;
        }
        hm4 hm4Var = (hm4) obj;
        my3[] my3VarArr = hm4Var.f20703c;
        int length = my3VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            my3VarArr[length].restoreThreadContext(ro0Var, hm4Var.f20702b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m4555b(ro0 ro0Var, Object obj) {
        if (obj == null) {
            obj = ro0Var.fold(f17190b, 0);
        }
        if (obj == 0) {
            return f17189a;
        }
        if (!(obj instanceof Integer)) {
            return ((my3) obj).updateThreadContext(ro0Var);
        }
        int iIntValue = ((Number) obj).intValue();
        hm4 hm4Var = new hm4();
        hm4Var.f20701a = ro0Var;
        hm4Var.f20702b = new Object[iIntValue];
        hm4Var.f20703c = new my3[iIntValue];
        VarHandle.storeStoreFence();
        return ro0Var.fold(f17192d, hm4Var);
    }
}
