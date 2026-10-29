package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: zv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1419zv implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36398a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f36399b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f36400c;

    public /* synthetic */ C1419zv(byte b) {
        this.f36398a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        switch (this.f36398a) {
            case 0:
                kh0 kh0Var = (kh0) this.f36400c;
                boolean z = this.f36399b;
                ((C1308wv) kh0Var.f17656a).setEnabled(z);
                ((C1270vv) kh0Var.f17657b).m4818g(z);
                C0469aw c0469aw = new C0469aw((byte) 0);
                c0469aw.f14908b = kh0Var;
                VarHandle.storeStoreFence();
                return c0469aw;
            case 1:
                th0 th0Var = (th0) this.f36400c;
                th0Var.m11049n(this.f36399b);
                C0469aw c0469aw2 = new C0469aw((byte) 1);
                c0469aw2.f14908b = th0Var;
                VarHandle.storeStoreFence();
                return c0469aw2;
            default:
                boolean z2 = this.f36399b;
                a44 a44Var = (a44) this.f36400c;
                kz3 kz3Var = (kz3) obj;
                kz3Var.m7753a(null, se0.f30198k);
                if (z2) {
                    ch0 ch0Var = new ch0((byte) 5);
                    ch0Var.f16014b = a44Var;
                    VarHandle.storeStoreFence();
                    kz3Var.m7753a(null, new pg0(676759408, true, ch0Var));
                }
                return ju4.f22634a;
        }
    }
}
