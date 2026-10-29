package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cx4 {

    /* JADX INFO: renamed from: a */
    public ii1 f16581a;

    /* JADX INFO: renamed from: b */
    public AbstractC0654fk f16582b;

    /* JADX INFO: renamed from: c */
    public AbstractC0654fk f16583c;

    /* JADX INFO: renamed from: d */
    public AbstractC0654fk f16584d;

    /* JADX INFO: renamed from: e */
    public float f16585e;

    /* JADX INFO: renamed from: a */
    public final AbstractC0654fk m4227a(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2) {
        AbstractC0654fk abstractC0654fkMo4035c = this.f16583c;
        if (abstractC0654fkMo4035c == null) {
            abstractC0654fkMo4035c = abstractC0654fk.mo4035c();
            this.f16583c = abstractC0654fkMo4035c;
        }
        int iMo4034b = abstractC0654fkMo4035c.mo4034b();
        int i = 0;
        while (true) {
            AbstractC0654fk abstractC0654fk3 = this.f16583c;
            if (i >= iMo4034b) {
                if (abstractC0654fk3 != null) {
                    return abstractC0654fk3;
                }
                z62.m13366Y("velocityVector");
                throw null;
            }
            if (abstractC0654fk3 == null) {
                z62.m13366Y("velocityVector");
                throw null;
            }
            ii1 ii1Var = this.f16581a;
            abstractC0654fk.getClass();
            abstractC0654fk3.mo3610e(ii1Var.mo5963i(j, abstractC0654fk2.mo3608a(i)), i);
            i++;
        }
    }
}
