package p000;

import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e44 {

    /* JADX INFO: renamed from: c */
    public static final xd3 f17683c = new xd3("firebase_sessions_enabled");

    /* JADX INFO: renamed from: d */
    public static final xd3 f17684d = new xd3("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: e */
    public static final xd3 f17685e = new xd3("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: f */
    public static final xd3 f17686f = new xd3("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: g */
    public static final xd3 f17687g = new xd3("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a */
    public lt0 f17688a;

    /* JADX INFO: renamed from: b */
    public w24 f17689b;

    /* JADX INFO: renamed from: a */
    public final boolean m4917a() {
        w24 w24Var = this.f17689b;
        if (w24Var == null) {
            z62.m13366Y("sessionConfigs");
            throw null;
        }
        Long l = w24Var.f33048e;
        if (w24Var != null) {
            Integer num = w24Var.f33047d;
            return l == null || num == null || (System.currentTimeMillis() - l.longValue()) / 1000 >= ((long) num.intValue());
        }
        z62.m13366Y("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m4918b(xd3 xd3Var, Object obj, ym0 ym0Var) {
        d44 d44Var;
        if (ym0Var instanceof d44) {
            d44Var = (d44) ym0Var;
            int i = d44Var.f16781v;
            if ((i & Integer.MIN_VALUE) != 0) {
                d44Var.f16781v = i - Integer.MIN_VALUE;
            } else {
                d44Var = new d44(this, ym0Var);
            }
        } else {
            d44Var = new d44(this, ym0Var);
        }
        Object obj2 = d44Var.f16779t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = d44Var.f16781v;
        try {
            if (i2 == 0) {
                k43.m7376J(obj2);
                lt0 lt0Var = this.f17688a;
                wm0 wm0Var = null;
                C0871lg c0871lg = new C0871lg(obj, xd3Var, this, wm0Var, (byte) 3);
                d44Var.f16781v = 1;
                if (lt0Var.mo8106a(new er2((Object) c0871lg, wm0Var, (byte) 5), d44Var) == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj2);
            }
        } catch (IOException e) {
            Log.w("SettingsCache", "Failed to update cache config value: " + e);
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: c */
    public final void m4919c(hw2 hw2Var) {
        Boolean bool = (Boolean) hw2Var.m6525c(f17683c);
        Double d = (Double) hw2Var.m6525c(f17684d);
        Integer num = (Integer) hw2Var.m6525c(f17685e);
        Integer num2 = (Integer) hw2Var.m6525c(f17686f);
        Long l = (Long) hw2Var.m6525c(f17687g);
        w24 w24Var = new w24();
        w24Var.f33044a = bool;
        w24Var.f33045b = d;
        w24Var.f33046c = num;
        w24Var.f33047d = num2;
        w24Var.f33048e = l;
        VarHandle.storeStoreFence();
        this.f17689b = w24Var;
    }
}
