package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zg0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36058a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ a44 f36059b;

    public /* synthetic */ zg0(byte b) {
        this.f36058a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f36058a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                a44 a44Var = this.f36059b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                tt2 tt2Var = pd1.f27532d;
                ic2 ic2Var = pd1.f27529a[1];
                tt2Var.m11144C(a44Var, bool);
                break;
            case 1:
                a44 a44Var2 = this.f36059b;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                tt2 tt2Var2 = gh4.f19796b;
                ic2 ic2Var2 = gh4.f19795a[0];
                tt2Var2.m11144C(a44Var2, bool2);
                break;
            case 2:
                a44 a44Var3 = this.f36059b;
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                tt2 tt2Var3 = cv0.f16505c;
                ic2 ic2Var3 = cv0.f16503a[1];
                tt2Var3.m11144C(a44Var3, bool3);
                break;
            case 3:
                ih0 ih0Var = ih0.f21417c;
                tt2 tt2Var4 = wx2.f33822b;
                ic2 ic2Var4 = wx2.f33821a[0];
                tt2Var4.m11144C(this.f36059b, (ie1) obj);
                break;
            case 4:
                wx2.m12437e(this.f36059b, (List) obj);
                break;
            case 5:
                a44 a44Var4 = this.f36059b;
                wx2.m12437e(a44Var4, hb0.m6311W0(wx2.m12433a(a44Var4), new vx2((sn0) obj, null)));
                break;
            case 6:
                a44 a44Var5 = this.f36059b;
                kz3 kz3Var = (kz3) obj;
                for (Object obj2 : xx2.f34695g) {
                    C1113rm c1113rm = new C1113rm((byte) 3);
                    c1113rm.f29403b = obj2;
                    c1113rm.f29404c = a44Var5;
                    VarHandle.storeStoreFence();
                    kz3Var.m7753a(null, new pg0(-1568955183, true, c1113rm));
                }
                break;
            case 7:
                a44 a44Var6 = this.f36059b;
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                tt2 tt2Var5 = wx2.f33823c;
                ic2 ic2Var5 = wx2.f33821a[1];
                tt2Var5.m11144C(a44Var6, bool4);
                break;
            default:
                a44 a44Var7 = this.f36059b;
                zg0 zg0Var = new zg0((byte) 6);
                zg0Var.f36059b = a44Var7;
                VarHandle.storeStoreFence();
                mz3.m8469k((vg2) obj, null, zg0Var, 3);
                break;
        }
        return ju4Var;
    }
}
