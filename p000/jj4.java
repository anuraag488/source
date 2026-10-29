package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jj4 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22340a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Drawable f22341b;

    public /* synthetic */ jj4(byte b) {
        this.f22340a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f22340a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                long j = ((pb0) obj).f27503a;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ir1Var.m6874W();
                } else {
                    gb5.f19723n.m5962g(this.f22341b, ir1Var, 48);
                }
                break;
            default:
                long j2 = ((pb0) obj).f27503a;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    gb5.f19723n.m5962g(this.f22341b, ir1Var2, 48);
                }
                break;
        }
        return ju4Var;
    }
}
