package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a94 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f192a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ float f193b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ nl3 f194c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ tx3 f195d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ yp1 f196e;

    public /* synthetic */ a94(byte b) {
        this.f192a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        float fMo3369a;
        byte b = this.f192a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                float f = this.f193b;
                nl3 nl3Var = this.f194c;
                tx3 tx3Var = this.f195d;
                yp1 yp1Var = this.f196e;
                C1370yj c1370yj = (C1370yj) obj;
                float fAbs = Math.abs(((Number) c1370yj.f35255e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                d83 d83Var = c1370yj.f35255e;
                if (fAbs < fAbs2) {
                    zp0.m13678j(c1370yj, tx3Var, yp1Var, ((Number) d83Var.getValue()).floatValue() - nl3Var.f25933a);
                    nl3Var.f25933a = ((Number) d83Var.getValue()).floatValue();
                } else {
                    float fM13683o = zp0.m13683o(((Number) d83Var.getValue()).floatValue(), f);
                    zp0.m13678j(c1370yj, tx3Var, yp1Var, fM13683o - nl3Var.f25933a);
                    c1370yj.m13145a();
                    nl3Var.f25933a = fM13683o;
                }
                break;
            default:
                float f2 = this.f193b;
                nl3 nl3Var2 = this.f194c;
                tx3 tx3Var2 = this.f195d;
                yp1 yp1Var2 = this.f196e;
                C1370yj c1370yj2 = (C1370yj) obj;
                float fM13683o2 = zp0.m13683o(((Number) c1370yj2.f35255e.getValue()).floatValue(), f2);
                float f3 = fM13683o2 - nl3Var2.f25933a;
                try {
                    fMo3369a = tx3Var2.mo3369a(f3);
                } catch (CancellationException unused) {
                    c1370yj2.m13145a();
                    fMo3369a = 0.0f;
                }
                yp1Var2.invoke(Float.valueOf(fMo3369a));
                if (Math.abs(f3 - fMo3369a) > 0.5f || fM13683o2 != ((Number) c1370yj2.f35255e.getValue()).floatValue()) {
                    c1370yj2.m13145a();
                }
                nl3Var2.f25933a += fMo3369a;
                break;
        }
        return ju4Var;
    }
}
