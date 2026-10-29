package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tp0 {

    /* JADX INFO: renamed from: a */
    public if1 f31298a;

    /* JADX INFO: renamed from: a */
    public final void m11087a(C1232uu c1232uu) {
        if1 if1Var = this.f31298a;
        HashSet<mq3> hashSet = c1232uu.f32169a;
        ArrayList arrayList = new ArrayList(ib0.m6717y0(hashSet, 10));
        for (mq3 mq3Var : hashSet) {
            String str = ((C1158su) mq3Var).f30559b;
            C1158su c1158su = (C1158su) mq3Var;
            arrayList.add(nq3.m8816a(str, c1158su.f30561d, c1158su.f30562e, c1158su.f30560c, c1158su.f30563f));
        }
        synchronized (((oq3) if1Var.f21329f)) {
            try {
                if (((oq3) if1Var.f21329f).m9237b(arrayList)) {
                    List listM9236a = ((oq3) if1Var.f21329f).m9236a();
                    yq0 yq0Var = (yq0) ((jp0) if1Var.f21326c).f22482c;
                    RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 21);
                    runnableC1285w9.f33164b = if1Var;
                    runnableC1285w9.f33165c = listM9236a;
                    VarHandle.storeStoreFence();
                    yq0Var.m13214a(runnableC1285w9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
