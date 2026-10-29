package p000;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kk6 extends ir5 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f23205e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f23206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk6(Object obj, oc6 oc6Var, byte b) {
        super(oc6Var);
        this.f23205e = b;
        this.f23206f = obj;
    }

    @Override // p000.ir5
    /* JADX INFO: renamed from: a */
    public final void mo6922a() {
        byte b = this.f23205e;
        Object obj = this.f23206f;
        switch (b) {
            case 0:
                dx4 dx4Var = (dx4) obj;
                vk6 vk6Var = (vk6) dx4Var.f17485d;
                vk6Var.mo5038t();
                oa6 oa6Var = (oa6) vk6Var.f36084a;
                oa6Var.f26519k.getClass();
                dx4Var.m4793e(false, false, SystemClock.elapsedRealtime());
                ly5 ly5Var = oa6Var.f26522n;
                oa6.m9013i(ly5Var);
                oa6Var.f26519k.getClass();
                ly5Var.m8151w(SystemClock.elapsedRealtime());
                break;
            case 1:
                fl6 fl6Var = (fl6) obj;
                fl6Var.m5735y();
                d76 d76Var = ((oa6) fl6Var.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16831L.m12504a("Starting upload from DelayedRunnable");
                fl6Var.f19870f.m9973q();
                break;
            default:
                qm6 qm6Var = (qm6) obj;
                qm6Var.mo9020c().mo5038t();
                String str = (String) qm6Var.f28607q.pollFirst();
                if (str != null) {
                    qm6Var.mo9022e().getClass();
                    qm6Var.f28589I = SystemClock.elapsedRealtime();
                    qm6Var.mo9019b().f16831L.m12505b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = qm6Var.f28602l.f26509a;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                qm6Var.m9931F();
                break;
        }
    }
}
