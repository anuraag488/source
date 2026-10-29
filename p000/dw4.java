package p000;

import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dw4 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f17467a = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: b */
    public static dw4 f17468b;

    /* JADX INFO: renamed from: a */
    public static dw4 m4783a() {
        if (h50.f20394b == null) {
            h50.f20394b = new h50((byte) 20);
        }
        dw4 dw4Var = f17468b;
        if (dw4Var != null) {
            return dw4Var;
        }
        dw4 dw4Var2 = new dw4();
        VarHandle.storeStoreFence();
        f17468b = dw4Var2;
        return dw4Var2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4784b(C1084qu c1084qu) {
        return TextUtils.isEmpty(c1084qu.f28796c) || c1084qu.f28799f + c1084qu.f28798e < (System.currentTimeMillis() / 1000) + 3600;
    }
}
