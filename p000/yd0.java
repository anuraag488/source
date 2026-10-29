package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yd0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35122a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pk4 f35123b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ pg0 f35124c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f35125d;

    public /* synthetic */ yd0(byte b) {
        this.f35122a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35122a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                pk4 pk4Var = this.f35123b;
                pg0 pg0Var = this.f35124c;
                int i = this.f35125d;
                ((Integer) obj2).getClass();
                vd6.m11842a(pk4Var, pg0Var, (mi0) obj, vd6.m11838V(i | 1));
                break;
            default:
                pk4 pk4Var2 = this.f35123b;
                pg0 pg0Var2 = this.f35124c;
                int i2 = this.f35125d;
                ((Integer) obj2).getClass();
                d24.m4300a(pk4Var2, pg0Var2, (mi0) obj, vd6.m11838V(i2 | 1));
                break;
        }
        return ju4Var;
    }
}
