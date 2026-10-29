package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h91 extends ue2 implements wp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f20446i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ b54 f20447j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h91(b54 b54Var, byte b) {
        super(0);
        this.f20446i = b;
        this.f20447j = b54Var;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f20446i;
        b54 b54Var = this.f20447j;
        switch (b) {
            case 0:
                return b54Var;
            default:
                d83 d83Var = b54Var.f15090b;
                Boolean bool = Boolean.FALSE;
                d83Var.setValue(bool);
                b54Var.m3458c(false);
                C1372yl c1372yl = b54Var.f15091c;
                ((d83) c1372yl.f35304a).setValue(bool);
                ((d83) c1372yl.f35306c).setValue(bool);
                ((d83) c1372yl.f35308e).setValue(bool);
                ((d83) c1372yl.f35310g).setValue(bool);
                b54Var.f15093e = pb0.f27500g;
                b54Var.f15094f = 1.0f;
                b54Var.f15095g = 1.0f;
                lx4 lx4Var = b54Var.f15098j;
                if (lx4Var != null) {
                    AbstractC0990oo.m9206a0(null, lx4Var.f24448d);
                    lx4Var.f24449e = 0;
                }
                b54Var.f15096h = to4.f31292b;
                b54Var.f15097i = 0L;
                return ju4.f22634a;
        }
    }
}
