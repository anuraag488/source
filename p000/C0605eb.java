package p000;

/* JADX INFO: renamed from: eb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0605eb implements tx3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17939a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f17940b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f17941c;

    public /* synthetic */ C0605eb(byte b) {
        this.f17939a = b;
    }

    @Override // p000.tx3
    /* JADX INFO: renamed from: a */
    public final float mo3369a(float f) {
        switch (this.f17939a) {
            case 0:
                C0719hb c0719hb = (C0719hb) this.f17940b;
                float fM8673k = c0719hb.f20462J.m8673k(f);
                float fM13399h = fM8673k - ((z73) c0719hb.f20462J.f25612i).m13399h();
                ((C0903mb) this.f17941c).m8259a(fM8673k, 0.0f);
                return fM13399h;
            case 1:
                vy3 vy3Var = (vy3) this.f17940b;
                if (Math.abs(f) == 0.0f || ((Boolean) vy3Var.f32965h.invoke()).booleanValue()) {
                    return vy3Var.m12032e(vy3Var.m12035h(((ty3) this.f17941c).m11196a(2, vy3Var.m12033f(vy3Var.m12036i(f)))));
                }
                throw new bi1("The fling animation was cancelled", (byte) 0);
            default:
                C0940nb c0940nb = ((d64) this.f17940b).f16820d;
                float fM10674o = sc6.m10674o((Float.isNaN(((z73) c0940nb.f25612i).m13399h()) ? 0.0f : ((z73) c0940nb.f25612i).m13399h()) + f, c0940nb.m8670h().m11655e(), c0940nb.m8670h().m11654d());
                float fM13399h2 = fM10674o - ((z73) c0940nb.f25612i).m13399h();
                ((C0903mb) this.f17941c).m8259a(fM10674o, 0.0f);
                return fM13399h2;
        }
    }
}
