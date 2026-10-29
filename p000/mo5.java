package p000;

import ads_mobile_sdk.C0313rh;
import android.os.Bundle;
import android.os.DeadObjectException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mo5 implements Callable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C0927mz f25087a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f25088b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f25089c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f25090d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Bundle f25091e;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundleM10135c;
        nq5 nq5Var;
        C0927mz c0927mz = this.f25087a;
        int i = this.f25088b;
        String str = this.f25089c;
        String str2 = this.f25090d;
        Bundle bundle = this.f25091e;
        try {
            synchronized (c0927mz.f25313a) {
                nq5Var = c0927mz.f25321i;
            }
            if (nq5Var == null) {
                return qv5.m10135c(rz5.f29767j, C0313rh.f10790h1);
            }
            return ((eq5) nq5Var).m5284S(i, c0927mz.f25319g.getPackageName(), str, str2, bundle);
        } catch (DeadObjectException e) {
            f00 f00Var = rz5.f29767j;
            String strM7756a = kz5.m7756a(e);
            bundleM10135c = qv5.m10135c(f00Var, 5);
            if (strM7756a != null) {
                bundleM10135c.putString("ADDITIONAL_LOG_DETAILS", strM7756a);
            }
            return bundleM10135c;
        } catch (Exception e2) {
            f00 f00Var2 = rz5.f29765h;
            String strM7756a2 = kz5.m7756a(e2);
            bundleM10135c = qv5.m10135c(f00Var2, 5);
            if (strM7756a2 != null) {
                bundleM10135c.putString("ADDITIONAL_LOG_DETAILS", strM7756a2);
            }
            return bundleM10135c;
        }
    }
}
