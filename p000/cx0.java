package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cx0 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16561a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16562b;

    public /* synthetic */ cx0(byte b) {
        this.f16561a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pg0 pg0VarM11834R;
        byte b = this.f16561a;
        byte b2 = 2;
        boolean z = true;
        ju4 ju4Var = ju4.f22634a;
        byte b3 = 0;
        switch (b) {
            case 0:
                long j = ((pb0) obj).f27503a;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6888f(j) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var.m6874W();
                } else {
                    dx0.m4786b(((kj4) this.f16562b).f23181c, j, ir1Var, (iIntValue << 3) & 112);
                }
                break;
            case 1:
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ir1Var2.m6874W();
                } else {
                    pe3 pe3Var = (pe3) this.f16562b;
                    ir1Var2.m6885d0(741171446);
                    et1 et1Var = new et1(b3);
                    et1Var.f18467b = pe3Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R2 = vd6.m11834R(-1736872750, et1Var, ir1Var2);
                    if (pe3Var.f27567b == null) {
                        ir1Var2.m6885d0(741270489);
                        ir1Var2.m6912r(false);
                        pg0VarM11834R = null;
                    } else {
                        ir1Var2.m6885d0(741270490);
                        et1 et1Var2 = new et1(z ? 1 : 0);
                        et1Var2.f18467b = pe3Var;
                        VarHandle.storeStoreFence();
                        pg0VarM11834R = vd6.m11834R(842302428, et1Var2, ir1Var2);
                        ir1Var2.m6912r(false);
                    }
                    pg0 pg0Var = pg0VarM11834R;
                    et1 et1Var3 = new et1(b2);
                    et1Var3.f18467b = pe3Var;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, null, null, null, pg0VarM11834R2, pg0Var, vd6.m11834R(-23572464, et1Var3, ir1Var2), null, ir1Var2, 102236160, 575);
                    ir1Var2.m6912r(false);
                }
                break;
            default:
                mi0 mi0Var3 = ((r74) obj).f29073a;
                mi0 mi0Var4 = (mi0) obj2;
                ((Number) obj3).intValue();
                int iHashCode = Long.hashCode(((ir1) mi0Var4).f21683T);
                nt2 nt2VarM10006A = qq2.m10006A(mi0Var4, (nt2) this.f16562b);
                ir1 ir1Var3 = (ir1) mi0Var3;
                ir1Var3.m6887e0(509942095);
                bi0.f15310ap.getClass();
                C0006a5.m53I(ir1Var3, ia5.f21214e, nt2VarM10006A);
                C0006a5.m53I(ir1Var3, ia5.f21217h, Integer.valueOf(iHashCode));
                ir1Var3.m6912r(false);
                break;
        }
        return ju4Var;
    }
}
