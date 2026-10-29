package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import java.lang.invoke.VarHandle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wp5 implements ep6 {

    /* JADX INFO: renamed from: a */
    public final Context f33583a;

    /* JADX INFO: renamed from: b */
    public final cw5 f33584b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f33585c = new ConcurrentHashMap();

    public wp5(Context context, Intent intent) {
        this.f33583a = context;
        if (s36.m10518a(context)) {
            this.f33584b = new cw5(context.getApplicationContext(), "HsdpService", intent, new pj5((byte) 29));
        } else {
            C1077qn.m9989o("HSDP service is not available.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m12353b(wp5 wp5Var, vt5 vt5Var, int i, Runnable runnable) {
        Handler handlerM4221e = wp5Var.f33584b.m4221e();
        rr6 rr6Var = new rr6();
        rr6Var.f29556a = vt5Var;
        rr6Var.f29557b = i;
        rr6Var.f29558c = runnable;
        VarHandle.storeStoreFence();
        handlerM4221e.post(rr6Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m12354a(String str, String str2, IBinder iBinder, int i, int i2, boolean z, boolean z2, long j, wx1 wx1Var, byte[] bArr) {
        vt5 vt5Var = new vt5();
        vt5Var.f32872d = str;
        vt5Var.f32870b = wx1Var;
        vt5Var.f32869a = (byte) 1;
        VarHandle.storeStoreFence();
        lo5 lo5Var = new lo5(this, vt5Var);
        vt5Var.f32871c = lo5Var;
        this.f33585c.put(str, vt5Var);
        Bundle bundle = new Bundle();
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i);
        bundle.putInt("clientWindowHeightPx", i2);
        bundle.putString("sdkVersion", "2.2.0");
        bundle.putLong("requestTimestampMs", j);
        bundle.putBoolean("autoTrigger", z);
        bundle.putBoolean("isConfigChange", z2);
        if (bArr != null) {
            bundle.putByteArray("configProtoBytes", bArr);
        }
        wb6 wb6Var = new wb6((byte) 4);
        wb6Var.f33226d = this;
        wb6Var.f33224b = str;
        wb6Var.f33225c = str2;
        wb6Var.f33227e = bundle;
        wb6Var.f33228f = lo5Var;
        VarHandle.storeStoreFence();
        this.f33584b.m4222f(wb6Var);
    }
}
