package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nt4 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ fv3 f26081a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f26082b;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fv3 fv3Var = this.f26081a;
        int i = this.f26082b;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
            gi2 gi2Var = new gi2((byte) 4);
            gi2Var.f19805c = fv3Var;
            gi2Var.f19804b = i;
            VarHandle.storeStoreFence();
            mz3.m8462d(null, false, vd6.m11834R(-1335217433, gi2Var, ir1Var), ir1Var, 384, 3);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
