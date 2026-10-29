package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class og0 extends C1097r6 implements mq1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ byte f26678h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f26678h = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26678h;
        ju4 ju4Var = ju4.f22634a;
        Object obj3 = this.f29031a;
        switch (b) {
            case 0:
                pg0 pg0Var = (pg0) obj3;
                pg0Var.m9513b(((Number) obj2).intValue(), (mi0) obj);
                break;
            case 1:
                iy3 iy3Var = (iy3) obj3;
                lb5.m7910S(iy3Var.f21883J.m5872c(), null, null, new C0968o2(iy3Var, ((jx4) obj).f22730a, null, (byte) 2), 3);
                break;
            default:
                iy3 iy3Var2 = (iy3) obj3;
                lb5.m7910S(iy3Var2.f21883J.m5872c(), null, null, new C0968o2(iy3Var2, ((jx4) obj).f22730a, null, (byte) 3), 3);
                break;
        }
        return ju4Var;
    }
}
