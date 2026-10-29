package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ae0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14399a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f14400b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14401c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14402d;

    public /* synthetic */ ae0(byte b) {
        this.f14399a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14399a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                boolean z = this.f14400b;
                lu2 lu2Var = (lu2) this.f14401c;
                xb4 xb4Var = (xb4) this.f14402d;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    Boolean boolValueOf = Boolean.valueOf(z);
                    db4 db4VarMo7285b = lu2Var.mo7285b();
                    C0928n c0928n = new C0928n((byte) 3);
                    c0928n.f25353b = xb4Var;
                    VarHandle.storeStoreFence();
                    y42.m12826F(boolValueOf, null, db4VarMo7285b, null, vd6.m11834R(-379350971, c0928n, ir1Var), ir1Var, 24576);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                zc6.m13518c(this.f14400b, (nt2) this.f14401c, (nv2) this.f14402d, (mi0) obj, vd6.m11838V(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                oh6.m9101g((od1) this.f14401c, this.f14400b, (yp1) this.f14402d, (mi0) obj, vd6.m11838V(1));
                break;
            default:
                ((Integer) obj2).getClass();
                n40.m8492a((en3) this.f14401c, (nt2) this.f14402d, this.f14400b, (mi0) obj, vd6.m11838V(1));
                break;
        }
        return ju4Var;
    }
}
