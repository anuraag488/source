package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: bg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0490bg implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15248a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f15249b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f15250c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15251d;

    public /* synthetic */ C0490bg(byte b) {
        this.f15248a = b;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bb  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f15248a;
        ju4 ju4Var = ju4.f22634a;
        boolean z = true;
        switch (b) {
            case 0:
                c33 c33Var = (c33) this.f15251d;
                boolean z2 = this.f15249b;
                boolean z3 = this.f15250c;
                q14 q14Var = (q14) obj;
                long jMo3840a = c33Var.mo3840a();
                q14Var.mo4898a(z04.f35677a, new y04(z2 ? uu1.f32176b : uu1.f32177c, jMo3840a, z3 ? x04.f33900a : x04.f33902c, (9223372034707292159L & jMo3840a) != 9205357640488583168L));
                break;
            default:
                boolean z4 = this.f15249b;
                boolean z5 = this.f15250c;
                a44 a44Var = (a44) this.f15251d;
                vg2 vg2Var = (vg2) obj;
                if (!z4) {
                    mz3.m8469k(vg2Var, null, new fv3((byte) 18), 3);
                }
                od1 od1Var = (od1) vg2Var.f32595b.mo2998b(pd1.m9499d());
                if (z62.m13387o(od1Var.f26639d.mo9873f(), Boolean.FALSE)) {
                    C1127s c1127s = new C1127s((byte) 22);
                    c1127s.f29778b = od1Var;
                    VarHandle.storeStoreFence();
                    mz3.m8469k(vg2Var, null, c1127s, 3);
                }
                mz3.m8469k(vg2Var, null, new fv3((byte) 19), 3);
                pg0 pg0Var = se0.f30197j;
                C1419zv c1419zv = new C1419zv((byte) 2);
                c1419zv.f36399b = z5;
                c1419zv.f36400c = a44Var;
                VarHandle.storeStoreFence();
                mz3.m8469k(vg2Var, pg0Var, c1419zv, 2);
                nc4 nc4Var = pd1.f27531c;
                aj0 aj0Var = vg2Var.f32595b;
                if (((Boolean) aj0Var.mo2998b(nc4Var)).booleanValue()) {
                    z = false;
                } else if (!((C0950nl) aj0Var.mo2998b(AbstractC0987ol.m9168a())).f25920a) {
                    a44 a44Var2 = (a44) aj0Var.mo2998b(h44.m6217a());
                    tt2 tt2Var = cv0.f16504b;
                    ic2[] ic2VarArr = cv0.f16503a;
                    if (((Boolean) tt2Var.m11153t(a44Var2, ic2VarArr[0])).booleanValue()) {
                        if (!((Boolean) cv0.f16505c.m11153t((a44) aj0Var.mo2998b(h44.m6217a()), ic2VarArr[1])).booleanValue()) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                pg0 pg0Var2 = y62.f34933k;
                be0 be0Var = new be0();
                be0Var.f15222a = z;
                VarHandle.storeStoreFence();
                mz3.m8469k(vg2Var, pg0Var2, be0Var, 2);
                break;
        }
        return ju4Var;
    }
}
