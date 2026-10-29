package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct1 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16443a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f16444b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f16445c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f16446d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16447e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f16448f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f16449g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f16450h;

    public /* synthetic */ ct1(byte b) {
        this.f16443a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16443a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                qe3 qe3Var = (qe3) this.f16447e;
                wp1 wp1Var = (wp1) this.f16448f;
                long j = this.f16445c;
                List list = (List) this.f16449g;
                boolean z = this.f16444b;
                yp1 yp1Var = (yp1) this.f16450h;
                int i = this.f16446d;
                ((Integer) obj2).getClass();
                AbstractC0647fd.m5666d(qe3Var, wp1Var, j, list, z, yp1Var, (mi0) obj, vd6.m11838V(i | 1));
                break;
            default:
                a84 a84Var = (a84) this.f16447e;
                nv2 nv2Var = (nv2) this.f16448f;
                nt2 nt2Var = (nt2) this.f16449g;
                u74 u74Var = (u74) this.f16450h;
                boolean z2 = this.f16444b;
                long j2 = this.f16445c;
                int i2 = this.f16446d;
                ((Integer) obj2).getClass();
                a84Var.m136b(nv2Var, nt2Var, u74Var, z2, j2, (mi0) obj, vd6.m11838V(i2 | 1));
                break;
        }
        return ju4Var;
    }
}
