package p000;

import navbar.NavBarAppKt;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gi2 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19803a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f19804b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f19805c;

    public /* synthetic */ gi2(byte b) {
        this.f19803a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19803a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                hi2 hi2Var = (hi2) this.f19805c;
                int i = this.f19804b;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    r62 r62VarM7079d = hi2Var.f20598b.f19015a.m7079d(i);
                    ((pg0) r62VarM7079d.f29058c.f22483d).mo183g(hi2Var.f20599c, Integer.valueOf(i - r62VarM7079d.f29056a), ir1Var, 0);
                }
                break;
            case 1:
                mq1 mq1Var = (mq1) this.f19805c;
                int i2 = this.f19804b;
                ((Integer) obj2).intValue();
                NavBarAppKt.NavBarApp(mq1Var, (mi0) obj, vd6.m11838V(i2 | 1));
                break;
            case 2:
                ny2 ny2Var = (ny2) this.f19805c;
                int i3 = this.f19804b;
                ((Integer) obj2).getClass();
                ny2Var.m8898a(vd6.m11838V(i3 | 1), (mi0) obj);
                break;
            case 3:
                yp1 yp1Var = (yp1) this.f19805c;
                int i4 = this.f19804b;
                ((Integer) obj2).intValue();
                qs5.m10096a(yp1Var, (mi0) obj, vd6.m11838V(i4 | 1));
                break;
            default:
                fv3 fv3Var = (fv3) this.f19805c;
                int i5 = this.f19804b;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    gl4.m6037b((String) fv3Var.invoke(Integer.valueOf(i5)), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var2, 0, 0, 262142);
                }
                break;
        }
        return ju4Var;
    }
}
