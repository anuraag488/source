package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: sl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1149sl implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30360a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ sw2 f30361b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sw2 f30362c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ lt0 f30363d;

    public /* synthetic */ C1149sl(byte b) {
        this.f30360a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f30360a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                sw2 sw2Var = this.f30361b;
                sw2 sw2Var2 = this.f30362c;
                lt0 lt0Var = this.f30363d;
                kz3 kz3Var = (kz3) obj;
                for (C1112rl c1112rl : hb0.m6315a1((List) sw2Var.getValue(), new vl1((byte) 7))) {
                    C1053q c1053q = new C1053q((byte) 7);
                    c1053q.f28113b = c1112rl;
                    VarHandle.storeStoreFence();
                    at1 at1Var = new at1((byte) 2);
                    at1Var.f14855b = c1112rl;
                    at1Var.f14856c = sw2Var2;
                    at1Var.f14857d = lt0Var;
                    VarHandle.storeStoreFence();
                    kz3Var.m7753a(c1053q, new pg0(-1167274671, true, at1Var));
                }
                kz3Var.m7753a(null, se0.f30193f);
                break;
            default:
                sw2 sw2Var3 = this.f30361b;
                sw2 sw2Var4 = this.f30362c;
                lt0 lt0Var2 = this.f30363d;
                C1149sl c1149sl = new C1149sl((byte) 0);
                c1149sl.f30361b = sw2Var3;
                c1149sl.f30362c = sw2Var4;
                c1149sl.f30363d = lt0Var2;
                VarHandle.storeStoreFence();
                mz3.m8469k((vg2) obj, null, c1149sl, 3);
                break;
        }
        return ju4Var;
    }
}
