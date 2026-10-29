package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb0 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ float f32504a;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f = this.f32504a;
        ((Float) obj).getClass();
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
            xl4 xl4Var = (xl4) ir1Var.m6898k(gl4.f19869a);
            ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
            nt2 nt2VarM8584l = n74.m8584l(kt2.f23428a, ky0Var.mo3572A0(ky0Var.mo3582h0(xl4Var.f34389a.f27479b) * 3.0f), 0.0f, 2);
            String strValueOf = String.valueOf((int) (255.0f * f));
            wi4 wi4Var = new wi4();
            wi4Var.f33412a = 3;
            VarHandle.storeStoreFence();
            gl4.m6037b(strValueOf, nt2VarM8584l, 0L, 0L, null, null, 0L, wi4Var, 0L, 0, false, 0, 0, null, ir1Var, 0, 0, 261116);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
