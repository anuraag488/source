package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hk1 implements si1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ si1 f20635a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ WorkDatabase f20636b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ro4 f20637c;

    @Override // p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) {
        si1 si1Var = this.f20635a;
        WorkDatabase workDatabase = this.f20636b;
        ro4 ro4Var = this.f20637c;
        C0012ab c0012ab = new C0012ab((byte) 3);
        c0012ab.f226b = ti1Var;
        c0012ab.f227c = workDatabase;
        c0012ab.f228d = ro4Var;
        VarHandle.storeStoreFence();
        Object objCollect = si1Var.collect(c0012ab, wm0Var);
        return objCollect == ap0.f14763a ? objCollect : ju4.f22634a;
    }
}
