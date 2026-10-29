package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gz3 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f20216a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ArrayList f20217b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ nq1 f20218c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f20219d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ lz3 f20220e;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f20216a;
        ArrayList arrayList = this.f20217b;
        nq1 nq1Var = this.f20218c;
        boolean z = this.f20219d;
        lz3 lz3Var = this.f20220e;
        sg2 sg2Var = (sg2) obj;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
        }
        boolean z2 = false;
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
            kj0 kj0Var = mz3.f25344a;
            int size = arrayList.size();
            boolean z3 = nq1Var != null;
            boolean z4 = i == 0;
            boolean z5 = i == size - 1;
            if (z3 && i == 0) {
                z2 = true;
            }
            zh3 zh3VarMo7523a = kj0Var.mo7523a(new yy3(z4, z5, z2, z));
            er1 er1Var = new er1((byte) 13);
            er1Var.f18412b = lz3Var;
            er1Var.f18413c = sg2Var;
            VarHandle.storeStoreFence();
            as4.m3244c(zh3VarMo7523a, vd6.m11834R(-865406494, er1Var, ir1Var), ir1Var, 56);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
