package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ix1 implements p44 {

    /* JADX INFO: renamed from: b */
    public static final ix1 f21855b = new ix1(0);

    /* JADX INFO: renamed from: c */
    public static final ix1 f21856c = new ix1(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21857a;

    public /* synthetic */ ix1(byte b) {
        this.f21857a = b;
    }

    @Override // p000.p44
    /* JADX INFO: renamed from: a */
    public final lb5 mo5797a(long j, df2 df2Var, ky0 ky0Var) {
        switch (this.f21857a) {
            case 0:
                float fMo3579U = ky0Var.mo3579U(30.0f);
                return new h63(new jl3(0.0f, -fMo3579U, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo3579U));
            case 1:
                float fMo3579U2 = ky0Var.mo3579U(30.0f);
                return new h63(new jl3(-fMo3579U2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fMo3579U2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new h63(AbstractC0647fd.m5672j(0L, j));
        }
    }

    public String toString() {
        switch (this.f21857a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
