package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q10 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28136a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ d64 f28137b;

    public /* synthetic */ q10(byte b) {
        this.f28136a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f28136a;
        ju4 ju4Var = ju4.f22634a;
        d64 d64Var = this.f28137b;
        switch (b) {
            case 0:
                ((Float) obj).getClass();
                return Float.valueOf(((Number) d64Var.f16818b.invoke()).floatValue());
            case 1:
                jp3 jp3Var = (jp3) obj;
                C0940nb c0940nb = d64Var.f16820d;
                float fM13399h = ((z73) c0940nb.f25612i).m13399h();
                float fM11655e = c0940nb.m8670h().m11655e();
                float f = fM13399h < fM11655e ? fM11655e - fM13399h : 0.0f;
                jp3Var.m7258l(f > 0.0f ? (Float.intBitsToFloat((int) (jp3Var.f22503o & 4294967295L)) + f) / Float.intBitsToFloat((int) (jp3Var.f22503o & 4294967295L)) : 1.0f);
                jp3Var.m7262u(zp0.m13673e(0.5f, 0.0f));
                return ju4Var;
            default:
                jp3 jp3Var2 = (jp3) obj;
                C0940nb c0940nb2 = d64Var.f16820d;
                float fM13399h2 = ((z73) c0940nb2.f25612i).m13399h();
                float fM11655e2 = c0940nb2.m8670h().m11655e();
                float f2 = fM13399h2 < fM11655e2 ? fM11655e2 - fM13399h2 : 0.0f;
                jp3Var2.m7258l(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (jp3Var2.f22503o & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & jp3Var2.f22503o))) : 1.0f);
                jp3Var2.m7262u(zp0.m13673e(0.5f, 0.0f));
                return ju4Var;
        }
    }
}
