package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: md */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0905md implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24821a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f24822b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24823c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f24824d;

    public /* synthetic */ C0905md(byte b) {
        this.f24821a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24821a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1030pd.m9494a((c33) this.f24823c, (nt2) this.f24824d, this.f24822b, (mi0) obj, vd6.m11838V(1));
                break;
            default:
                long j = this.f24822b;
                e73 e73Var = (e73) this.f24823c;
                pg0 pg0Var = (pg0) this.f24824d;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    xl4 xl4Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24278b.f22582m;
                    ne0 ne0Var = new ne0((byte) 9);
                    ne0Var.f25728b = e73Var;
                    ne0Var.f25729c = pg0Var;
                    VarHandle.storeStoreFence();
                    zt5.m13774e(j, xl4Var, vd6.m11834R(417635459, ne0Var, ir1Var), ir1Var, 384);
                }
                break;
        }
        return ju4Var;
    }
}
